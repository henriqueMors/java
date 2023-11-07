package locadora.servico;

import java.time.Duration;

import locadora.model_entities.AluguelDeCarro;
import locadora.model_entities.Fatura;

public class ServicoAluguel {
    private double porDia;
    private double porHora;
    private Tax taxServico;

    public ServicoAluguel(double porDia, double porHora, Tax taxServico) {
        this.porDia = porDia;
        this.porHora = porHora;
        this.taxServico = taxServico;
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
