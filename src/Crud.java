import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String nome;
        int opcao = 0;


        while (opcao != 5) {
            System.out.println(" [1] PARA CADASTRO\n [2] PARA LISTAR\n [3] PARA REMOVER USUARIO\n [4] PARA EDITAR\n [5] PARA SAIR");
            opcao = leia.nextInt();

            switch (opcao) {


                case 1:
                    System.out.println("CADASTRO DE USUARIO");
                    System.out.println("Digite o seu nome: ");
                    nome = leia.next();
                    lista.add(nome);
                    break;
                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + ": " + "Usuario: " + lista.get(i));

                    }
                    break;
                case 3:
                    System.out.println("DIGITE O NOME PARA REMOVER: ");
                    nome = leia.next();
                    lista.remove(nome);
                    break;

                case 4:
                    System.out.println("DIGITE O NOME PARA EDITAR: ");
                    nome = leia.next();
                    int indice = lista.indexOf(nome); // pega o indice do objeto dentro da lista
                    System.out.println("DIGITE O NOVO NOME: ");
                    nome = leia.next();


                    lista.set(indice, nome);

                    break;
                case 5:
                    System.out.println("SAINDO DO PROGRAMA!");


            }
        }


    }
}