import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     ArrayList<Cliente> clientes = new ArrayList<Cliente>();
     System.out.println("CADASTROS\n");

     for(int i=0; i<10;i++){
      String nome, cpf;
      System.out.printf("\n CADASTROS %d\n", (i + 1));
      System.out.println("\nDigite seu nome:");
      nome= in.nextLine();
      System.out.println("\nDigite seu cpf:");
      cpf= in.nextLine();

      Cliente cliente = new Cliente(nome,cpf);
      clientes.add(cliente);
     }

  for (int i = 0; i<clientes.size(); i++){
  System.out.printf("%d------------------------\nNome: %s\nCPF: %s\n-----------------\n", (i+1), clientes.get(i).getNome(), clientes.get(i).getCpf());
}
}
}