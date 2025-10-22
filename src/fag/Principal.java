package fag;
import java.util.ArrayList;
import java.util.Scanner;

import fag.objetos.*;

public class Principal {
	static ArrayList<Carro> garagem = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	static int valor = 1000;

	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		valor = 0;
		do {
			System.out.println("-----Menu-----");
			System.out.println("1 - Cadastrar carro");
			System.out.println("2 - Listar carros");
			System.out.println("3 - Remover carro");
			System.out.println("0 - Sair");
			System.out.println("");
			int valor = scanner.nextInt();
			scanner.nextLine();
			if (valor == 1) {
				cadastrarCarro();
			}else if (valor == 2) {
				listarCarro();
			}else if (valor == 3) {
				removerCarro();
			}else if (valor == 0) {
				sair();
			}
			else {
				System.out.println("Número inválido, retornando ao menu");
				menu();
			}
		}while(valor != 0);
		
		
	}
	
	public static void cadastrarCarro() {
		Carro carro = new Carro();
		System.out.println("Digite o nome do carro:");
		carro.setNome(scanner.nextLine());
		System.out.println("Digite o nome do modelo:");
		carro.setModelo(scanner.nextLine());
		System.out.println("Digite a cor:");
		carro.setCor(scanner.nextLine());
		System.out.println("Digite a vaga (1-12)");
		carro.setVaga(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Cadastro realizado com sucesso!");
		garagem.add(carro);
		voltarAoMenu();
	}
	
	public static void listarCarro() {
		for (int i=0;i<garagem.size();i++) {
			System.out.println("Listando carros:\n");
			System.out.println(garagem.toString());
			voltarAoMenu();
		}
	}
	public static void removerCarro() {
		System.out.println("Digite a vaga do carro:");
		
		voltarAoMenu();
	}
	public static void sair() {
		System.out.println("Programa fechado");
		System.exit(0);
	}
	public static void voltarAoMenu() {
		System.out.println("Pressione enter para voltar ao menu\n");
		scanner.nextLine();
		menu();
	}
	
}
