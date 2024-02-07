
public class Carro{
  public String marca;
  public String modelo;
  public String cor;
  public String placa;

  public Carro(String marca, String modelo, String  cor, String placa){
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.placa = placa;
  }
  public String getMarca(){
    return marca;
  }
  public void setMarca(String marca){
    this.marca = marca;
   }
   public String getModelo(){
    return modelo;
   }
   public void setModel(String modelo){
    this.modelo = modelo;
   }
   public String getCor(){
    return cor;
   }
   public void setCor(String cor){
    this.cor = cor;
   }
   public String getPlaca(){
    return placa;
   }
   public void setPlaca(String placa){
    this.placa = placa;
   }
  }