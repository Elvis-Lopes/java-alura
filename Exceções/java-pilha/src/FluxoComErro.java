
public class FluxoComErro {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        
        try {
        	metodo2();
        }catch(ArithmeticException| NullPointerException | MinhaExecao e) {
        	String msg = e.getMessage();
    		System.out.println("ArithemeticExcepetion " + msg);
    		e.printStackTrace();
    	}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        metodo2();
    }
}
