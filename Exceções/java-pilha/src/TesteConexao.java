
public class TesteConexao {

	public static void main(String[] args) throws Exception {
		
		try(Conexao con = new Conexao()){
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Erro na conex?o");
		}
		
		
		//---------------------------------------------
//		/*
//		Conexao con =null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch(IllegalStateException ex){
//			System.out.println("Deu erro na conex?o");
//		}finally {
//			con.fecha();
//		*/}

	}

}
