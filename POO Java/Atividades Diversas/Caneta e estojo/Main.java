import estojo.Caneta;

public class Main{

    public static void main(String[] args){

     Caneta c1 = new Caneta("Bic", "Azul", 10, 0.5f);
     
     c1.destampar();    
     c1.status();
     c1.rabiscar();
    }
}