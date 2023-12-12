package mesaEstojo;

public class Caneta{
    private float ponta;
    private String marca;
    private String cor;
    private int carga;
    private boolean tampada;

     public float setPonta(){
        return ponta;
     }
     public void getPonta(float ponta){
        this.ponta = ponta;
     }
    
     public String setMarca(){
        return marca;
     }
     public void getMarca(String marca){
        this.marca = marca;
     }
      
     public String setCor(){
        return cor;
     }
     public void getCor(String cor){
        this.cor = cor;
     }

     public int setCarga(){
        return carga;
     }
     public void getCarga(int carga){
        this.carga = carga;
     }
     
     public boolean isTampada(){
         return tampada;
     }
     private void setTampada(boolean tampada){
       this.tampada = tampada;
     }

     public void tampar(){
       this.setTampada(true);
     }
     public void destampar(){
      this.setTampada(false);
     }

     public void escrever(){
      if (tampada == true){
         System.out.println("ERRO, CANETA TAMPADA");
      }else {
         this.carga = carga - 2;
         System.out.println("escrevendo");
      }      
     }

     public void recarregar(){
        this.carga = carga + 2;
     }

}