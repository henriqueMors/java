package locadora.servico;

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
        AluguelDeCarro.setFatura(new Fatura(50.0, 10.0));
    }

}
