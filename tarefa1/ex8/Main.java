package ex8;
public class Main {
  public static void main(String[] args){
   String nomes[] = { "Antonio da Silva", "Maria Eduarda", "Carlos Ricardo"};

    System.out.printf("VETOR DE NOMES:\n");

    for(int i=0; i < nomes.length; i++){
        System.out.printf("(%d) %s\n", i + 1, nomes[i]);
    }
  }
}
