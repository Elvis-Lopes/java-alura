
public class TesteCondicional2 {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadeDePessoas = 1;
		
		if(idade >= 18 || quantidadeDePessoas >= 2) {
			System.out.println("Voc� pode entrar");
		}else {
			System.out.println("Voc� n�o pode entrar por ser menor de idade e por n�o estar"
					+ "acompanhado");
		}
	}

}
