import personagem.Jedi;
import personagem.Piloto;
import java.util.Scanner;

public class Main{ //main tem uma associação com outras classes
    public static void main(String[] args){
        
        /*Habilidade h1 = new Habilidade();
       Habilidade h2 = new Habilidade();

        h1.setTipoForca("Salto");
        h2.setTipoForca("Empurrar");
        */
        Jedi j1 = new Jedi("Luke", 10, 10);
        System.out.println(j1.toString());
   }
}