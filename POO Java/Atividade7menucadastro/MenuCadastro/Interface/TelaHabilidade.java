package Interface;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ControlerJava;


public class TelaHabilidade extends JFrame {
  
    private JTextField nomeHabilidade = new JTextField(30);
    private JTextField valorHabilidade = new JTextField(4);
    private ControlerJava controle = new ControlerJava();
    private String data;
 
    public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

    
   public TelaHabilidade() { 
      this.setTitle("****Cadastro Habilidade****");
      this.getContentPane().setLayout(new BorderLayout());
      this.getContentPane().add(getInputsHabilidade(), BorderLayout.CENTER);
      this.getContentPane().add(getButtons(), BorderLayout.PAGE_END);
      this.setSize(1280, 900);
      this.pack();
      this.setLocationRelativeTo(null);
      this.setVisible(true);
   }  

   public JPanel getInputsHabilidade() {
      JPanel panelHabilidade = new JPanel(new GridLayout(2, 2));
   panelHabilidade.add(new JLabel("Digite o nome da Habilidade:"));
   panelHabilidade.add(this.nomeHabilidade);
   panelHabilidade.add(new JLabel("Digite o potencia da Habilidade:"));
   panelHabilidade.add(this.valorHabilidade);

   return panelHabilidade;
   }
    
   
   public JPanel getButtons() {
      JPanel panelButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
      JButton btnSair = new JButton("Sair");
      JButton btnSalvar = new JButton("Salvar");
      JButton btnCancelar = new JButton("Cancelar");
      btnSair.addActionListener(this::btnSairClick);
      btnCancelar.addActionListener(this::btnCancelarClick);
      btnSalvar.addActionListener(this::btnSalvarClick);
      panelButtons.add(btnSair);
      panelButtons.add(btnCancelar);
      panelButtons.add(btnSalvar);

      return panelButtons;
   }

   public void btnSairClick(ActionEvent e) {
      switch (JOptionPane.showConfirmDialog(this, "Você deseja sair?", "Atenção",
            JOptionPane.OK_CANCEL_OPTION)) {
         case JOptionPane.CANCEL_OPTION:
            break;

         case JOptionPane.OK_OPTION:
            clearFields();
            JOptionPane.showMessageDialog(this, "Obrigado pela visita!");
            this.dispose();
            break;
      }
   }

   public void btnCancelarClick(ActionEvent e) {
      this.nomeHabilidade.setText("");
      this.valorHabilidade.setText("");
      
   }

   
   public void btnSalvarClick(ActionEvent e) {
      switch (JOptionPane.showConfirmDialog(this, "Você deseja salvar?", "Atenção",
            JOptionPane.YES_NO_OPTION)) {
         case JOptionPane.NO_OPTION:
            break;
         case JOptionPane.OK_OPTION:
            this.setData(
                        this.nomeHabilidade.getText() + "," + this.valorHabilidade.getText());
            clearFields();
            controle.salvarJedi(this.getData());
            try {
               controle.escreverArquivoJedi();
               JOptionPane.showMessageDialog(this, "O cadstro da sua Habilidade foi realizado com SUCESSO!");
            } catch (Exception ae) {
               System.out.println("Não foi possível salvar as Habilidades!");
            }
            break;
      }
   }

    public void clearFields() {
       this.nomeHabilidade.setText("");
       this.valorHabilidade.setText("");
    }
 
 }