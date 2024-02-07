package tarefa3.ex4;

public class Principal {
  public static void main(String[] args) {
    MedidorTemperatura mt = new MedidorTemperatura();
    mt.setTemperatura(26);
    System.out.println("Temperatura: " + mt.getTemperatura());
  }
}
