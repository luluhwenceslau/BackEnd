package pessoas;

public class Professor extends Pessoas{
    private String especialidade;
    private float salario;

    public String getEspecialidade(){
        return especialidade;
    }
    public void setespecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public float getSalario(){
        return salario;
    }
    public void setSalario(Float salario){
        this.salario = salario;
    }
   
    public void setNome(String nome){
        this.setNome(nome);
    }

    public void setIdade(int idade){
        this.setIdade(idade);
    }

    public void setSexo(String sexo){
        this.setSexo(sexo);
    }

    public void receberAumento(float aum ){
        this.salario += aum;
    }
}
