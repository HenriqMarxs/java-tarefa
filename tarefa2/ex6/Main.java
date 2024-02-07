package tarefa2.ex6;
import  java.util.Scanner;
public class Main {
  public static void main(String[] args){
  String nome, matricula;
  Scanner in = new Scanner(System.in);

    System.out.println("CADASTROS DE ALUNO\n");
    System.out.println("\nNome do aluno:");
    nome = in.nextLine();
    System.out.println("\nMatricula: ");
    matricula= in.nextLine();
    Aluno aluno= new Aluno(nome,matricula);
    System.out.printf("-------------------------------\nDADOS CADASTRADOS\n Nome: %s\n matricula: %s \n---------------------------", nome, matricula); 
  }
}
 