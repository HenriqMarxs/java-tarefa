package tarefa2.ex6;
public class Aluno {
  public String nome;
  public String matricula;

  public Aluno(String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
}
