import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarefa> listaDeTarefas1 = new ArrayList<>();
        Scanner escolha = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 1 para adicionar tarefa.");
            System.out.println("Digite 2 para remover tarefa.");
            System.out.println("Digite 3 para editar tarefa.");
            System.out.println("Digite 4 para listar tarefas.");
            System.out.println("Digite 5 pra marcar como concluída.");
            System.out.println("Digite 6 para sair.");

            int opcao = escolha.nextInt();
            escolha.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricaoTarefa = escolha.nextLine();
                    listaDeTarefas1.add(new Tarefa(descricaoTarefa, false));
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o número da tarefa: ");
                    int numero = escolha.nextInt();
                    if (numero >= 0 && numero < listaDeTarefas1.size()) {
                        listaDeTarefas1.remove(numero);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                    System.out.println("Número inválido!");
                    } break;

                case 3:
                    System.out.println("Digite o número da tarefa: ");
                    int numero2 = escolha.nextInt();
                    escolha.nextLine();
                    if (numero2 >= 0 && numero2 < listaDeTarefas1.size()) {
                        System.out.println("Digite a nova descrição da tarefa: ");
                        String novaDescricao = escolha.nextLine();
                        listaDeTarefas1.get(numero2).setDescricao(novaDescricao);
                        System.out.println("Tarefa editada com sucesso!");
                    } else {
                        System.out.println("Número inválido!");
                    } break;

                case 4:
                    for (int i = 0; i < listaDeTarefas1.size(); i++) {
                        System.out.println(i + " - " + listaDeTarefas1.get(i).toString());
                    } break;

                case 5:
                    System.out.println("Digite o número da tarefa: ");
                    int numeroConcluir = escolha.nextInt();
                    escolha.nextLine();
                    if (numeroConcluir >= 0 && numeroConcluir < listaDeTarefas1.size()) {
                        listaDeTarefas1.get(numeroConcluir).marcarConcluida();
                        System.out.println("Tarefa concluída com sucesso!");
                    } else {
                        System.out.println("Número inválido!");
                    } break;

                case 6:
                    System.out.println("Saindo...");
                    escolha.close();
                    return;

                    default:
                        System.out.println("Opção inválida!");
            }
        }
    }
}