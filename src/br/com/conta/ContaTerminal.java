package br.com.conta;


import java.util.Scanner;

public class ContaTerminal {


	public static void main(String[] args) {
		int numero = 0;
		String agencia = "",nomeCliente="";
		double saldo = 0;
		Scanner sc = new Scanner(System.in); // Create a Scanner object
		System.out.print("Por favor, digite o número da conta: "); 
		numero = sc.nextInt(); //next to integers
		System.out.print("Por favor, digite o número da Agência no formato XXX-X: "); 
		agencia = sc.next();
		System.out.print("Por favor, digite o nome do cliente: "); 
		nomeCliente = sc.next();
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s"
				+ ", conta %d e seu saldo %f já está disponível para saque \n",nomeCliente,
				agencia,numero,saldo); //formated output
		sc.close();
		}

}

