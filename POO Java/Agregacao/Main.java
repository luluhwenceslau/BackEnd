import java.util.Scanner;
import character.Habilidade;
import character.Jedi;
import character.Piloto;
import veiculo.Nave;

public class Main {
    public static void main(String[] args) {
        int TAM = 2;
        Scanner scanner = new Scanner(System.in);
        Jedi j[] = new Jedi[TAM];
        Piloto p[] = new Piloto[TAM];
         
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

          for(int i = 0; i < p.length; i++){  
            System.out.println("Diga o nome do Piloto["+(i+1)+"]");
            String nome = scanner.nextLine();
 
            System.out.println("Diga a nave do Piloto["+(i+1)+"]");         
            String nave = scanner.nextLine();

            p[i] = new Piloto(nome, nave);
        }
        scanner.close();
 
         for(int i = 0; i < p.length; i++){  
                   System.out.println(p[i].toString());
         }
    }

}