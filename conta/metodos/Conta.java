package conta.metodos;

public class Conta {

    public int cadastro;
    public String primeiroNome;

    public void novaConta(){
        System.out.println("Conta criada para: " + primeiroNome);
        System.out.println("Conta com limite inicial de R$10,00");
    }
}