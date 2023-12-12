package personagem;

public class Jedi{

      String nome;
      public String planeta;
      public String lado;
      public int idade;
      public String nome;
      public int forca;
      public boolean retired;
      
      public String getNome(){
         return nome;
      } 
 
      public String setNome(){
         this.nome = nome;
      }
      
      public String getLado(){
         return lado;
      }
      
      public String setLado(){
         this.lado = lado;
      }
      
      public int getIdade(){
         return idade;
      }
      
       public String getPlaneta(){
         return planeta;
      }
      
      public String setPlaneta(){
         this.planeta = planeta;
      }
      
      public int getForca(){
         return forca;
      }
      
      public int setForca(){
         this.forca = forca;
      }

      public int usarForca(){
          this.forca = forca - 2;
      }
      
      public int recarregarForca(){
          this.forca = forca + 2;
      }
      
      public boolean isRetired(){
         return retired;
     }
      public void setRetired(boolean retired){
         this.retired = retired;
     }
}