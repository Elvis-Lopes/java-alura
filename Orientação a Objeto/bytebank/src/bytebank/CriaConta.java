package bytebank;

import java.util.Scanner;

public class CriaConta {

	public static void main(String[] args) {
	Conta primeiraConta = new Conta();
	Scanner input = new Scanner(System.in);
	
	primeiraConta.setSaldo(200);
	System.out.print("Digite o nome do titular: ");
	primeiraConta.setTitular(input.next());
	System.out.println("Titular:" + primeiraConta.getTitular() + "\n" +
						"Conta" + primeiraConta.getSaldo());
	
	Conta segundaConta = new Conta();
	segundaConta.setSaldo(50);
	
	System.out.println(segundaConta.getSaldo());
	}

}
