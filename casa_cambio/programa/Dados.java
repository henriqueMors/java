package casa_cambio.programa;

public class Dados {
    public double cotacao;
    public double compra;

    public double valor() {
        return cotacao * compra;
    }

    public double taxa() {
        return compra + (compra * 0.6) / 100;
    }

    public double total() {
        return valor() + taxa();
    }

}
