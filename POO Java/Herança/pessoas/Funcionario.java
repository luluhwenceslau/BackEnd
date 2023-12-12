package pessoas;

public class Funcionario extends Pessoas {
    private String setor;
    private boolean trabalhando;

    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }

    public boolean getTrabalhando (){
        return trabalhando;
    }
    public void settrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
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


    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;  //muda o estado da variavel, fazendo ela receber o valor inverso 
    }
}
