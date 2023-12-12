package pessoas;

public class Aluno extends Pessoas {
    private int matricula;
    private String curso;
    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada!!");
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade do aluno " + this.getNome() + " paga!");
    }

    public void setNomeAluno(String nome){
        this.setNomeAluno(nome);
    }

    public void getNomeAluno(){
        this.getNomeAluno();
    }

    public void setIdade(int idade){
        this.setIdade(idade);
    }

    public void setSexo(String sexo){
        this.setSexo(sexo);
    }

    @Override
    public String toString(){
       return  "------------------------------------------------" +
               "Pessoa = " + "\n Nome: " + this.getNome() + ", idade : " + this.getIdade() + ", sexo: " + this.getSexo() +
               "\n----------------------------------------------" ;
    } 
}
