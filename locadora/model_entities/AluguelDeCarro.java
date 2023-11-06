package locadora.model_entities;

import java.time.LocalDateTime;

public class AluguelDeCarro {
    private LocalDateTime inicio;
    private LocalDateTime fim;

    private Vehicle vehicle;
    private Fatura fatura;

    public AluguelDeCarro() {

    }

    public AluguelDeCarro(LocalDateTime inicio, LocalDateTime fim, Vehicle vehicle, Fatura fatura) {
        this.inicio = inicio;
        this.fim = fim;
        this.vehicle = vehicle;
        this.fatura = fatura;

    }

        public LocalDateTime getInicio() {
        return inicio;
    }

        public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

        public LocalDateTime getFim() {
        return fim;
    }

        public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

        public Vehicle getVehicle() {
        return vehicle;
    }

        public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

        public Fatura getFatura() {
        return fatura;
    }

        public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }


}
