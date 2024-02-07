package tarefa4;
public class Veiculo {
  public String marca;
  public String modelo;
  public String ano;
  public String preço;

  public Veiculo(String marca, String modelo, String ano, String preço) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.preço = preço;

  }

  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca){
    this.marca = marca;
   }
   public String getModelo(){
    return modelo;
   }
   public void setModelo(String modelo){
    this.modelo = modelo;
   }
   public String getAno(){
    return ano;
   }
   public void setAno(String ano){
    this.ano = ano;
   }
   public String getPreço(){
    return preço;
   }
   public void setPreço(String preço){
    this.preço = preço;
   }
}
