package planeta;

public class Planeta {
    private String nome;
    private String galaxia;
    private double tamanho;
    private int populacao;

    public Planeta(String nome, String galaxia, double tamanho, int populacao){
        this.setNome(nome);
        this.setGalaxia(galaxia);
        this.setTamanho(tamanho);
        this.setPopulacao(populacao);
    }    
   
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getGalaxia(){
        return galaxia;
    }
    public void setGalaxia(String galaxia){
        this.galaxia = galaxia;
    }

    public double getTamanho(){
        return tamanho;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }

    public int getPopulacao(){
        return populacao;
    }
    public void setPopulacao(int populacao){
        this.populacao = populacao;
    }

}
