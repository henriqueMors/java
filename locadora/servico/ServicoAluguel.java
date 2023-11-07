package locadora.servico;

import java.time.Duration;

import locadora.model_entities.AluguelDeCarro;
import locadora.model_entities.Fatura;

public class ServicoAluguel {
    private double porDia;
    private double porHora;
    private Tax tax;

    public ServicoAluguel(double porDia, double porHora, Tax tax) {
        this.porDia = porDia;
        this.porHora = porHora;
        this.tax = tax;
    }


    public double getPorDia() {
        return porDia;
    }


    public void setPorDia(double porDia) {
        this.porDia = porDia;
    }


    public double getPorHora() {
        return porHora;
    }


    public void setPrecoPorHora(double precoPorHora) {
        this.porHora = precoPorHora;
    }


    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public void processoFatura(AluguelDeCarro AluguelDeCarro) {

        double minuto = Duration.between(AluguelDeCarro.getInicio(), AluguelDeCarro.getFim()).toMinutes();
        double hora = minuto / 60.0;

        double pagBasico;
        if (hora <=12.0) {
            pagBasico = porHora * Math.ceil(hora);
        }
        else {
            pagBasico = porDia * Math.ceil(hora / 24.0);
        }

        double tax = taxServico.tax(pagBasico);

        AluguelDeCarro.setFatura(new Fatura(pagBasico, tax));
    }

}
