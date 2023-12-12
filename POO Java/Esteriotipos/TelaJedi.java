import java.util.Scanner;

public class TelaJedi{
    private String txtNome;
    private String txtHabilidade;
    private String txtAltura;
    private String txtValor;
    private String txtIdade;

    public String getTxtNome(){
        return txtNome;
    }
    public void setTxtNome(String txtNome){
        this.txtNome = txtNome;
    }

    public String getTxtHabilidade(){
        return txtHabilidade;
    }
    public void setTxtHabilidade(String txtHabilidade){
        this.txtHabilidade = txtHabilidade;
    }

    public String getTxtAltura(){
        return txtAltura;
    }
    public void setTxtAltura(String txtAltura){
        this.txtAltura = txtAltura;
    }

    public String getTxtValor(){
        return txtValor;
    }
    public void setTxtValor(String txtValor){
        this.txtValor = txtValor;
    }

    public String getTxtIdade(){
        return txtIdade;
    }
    public void setTxtIdade(String txtIdade){
        this.txtIdade = txtIdade;
    }

    public TelaJedi desenhaTelaJedi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do Jedi:\t ");
        this.setTxtNome(sc.nextLine());

        System.out.println("Informe o nome da habilidade:\t ");
        this.setTxtHabilidade(sc.nextLine());

        System.out.println("Informe a altura do Jedi:\t ");
        this.setTxtAltura(sc.nextLine());

        System.out.println("Informe o valor da habilidade;\t ");
        this.setTxtValor(sc.nextLine());

        System.out.println("Informe a idade do Jedi:\t ");
        this.setTxtIdade(sc.nextLine());
        sc.nextLine(); //limpar o buffer
    }

    @Override
    public String toString(){
        return  "\n************DADOS JEDI***********"+
                "\n" + this.getTxtNome() +
                "\n" + this.getTxtIdade() +
                "\n" + this.getTxtAltura() +
                "\n" + this.getTxtHabilidade() +
                "\n" + this.getTxtValor();
        }
}