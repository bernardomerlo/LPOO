package diagnostica.main;

import java.util.Scanner;

import diagnostica.entidades.Paciente;
import diagnostica.lista.VetPaciente;

public class AppClinica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VetPaciente vet = iniciaVet(sc);

        int escolha = 0;
        while (escolha != 4) {
            mostraMenu();
            escolha = sc.nextInt();
            sc.nextLine();
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
                    imprimeCadastro(vet);
                    break;
                }
            }
        }
        sc.close();
    }

    private static void imprimeCadastro(VetPaciente vet) {
        vet.mostraVetor();
    }

    private static void consulta(Scanner sc, VetPaciente vet) {
        System.out.println("Digite o Cpf que deseja consultar: ");
        String cpf = sc.nextLine();
        int retorno = vet.pesquisa(cpf);
        try {
            System.out.println(vet.getPaciente(retorno).toString());
        } catch (Exception e) {
            System.out.println("Nao existe");
        }
    }

    private static VetPaciente iniciaVet(Scanner sc) {
        System.out.println("Digite a quantidade de pacientes:");
        int tamanho = sc.nextInt();
        return new VetPaciente(tamanho);
    }

    private static void cadastra(Scanner sc, VetPaciente vet) {
        String nome;
        String cpf;
        String dataNascimento;
        String historico;

        do {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite seu cpf: ");
            cpf = sc.nextLine();
            System.out.println("Digite sua data de nascimento: ");
            dataNascimento = sc.nextLine();
            System.out.println("Digite seu histórico: ");
            historico = sc.nextLine();
            if (nome.isEmpty() || cpf.isEmpty() || dataNascimento.isEmpty() || historico.isEmpty()) {
                System.out.println("Todos os campos são obrigatórios. Por favor, preencha todos.");
            }
        } while (nome.isEmpty() || cpf.isEmpty() || dataNascimento.isEmpty() || historico.isEmpty());

        Paciente paciente = new Paciente(nome, cpf, dataNascimento, historico);
        int valor = vet.insere(paciente);

        System.out.println("Cadastrado com sucesso! Valor: " + valor);
    }


    private static void mostraMenu() {
        System.out.println("1- Cadastrar");
        System.out.println("2- Consultar");
        System.out.println("3- Imprimir Cadastro");
        System.out.println("4- Sair");
        System.out.println("\nDigite sua escolha: ");
    }

}
