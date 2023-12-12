package personagem.Jedi;

public class Jedi extends Ser{
    private int midiChlorian;
    private SabreLuz sabre;
    Habilidade [] habilidade;


    public Jedi(int habilidade){
       this.habilidade = new Habilidade[habilidade];
    }
    public int getMidiChlorian(){
        return midiChlorian;
    }
    public void setMidiChlorian(int midiChlorian){
        this.midiChlorian = midiChlorian;
    }

    public SabreLuz getSabre(){
        return sabre;
     }
     public void setSabre(SabreLuz sabre){
        this.sabre = sabre;
     } 
}