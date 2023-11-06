package locadora.model_entities;

import java.time.LocalDateTime;

public class AluguelDeCarro {
    private LocalDateTime inicio;
    private LocalDateTime fim;

    private Vehicle vehicle;
    private Fatura fatura;

    public AluguelDeCarro() {

    }
}
