public class CriaConta{
	
	public static void main(String[] args) {
		
		InfoConta conta1 = new InfoConta();
		conta1.titular = "João Luis";
		conta1.agencia = 563;
		conta1.numero = 13;
		conta1.saldo = 500;
		
		
		InfoConta conta2 = new InfoConta();
		conta2.titular = "Vitoria Silva";
		conta2.agencia = 1278;
		conta2.numero = 8;
		conta2.saldo = 1800;

		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
		System.out.println("--------------");
	}
}