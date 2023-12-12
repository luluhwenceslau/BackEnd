import personagem.Jedi;

public class Principal{
  
     public static void main(String[] args){
     
        Jedi jedi1 = new Jedi();
        Jedi jedi2 = new Jedi();

         jedi1.setNome("Lukas");
         jedi1.setPlaneta("Terra");
         jedi1.setIdade(19);
         jedi1.setLado("Dark");
         jedi1.setForca(10);
         jedi1.isRetired(false);


         jedi2.setNome("Nick");
         jedi2.setPlaneta("Saturno");
         jedi2.setIdade(20);
         jedi2.setLado("Dark");
         jedi2.setForca(15);
         jedi2.isRetired(false);

         System.out.println();  
         System.out.println("Nome: " + jedi1.getNome);        
         System.out.println("Planeta: " + jedi1.getPlaneta);
         System.out.println("Forca: " + jedi1.getForca);
         System.out.println("Idade: " + jedi1.getIdade);
         System.out.println("Lado:" + jedi1.getLado);
         System.out.println("Retired?" + jedi1.isRetired());


         System.out.println();  
         System.out.println("Nome: " + jedi2.getNome);        
         System.out.println("Planeta: " + jedi2.getPlaneta);
         System.out.println("Forca: " + jedi2.getForca);
         System.out.println("Idade: " + jedi2.getIdade);
         System.out.println("Lado:" + jedi2.getLado);
         System.out.println("Retired?" + jedi2.isRetired());

         jedi1.usarForca();
         jedi2.recarregarForca();
         
         System.out.println(); 
         System.out.println("Forca: " + jedi1.getForca);
         System.out.println("Forca: " + jedi2.getForca);

     }
}