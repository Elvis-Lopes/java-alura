package bytebankcomposto;

public class TesteClasse {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		paulo.setCpf("382718392");
		paulo.setProfissao("Analista de TI");
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = paulo;
		
		contaDoPaulo.depositar(100);
		
		System.out.println(contaDoPaulo.titular.getCpf());
	}

}
