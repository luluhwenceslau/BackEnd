package character;
import character.Ser;
import veiculo.Nave;

public class Piloto extends Ser{
   private Nave nave;

   public Piloto(String nome, Nave nave){
    this.setNome(nome);
    this.setNave(nave);
   }
   public Nave getNave(){
    return nave;
   }
   public void setNave(Nave nave){
    this.nave = nave;
   }

   public String toString(){
    return "\nNome piloto: "+ getNome()+
            "Nave: " + getNave();
   }

}