package entidade;

public class Habilidades {
   private String nome;
   private Integer valor;

   public Habilidades(String name, Integer valor) {
      this.setNome(name);
      this.setValor(valor);
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Integer getValor() {
      return valor;
   }

   public void setValor(Integer valor) {
      this.valor = valor;
   }

}
