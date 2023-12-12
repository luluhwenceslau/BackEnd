package entidade;

public class SabreLuz {
   private String cor;
   private Integer tamanho;
   private Boolean estado;

   public SabreLuz(String cor, Integer tamanho, Boolean estado) {
      this.setCor(cor);
      this.setTamanho(tamanho);
      if (!estado){
         isFechado();
      } else {
         isAberto();
      }
   }

   public String getCor() {
      return cor;
   }

   public void setCor(String cor) {
      this.cor = cor;
   }

   public Integer getTamanho() {
      return tamanho;
   }

   public void setTamanho(Integer tamanho) {
      this.tamanho = tamanho;
   }

   public Boolean getEstado() {
      return estado;
   }

   private void setEstado(Boolean estado) {
      this.estado = estado;
   }

   public void isAberto() {
      this.setEstado(true);
   }

   public void isFechado() {
      this.setEstado(false);
   }

}
