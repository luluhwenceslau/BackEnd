package entidade;

public class Jedi {
   private String nome;
   private Integer idade;
   private Float altura;
   private SabreLuz sabreLuz;
   private Habilidades habilidadeJedi;

   public Jedi(String nome, Integer idade, Float altura, SabreLuz sabreLuz, Habilidades habilidadeJedi) {
      this.setNome(nome);
      this.setIdade(idade);
      this.setAltura(altura);
      this.setSabreLuz(sabreLuz);
      this.setHabilidadeJedi(habilidadeJedi);
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Integer getIdade() {
      return idade;
   }

   public void setIdade(Integer idade) {
      this.idade = idade;
   }

   public Float getAltura() {
      return altura;
   }
   
   public void setAltura(Float altura) {
      this.altura = altura;
   }

   public SabreLuz getSabreLuz() {
      return sabreLuz;
   }

   public void setSabreLuz(SabreLuz sabreLuz) {
      this.sabreLuz = sabreLuz;
   }

   public Habilidades getHabilidadeJedi() {
      return habilidadeJedi;
   }

   public void setHabilidadeJedi(Habilidades habilidadeJedi) {
      this.habilidadeJedi = habilidadeJedi;
   }
}