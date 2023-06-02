package casa_cambio.programa;

public class Dados {
    public double cotacao;
    public double compra;

    public double valor() {
        return cotacao * compra;
    }

    public double taxa() {
        return valor() * 0.06;
    }

    public double total() {
        return valor() + taxa();
    }

}
