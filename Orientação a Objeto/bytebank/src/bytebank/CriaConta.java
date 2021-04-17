package bytebank;

import java.util.Scanner;

public class CriaConta {

	public static void main(String[] args) {
	Conta primeiraConta = new Conta();
	primeiraConta.depositar(100);
	Scanner input = new Scanner(System.in);
	
	//primeiraConta.setSaldo(200);
	System.out.print("Digite o nome do titular: ");
	primeiraConta.setTitular(input.next());
	
	System.out.println("Titular:" + primeiraConta.getTitular() + "\n" +
			"Conta" + primeiraConta.getNumeroDaConta() + "\n" +
			"Saldo: " + primeiraConta.getSaldo());
	
	primeiraConta.sacar(100);
	
	System.out.println("Titular:" + primeiraConta.getTitular() + "\n" +
			"Saldo: " + primeiraConta.getSaldo());
	
	primeiraConta.sacar(100);
	System.out.println("Titular:" + primeiraConta.getTitular() + "\n" +
			"Saldo: " + primeiraConta.getSaldo());
	/*
	Conta segundaConta = new Conta();
	segundaConta.setSaldo(50);
	
	System.out.println(segundaConta.getSaldo());
	*/
	}

}
