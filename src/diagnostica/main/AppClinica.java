package main;

import java.util.Scanner;

import entidades.Paciente;
import lista.VetPaciente;

public class AppClinica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		VetPaciente vet = iniciaVet(sc);

		int escolha = 0;
		while (escolha != 4) {
			mostraMenu();
			escolha = sc.nextInt();
			switch (escolha) {

			case 1: {
				cadastra(sc, vet);
				break;
			}
			case 2: {
				consulta(sc, vet);
				break;
			}
			case 3: {
				imprimeCadastro(sc, vet);
				break;
			}

			}

		}
		sc.close();
	}

	private static void imprimeCadastro(Scanner sc, VetPaciente vet) {
		// TODO Auto-generated method stub

	}

	private static void consulta(Scanner sc, VetPaciente vet) {
		// TODO Auto-generated method stub

	}

	private static VetPaciente iniciaVet(Scanner sc) {
		System.out.println("Digite a quantidade de pacientes:");
		int tamanho = sc.nextInt();
		return new VetPaciente(tamanho);
	}

	private static void cadastra(Scanner sc, VetPaciente vet) {
		System.out.println("Digite seu nome: ");
		sc.next();
		String nome = sc.nextLine();
		System.out.println("Digite seu cpf: ");
		String cpf = sc.nextLine();
		System.out.println("Digite sua data de nascimento: ");
		String dataNascimento = sc.nextLine();
		System.out.println("Digite seu historico: ");
		String historico = sc.nextLine();
		Paciente paciente = new Paciente(nome, cpf, dataNascimento, historico);
		int valor = vet.inserePaciente(paciente);
		System.out.println("Cadastrado com sucesso!" + valor);

	}

	private static void mostraMenu() {
		System.out.println("1- Cadastrar");
		System.out.println("2- Consultar");
		System.out.println("3- Imprimir Cad	astro");
		System.out.println("4- Sair");
		System.out.println("\nDigite sua escolha: ");
	}

}
