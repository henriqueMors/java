package empresa.programa;

public class salario {

    public double sal_bruto;
    public double imposto;
    public double porcentagem;

    public double desconto() {
        return (sal_bruto * porcentagem) / 100;
    }

    public double sal_liq() {
        return sal_bruto - desconto();

    }
    public double aumento() {
        return sal_liq() * porcentagem;

    }
}
