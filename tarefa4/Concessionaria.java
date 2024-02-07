package tarefa4;
import java.util.Scanner;
import java.util.ArrayList;
public class Concessionaria{
public static void main(String[] args){
  
ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

Scanner in = new Scanner(System.in); 

for(int i=0; i<3; i++){
String marca, modelo, ano, preço;

System.out.printf("Insira os dados do Veiculo %d abaixo\n",(i+1));  
System.out.println("Marca:");
marca = in.nextLine();
System.out.println("Modelo:");
modelo = in.nextLine();  
System.out.println("Ano:");
ano = in.nextLine();
System.out.println("Preço:");
preço = in.nextLine();
Veiculo veiculo= new Veiculo(marca, modelo, ano, preço);
veiculos.add(veiculo);
}
for(int i=0; i<veiculos.size();i++){
System.out.printf("---- CARRO CADASTRADO -----\nMarca:%s\nModelo:%s\nAno %s\nPreço:%s\n", veiculos.get(i).getMarca(), veiculos.get(i).getModelo(), veiculos.get(i).getAno(),veiculos.get(i).getPreço());
}
}
}  