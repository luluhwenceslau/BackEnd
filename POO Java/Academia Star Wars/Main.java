
import jedi.Jedi;
import jedi.SabreLuz;
import jedi.Forca;
import planeta.Planeta;
import planeta.Academia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int TAM = 4;
        Scanner scanner = new Scanner(System.in);
        Jedi j[] = new Jedi[TAM];
        Academia academia[] = new Academia[2];
        Planeta planeta[] = new Planeta[2];
        Forca forca[] = new Forca[4];
        
        for (int i = 0; i < forca.length; i++){
          System.out.println("========Cadastro das Forcas==========");
          System.out.println("Digite a forca[" +(i+1)+"]:");
          String nome = scanner.nextLine();

          forca[i] = new Forca(nome, 0);
        }

        for(int i=0; i < planeta.length; i++){
          System.out.println("--------Cadastro do Planeta--------");
          System.out.println("Digite o nome do planeta [" +(i+1) +"]: ");
          String nome = scanner.nextLine();

          System.out.println("informe a galaxia do planeta: ");
          String galaxia = scanner.nextLine();

          System.out.println("Tamanho do planeta: ");
          double tamanho = scanner.nextDouble();

          System.out.println("Populacao do planeta: ");
          int populacao = scanner.nextInt();

          planeta[i] = new Planeta(nome, galaxia, tamanho, populacao);
        }

        for (int i = 0; i < academia.length; i++){
          System.out.println("=========Cadastro da Academia=========");
          System.out.println("Local da academia: ");
          String local = scanner.nextLine();

          System.out.println("Tamanho: ");
          int tamanho = scanner.nextInt();

          System.out.println("Lotacao Máxima: ");
          int lotacaoMaxima = scanner.nextInt();

          //mostrar uma lista contendo os planetas para a escolha.
          academia[i] = new Academia(local, tamanho, lotacaoMaxima, planeta);
        }
        
      for(int i = 0; i < j.length; i++){  
        System.out.println("--------Cadastro do Jedi--------------");
        //mostra lista com os vetores contendo os sabres cadastrados
        System.out.print("\nEscolha a cor do sabre ["+(i+1)+"] :");
        String cor = scanner.nextLine();

        System.out.println("Diga o nome do Jedi["+(i+1)+"] :");
        String nome = scanner.nextLine();

        System.out.println("Diga o lado do Jedi["+(i+1)+"] :");
        String lado = scanner.nextLine();
        
        //com as forcas ja mostradas, basta escolher a potencia
        System.out.println("Diga a potencia forca do Jedi["+(i+1)+"] :");         
        String forca1 = scanner.nextLine();

       String sabre[j] = new SabreLuz(cor);  
        j[i] = new Jedi(nome, lado, forca1, sabre);
    }

    scanner.close();

    for(int i = 0; i < j.length;i++){
      System.out.println(j[i].toString());
   }    
    }    
}