
public class TesteContas {

	public static void main(String[] args) {
		//Conta conta = new Conta(111,111);
		//Conta conta2 = new Conta(222, 222);
		ContaCorrente cc = new ContaCorrente(333, 333);
		ContaPoupanca cp = new ContaPoupanca(444, 0);
		
		cc.deposita(100);
		System.out.println("Valor da CC após deposito " + cc.getSaldo());
		
		
	}

}
