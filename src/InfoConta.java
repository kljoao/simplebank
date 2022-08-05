
public class InfoConta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public boolean saque (double valor) {
		if(saldo < valor) {
			System.out.println("Seu saldo é insuficiente");
			return false;
		}
		else {
			saldo -= valor;
			return true;
		}
	}
	
	public boolean transferencia(double valor, InfoConta destino) {
		if(saldo < valor) {
			System.out.println("Seu saldo é insuficiente");
			return false;
		}
		else {
			saldo -= valor;
			destino.saldo += valor;
			return true;
		}
	}
}