package jedi.acessorios;

public class SabreLuz{

     private String cor;
     private int tamanho;
     private boolean aberto;

     public String getCor(){
        return cor;
      } 
      
      public void setCor(String cor){
        this.cor = cor;
      }
      
      public int getTamanho (){
        return tamanho;
      }
      
     public void setTamanho (int tamanho){
        this.tamanho = tamanho;
     } 

    public boolean isAberto (){
       return aberto;
     }

    private void setAberto (boolean aberto){
       this.aberto = aberto;
     }
 
     public void abrir(){
       this.setAberto(true);
     }

     public void fechar(){
       this.setAberto(false);
     }
}