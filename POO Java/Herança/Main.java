import pessoas.Aluno;
import pessoas.Professor;
import pessoas.Funcionario;

public class Main{

    public static void main(String[] args){
       
        //Pessoas p1 = new Pessoas(); pessoa nao pode ser criada, classe abstrata
        Aluno p2 = new Aluno();
       // Professor p3 = new Professor();
       // Funcionario p4 = new Funcionario();

        p2.setNomeAluno("Claudia");
        // p3.setNome("Fabio");
        /*p4.setNome("Jessica");

        p3.setSexo("F");

        p2.setIdade(20);
        p2.setMatricula(5252);
        p2.setSexo("M");

        p2.setCurso("Informatica");
        p3.setSalario(2500.50f);
        p4.setSetor("Secretaria");
 */
        System.out.println(p2.toString());
     /*   System.out.println(p3.toString());
        System.out.println(p4.toString());
     */
    }
}