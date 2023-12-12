package light;

public class Jedi {

    private String nome;
    private String lado;    
    private String forca;
    private SabreLuz sabre;

   public Jedi(String nome, String lado, String forca, SabreLuz sabre){
       this.setNome(nome);
       this.setLado(lado);
       this.setForca(forca);
       this.setSabre(sabre);
    }

    public String getNome(){
        return nome;
    } 
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getLado(){
        return lado;
    }
    public void setLado(String lado){
        this.lado = lado;
    }
    public String getForca(){
        return forca;
    }
    public void setForca(String forca){
        this.forca = forca;
    }
 
     public SabreLuz getSabre(){
        return sabre;
     }
     public void setSabre(SabreLuz sabre){
        this.sabre = sabre;
     }

    public void apertarBotaoSabre(){
        if (this.sabre.isAberto()){
            this.sabre.fechar();
        }
        else{
            this.sabre.abrir();
        }
    }
    @Override
    public String toString(){  //sobreposicao
        return "--------------------------" +
               "\nNome Jedi: " + this.getNome() +
               "\nLado: " + this.getLado() +
               "\nForca: " + this.getForca() +
               "\nCor do sabre: " + this.getSabre().getCor() +
               "\nSabre aberto? " + this.getSabre().isAberto() +
               "\n-------------------------";
    }
}
