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
      this.jedi = new Jedi(String.valueOf(data[5]));
   }

   public void escreverArquivoJedi() throws IOException {
      String dados = this.jedi.getNome() + "|" +
            this.jedi.getIdade() + "|" +
            this.jedi.getAltura();

      File arquivo = new File("C:\\Users\\Luana\\Documents\\POO Java\\Atividade7menucadastro\\MenuCadastro");
      if (!arquivo.exists()) {
         FileWriter fw = new FileWriter(arquivo, true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("nome, idade, altura");
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


   public void salvarHabilidade(String habilidade) {
      String[] data = habilidade.split(",");
      this.habilidade = new Habilidades(String.valueOf(data[3]), Integer.valueOf(data[4]));
   }

   public void escreverArquivoHabilidade() throws IOException {
      String dados =  this.jedi.getHabilidadeJedi().getNome() + "|" +
            this.jedi.getHabilidadeJedi().getValor();

      File arquivo = new File("C:\\Users\\Luana\\Documents\\POO Java\\Atividade7menucadastro\\MenuCadastro");
      if (!arquivo.exists()) {
         FileWriter fw = new FileWriter(arquivo, true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("nomeHabilidade, valorHabilidade");
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


   public void salvarSabre(String sabre) {
      String[] data = sabre.split(",");
      this.sabre = new SabreLuz(String.valueOf(data[0]), Integer.valueOf(data[1]), Boolean.valueOf(data[2]));
   }

   public void escreverArquivoSabre() throws IOException {
      String dados = this.jedi.getSabreLuz().getCor() + "|" +
            this.jedi.getSabreLuz().getTamanho() + "|" +
            this.jedi.getSabreLuz().getEstado();

      File arquivo = new File("C:\\Users\\Luana\\Documents\\POO Java\\Atividade7menucadastro\\MenuCadastro");
      if (!arquivo.exists()) {
         FileWriter fw = new FileWriter(arquivo, true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("corSabre, tamanhoSabre, estadoSabre");
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
