import light.Jedi;
import light.SabreLuz;
import java.util.Scanner;

public class Main {   
    public static void main(String[] args){
     
      int TAM = 3;
      Scanner scanner = new Scanner(System.in);
      SabreLuz sabre[] = new SabreLuz[TAM];
      Jedi j[] = new Jedi[TAM];
       
      for(int i = 0; i < sabre.length; i++){  //sabre.lenght deixa o tamanho do vetor definido
           System.out.print("\nEntre com a cor do sabre ["+(i+1)+"]");
           String cor = scanner.nextLine();
   
           System.out.println("Diga o nome do Jedi["+(i+1)+"]");
           String nome = scanner.nextLine();

           System.out.println("Diga o lado do Jedi["+(i+1)+"]");
           String lado = scanner.nextLine();

           System.out.println("Diga a forca do Jedi["+(i+1)+"]");         
           String forca = scanner.nextLine();

           sabre[i] = new SabreLuz(cor);  
           j[i] = new Jedi(nome, lado, forca, sabre[i]);
       }
       scanner.close();

        for(int i = 0; i < sabre.length; i++){  
                  System.out.println(sabre[i].toString());
        }
    
    // FOR EACH
   //     for(SabreLuz novoSabre: sabre){  
    //              System.out.println(sabre.toString());
     //   }
       
        for(int i = 0; i < j.length;i++){
         System.out.println(j[i].toString());
      }



       /* Jedi j1 = new Jedi("Luke","Light Force", "Mind trick", sabre[2]); //new é o método construtor
        Jedi j2 = new Jedi("Obi-wan", "Light Force", "Jump", sabre[1]);
 
        System.out.println(j1.toString());
        System.out.println(j2.toString());                                  
    
        j2.apertarBotaoSabre();      
                    System.out.println("\n********************" +
                                        "\nO Jedi 2 abriu o sabre: "+ 
                                        "\nJedi: " + j2.getNome() +
                                        "\nStatus sabre: " + j2.getSabre().isAberto()); 
       */
    }
}
