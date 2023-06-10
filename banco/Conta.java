package banco;

public class Conta {
	private int numero;
	private String detentor;
	private double saldo;

	public Conta (int numero, String detentor) {
		this.numero = numero;
		this.detentor = detentor;
	}

	public Conta (int numero, String detentor, double depostitoInicial) {
		this.numero = numero;
		this.detentor = detentor;
		Deposito(depostitoInicial);
	}

	public int getNumero() { //setNumero foi apagado para que o numero nao seja alterado
		return numero;
	}

	public String getDetentor() {
		return detentor;
	}

	public void setDetentor(String detentor) {
		this.detentor = detentor;
	}

	public double getSaldo() { // setSaldo foi apagado para que o saldo seja alterado somente por insercao ou saque
		return saldo;
	}

	public void Deposito(double valor) {
		saldo += valor;
	}

	public void Saque(double valor) {
		saldo -= valor + 5.00;
	}


}