package locadora.model_entities;

public class Fatura {
    private Double pagPadrao;
    private Double tax;

    public Fatura(){

    }

    public Fatura (Double pagPadrao, Double tax) {
        this.pagPadrao = pagPadrao;
        this.tax = tax;
    }

    public Double getPagPadrao() {
        return pagPadrao;
    }

    public void setPagPadrao(Double pagPadrao) {
        this.pagPadrao = pagPadrao;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getPagTotal() {
        return getPagPadrao() - getTax();
    }
}
