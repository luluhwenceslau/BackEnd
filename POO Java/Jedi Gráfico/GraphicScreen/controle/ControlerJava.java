package controle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import entidade.Habilidades;
import entidade.Jedi;
import entidade.SabreLuz;

public class ControlerJava {
   private Jedi jedi;
   private SabreLuz sabre;
   private Habilidades habilidade;

   public void salvarJedi(String jedi) {
      String[] data = jedi.split(",");
      this.sabre = new SabreLuz(String.valueOf(data[0]), Integer.valueOf(data[1]), Boolean.valueOf(data[2]));
      this.habilidade = new Habilidades(String.valueOf(data[3]), Integer.valueOf(data[4]));
      this.jedi = new Jedi(String.valueOf(data[5]),
            Integer.valueOf(data[6]),
            Float.valueOf(data[7]),
            sabre,habilidade);
   }

   public void escreverArquivoJedi() throws IOException {
      String dados = this.jedi.getNome() + "|" +
            this.jedi.getIdade() + "|" +
            this.jedi.getAltura() + "|" +
            this.jedi.getHabilidadeJedi().getNome() + "|" +
            this.jedi.getHabilidadeJedi().getValor() + "|" +
            this.jedi.getSabreLuz().getCor() + "|" +
            this.jedi.getSabreLuz().getTamanho() + "|" +
            this.jedi.getSabreLuz().getEstado();

      File arquivo = new File("C:\\Users\\conta\\OneDrive\\Área de Trabalho\\Facu\\P.O.O\\atividade6\\Jedi.CSV");
      if (!arquivo.exists()) {
         FileWriter fw = new FileWriter(arquivo, true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("nome, idade, altura, nomeHabilidade, valorHabilidade, corSabre, tamanhoSabre, estadoSabre");
         bw.newLine();
         bw.write(dados);
         bw.close();
         fw.close();
      } else {
         FileWriter fw = new FileWriter(arquivo, true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.newLine();
         bw.write(dados);
         bw.close();
         fw.close();
      }
   }
}
