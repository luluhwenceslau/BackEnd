public class Jedi{
    private String nome;
    private Integer idade;
    private Float altura;
    private Habilidade habilidade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }

    
    public Float getAltura(){
        return altura;
    }
    public void setAltura(Float altura){
        this.altura = altura;
    }

    
    public Habilidade getHabilidade(){
        return habilidade;
    }
    public void setHabilidade(Habilidade habilidade){
        this.habilidade = habilidade;
    }
}