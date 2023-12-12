package pessoa;

public class Medico{

 private String nome;
 private String especialidade;
 private String endereco;
 private String cpf;
 private String telefone;

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getEspecialidade(){
    return especialidade;
  }

  public void setEspecialidade(String especialidade){
    this.especialidade = especialidade;
  }

  public String getEndereco(){
    return endereco;
  }

 public void setEndereco(String endereco){
    this.endereco = endereco;
 }

 public String getCpf(){
    return cpf;
 }

 public void setCpf(String cpf){
    this.cpf = cpf;
 }

 public String getTelefone(){
    return telefone;
 }

 public void setTelefone(String telefone){
    this.telefone = telefone;
 }
}