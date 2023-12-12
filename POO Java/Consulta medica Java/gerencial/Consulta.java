package gerencial;

public class Consulta{

  public String nomeMedico;
  public String nomePaciente;
  public String idade;
  public String data;

  public String getIdade(){
    return idade;
  }

  public void setIdade(String idade){
    this.idade = idade;
  }

  public String getData(){
    return data;
  }

  public void setData(String data){
    this.data = data;
  }

  public String getNomeMedico(){
     return nomeMedico; 
  }

  public void setNomeMedico(String nomeMedico){
    this.nomeMedico = nomeMedico;
  }

  public String getNomePaciente(){
    return nomePaciente;
 }

 public void setNomePaciente(String nomePaciente){
   this.nomePaciente = nomePaciente;
 }

}