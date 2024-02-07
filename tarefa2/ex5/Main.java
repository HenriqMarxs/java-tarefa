import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    ArrayList<Carro> carros = new ArrayList<Carro>();

    String marca, modelo, cor, placa;
    System.out.println("CADASTRO DE VEICULO\n");
    System.out.println("\nMarca:");
    marca = in.nextLine();
    System.out.println("\nModelo:");
    modelo = in.nextLine();
    System.out.println("\nCor");
    cor = in.nextLine();
    System.out.println("\nPlaca:");
    placa = in.nextLine();
    Carro carro = new Carro(marca, modelo, cor, placa);
    carros.add(carro);
    System.out.printf ("-------------\nMarca %s \nModelo: %s\n----------", carros.get(0).getModelo(), carros.get(0).getMarca());
  }
  
}
