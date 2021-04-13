
public class TesteCondicional2 {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadeDePessoas = 1;
		
		if(idade >= 18 || quantidadeDePessoas >= 2) {
			System.out.println("Você pode entrar");
		}else {
			System.out.println("Você não pode entrar por ser menor de idade e por não estar"
					+ "acompanhado");
		}
	}

}
