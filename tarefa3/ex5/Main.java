package tarefa3.ex5;
import  java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String name, endereco, telefone, email;
    Scanner in = new Scanner(System.in);
    System.out.println("\nNome: ");
    name = in.nextLine();
    System.out.println("\nEndereco: ");
    endereco = in.nextLine();
    System.out.println("\nTelefone: ");
    telefone = in.nextLine();
    System.out.println("\nEmail: ");
    email = in.nextLine();
    Cliente client = new Cliente(name, endereco, telefone, email);
    System.out.printf("\n  ------------Dados de Cliente Registrados  ------------\nNome:%s\nEndereco:%s\nTelefone:%s\nEmail:",name, endereco, telefone, email);
  }
}
