package pessoas;

public class Pessoas {
    private String nome;
    private int idade;
    private String sexo;

    protected String getNome(){
        return nome;
    }
    protected void setNome(String nome){
        this.nome = nome;
    }

    protected int getIdade(){
        return idade;
    }
    protected void setIdade(int idade){
        this.idade = idade;
    }

    protected String getSexo(){
        return sexo;
    }
    protected void setSexo(String sexo){
        this.sexo =  sexo;
    }

    protected void fazerAniversario(){
        this.idade ++;
    }

}