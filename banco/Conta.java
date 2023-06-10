package banco;


public class Conta{
	private int numero;
	private String detentor;
	private double saldo;

	public Conta (int numero, String detentor) {
		this.numero = numero;
		this.detentor = detentor;

	}
	public Conta (int numero, String detentor, double saldo) {
		this.numero = numero;
		this.detentor = detentor;
		this.saldo = saldo;
	}
	
}