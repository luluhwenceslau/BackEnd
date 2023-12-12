package planeta;

public class Academia {
    private String local;
    private int tamanho;
    private int lotacaoMaxima;
    private Planeta planeta;

    public Academia(String local, int tamanho, int lotacaoMaxima, Planeta planeta){
        this.setLocal(local);
        this.setTamanho(tamanho);
        this.setLotacaoMaxima(lotacaoMaxima);
        this.setPlaneta(planeta);
    }

    public String getLocal(){
       return local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public int getLotacaoMaxima(){
        return lotacaoMaxima;
    }
    public void setLotacaoMaxima(int lotacaoMaxima){
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public Planeta getPlaneta(){
        return planeta;
    }

    public void setPlaneta(Planeta planeta){
        this.planeta = planeta;
    }
}
