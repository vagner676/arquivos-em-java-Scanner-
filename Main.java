import java.io.File;
import java.util.Scanner;

class Main {
  
public static void main(String[] args) throws Exception {
Scanner teclado = new Scanner(System.in);
System.out.println("nome do arquivo:  ");
String nomeArquivo = teclado.nextLine();
processarArquivo(nomeArquivo);
  }

  public static void processarArquivo(String nomeArquivo)throws Exception {
    Scanner leitor = new Scanner(new File(nomeArquivo));
    String linha;
    while (leitor.hasNextLine()){
      linha = leitor.nextLine();
     if (!linha.startsWith("//")){
      System.out.println(linha);
    }
      }
   leitor.close();
    
  }
}