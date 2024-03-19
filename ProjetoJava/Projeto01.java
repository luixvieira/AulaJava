package pacotao;

import java.util.Scanner;

public class Projeto01 {

public static void main(String args[]) {
	
	Scanner leitorDeDados = new Scanner(System.in);
	
	System.out.println("Digite Seu nome");
	String nome = leitorDeDados.next();

	System.out.println(nome + ", crie sua senha");
	String senha = leitorDeDados.next();
	
	System.out.println(nome + ", informe seu endereço");
	String endereço = leitorDeDados.next();
	
	Cliente Cliente= new Cliente(nome, senha, endereço);
	
	System.out.println("Login");
	String login = leitorDeDados.next();
	System.out.println("Senha");
	String S = leitorDeDados.next();
	
	boolean valido = Cliente.validaLogin(login,S)
			

}

}

