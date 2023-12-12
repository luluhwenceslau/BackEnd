package character;

public class Habilidade {
   private String tipoForca;
   private int valor;

   public Habilidade (String tipoForca, int valor) {
      this.setTipoForca(tipoForca);
      this.setValor(valor);
   }

   public String getTipoForca() {
      return tipoForca;
   }

   private void setTipoForca(String tipoForca) { 
         this.tipoForca = tipoForca;
   }

   public int getValor() {
      return valor;
   }

   private void setValor(int valor) { 
      this.valor = valor;
   }

}