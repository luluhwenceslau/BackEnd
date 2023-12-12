package character;
import character.Ser;

public class Jedi extends Ser {
    private String corSabre;
    private Habilidade tipoForca, valor;


    public Jedi(String nome, Habilidade tipoForca, Habilidade valor) {
        this.setNome(nome);
        this.setTipoForca(tipoForca);
        this.setValor(valor);
    }

    public String getCorSabre() {
        return corSabre;
    }

    public void setCorSabre(String corSabre) {
        this.corSabre = corSabre;
    }

    public Habilidade getTipoForca(){
        return tipoForca;
    }
    public void setTipoForca(Habilidade tipoForca){
        this.tipoForca = tipoForca;
    }

    public Habilidade getValor(){
        return valor;
    }
    public void setValor(Habilidade valor){
        this.valor = valor;
    }

    public String toString() {
         return "\nJedi: " + this.getNome() + 
                "\nHabilidade: " + this.getTipoForca() +
                "\nValor das habilidades: " + this.getValor();

    }

}