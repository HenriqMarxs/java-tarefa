package tarefa3.ex5;

public class Cliente {
  String name;
  String endereco;
  String telefone;
  String email;
  public Cliente(String name, String endereco, String telefone, String email) {
    this.name = name;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
  }

  public String getName() {
    return name;
  }
  public void setName(String name){
     this.name = name;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone){
    this.telefone=telefone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }
}




