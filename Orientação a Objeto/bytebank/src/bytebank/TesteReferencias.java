package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(300);
		
		System.out.println("O saldo da conta � R$ " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("o saldo da segunda conta � R$ " + segundaConta.getSaldo());
		
		segundaConta.sacar(100);
		System.out.println("novo saldo da segunda conta: " + segundaConta.getSaldo());
		System.out.println("novo saldo da primeira conta: " + primeiraConta.getSaldo());
	}

}
