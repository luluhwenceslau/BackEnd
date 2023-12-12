import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ControleJedi{
    private Jedi jedi;
    private Habilidade habilidade;

    public void salvarJedi(TelaJedi telaJedi){
        Habilidade habilidade = new Habilidade();

        this.jedi.setNome(telaJedi.getTxtNome());
        this.jedi.setIdade(Integer.valueOf(telaJedi.getTxtIdade()));
        this.jedi.setAltura(Float.valueOf(telaJedi.getTxtAltura()));
        habilidade.setNome(telaJedi.getTxtHabilidade());
        habilidade.setValor(Integer.valueOf(telaJedi.getTxtValor()));
        jedi.setHabilidade(habilidade);
    }

    public void escreverArquivoJedi(){
        String dados = "";
        dados = jedi.getNome() + "," + 
                jedi.getAltura() + "," + 
                jedi.getIdade() + ";" + 
                jedi.getHabilidade().getNome() + "," + 
                jedi.getHabilidade().getValor() + ",";

        File arquivo = new File("C:\\Users\\Luana\\Documents\\POO Java\\Esteriotipos\\jedi.csv"); //local onde o arquivo será salvo
        FileWriter fw = new FileWriter(arquivo); //escreve um arquivo
        BufferedWriter bw = new BufferedWriter(fw); //escreve os arquivos de uma vez

        bw.write("nomeJedi, idade, altura, NomeHabilidade, ValorHabilidade");
        bw.write(dados);
        bw.close();
        fw.close();
    }

    public void buscarJedi(){ //retorna os dados de Jedi na TelaJedi
        TelaJedi telaJedi = new TelaJedi();

        telaJedi.setTxtNome(this.jedi.getNome());
        telaJedi.setTxtHabilidade(this.jedi.getHabilidade().getNome());
        telaJedi.setTxtValor(this.jedi.getHabilidade().getValor());
        telaJedi.desenhaTelaJedi();
    }
}
