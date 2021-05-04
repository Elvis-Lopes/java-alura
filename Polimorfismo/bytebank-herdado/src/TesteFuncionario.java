
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario("Nico", "28739732", 2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
