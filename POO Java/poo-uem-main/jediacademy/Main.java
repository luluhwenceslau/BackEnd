import java.util.Scanner;
import character.Jedi;

public class Main {
    public static void main(String[] args) {

        int TAM = 5;
        Scanner scanner = new Scanner(System.in);
        Jedi j[] = new Jedi[TAM];
         
        for(int i = 0; i < j.length; i++){  
             System.out.println("Diga o nome do Jedi["+(i+1)+"]");
             String nome = scanner.nextLine();
  
             System.out.println("Diga as habilidades do Jedi["+(i+1)+"]");         
             String tipoForca = scanner.nextLine();
            
             System.out.println("Digite os valores das habilidades: ");
             String valor = scanner.nextLine();

             j[i] = new Jedi(nome, tipoForca, valor);
         }
         scanner.close();
  
          for(int i = 0; i < j.length; i++){  
                    System.out.println(j[i].toString());
          }
    }

}