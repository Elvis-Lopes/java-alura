package bytebankencapsulado;

public class TesteGetSet {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		Conta conta = new Conta(1234, 54353);
		
		conta.setTitular(paulo);
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());

	}

}
