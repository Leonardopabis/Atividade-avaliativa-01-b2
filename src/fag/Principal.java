package fag;
import java.util.ArrayList;
import java.util.Scanner;

import fag.objetos.*;

public class Principal {
	static ArrayList<Carro> garagem = new ArrayList<>();
	static ArrayList<String> modelo = new ArrayList<>();
	static ArrayList<String> cor = new ArrayList<>();
	static ArrayList<String> nome = new ArrayList<>();
	static ArrayList<Integer> vaga = new ArrayList<>();
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
			System.out.println("4 - Filtrar por modelo");
			System.out.println("5 - Filtrar por cor");
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
			}else if (valor == 4) {
				filtrarModelo();
			}else if (valor == 5) {
				filtrarCor();
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
		if (vaga.contains(carro.getVaga())) {
			System.out.println("A vaga já está ocupada");
			voltarAoMenu();
		}else {
			garagem.add(carro);
			modelo.add(carro.getModelo());
			cor.add(carro.getCor());
			nome.add(carro.getNome());
			vaga.add(carro.getVaga());
			voltarAoMenu();
		}
	}
	
	public static void listarCarro() {
		System.out.println("Listando carros:\n");
		for (int i=0;i<garagem.size();i++) {
			garagem.get(i).listar();
		}
		voltarAoMenu();
	}
	public static void removerCarro() {
		System.out.println("Digite a vaga do carro para remover:");
		int remover = scanner.nextInt();
		scanner.nextLine();
		if (vaga.contains(remover)) {
			int index = vaga.indexOf(remover);
			vaga.remove(index);
			cor.remove(index);
			modelo.remove(index);
			nome.remove(index);
			garagem.remove(index);
			System.out.println("Carro removido da vaga");
		}else {
			System.out.println("A vaga já está vazia");
		}
		voltarAoMenu();
	}
	public static void filtrarCor() {
		System.out.println("Digite a cor para filtrar:\n");
		String filtrarcor = scanner.nextLine();
		if (cor.contains(filtrarcor)) {
			for (int i=0;i<cor.size();i++) {
				if (cor.get(i).equals(filtrarcor)) {
					garagem.get(i).listar();
				}
			}
		}else {
			System.out.println("Não existe carro com essa cor");
		}
		voltarAoMenu();
	}
	
	public static void filtrarModelo() {
		System.out.println("Digite o modelo para filtrar:\n");
		String filtrarcor = scanner.nextLine();
		if (modelo.contains(filtrarcor)) {
			for (int i=0;i<modelo.size();i++) {
				if (modelo.get(i).equals(filtrarcor)) {
					garagem.get(i).listar();
				}
			}
		}else {
			System.out.println("Não existe carro com essa cor");
		}
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
