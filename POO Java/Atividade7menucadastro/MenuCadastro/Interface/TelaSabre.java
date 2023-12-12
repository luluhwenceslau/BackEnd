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

public class TelaSabre extends JFrame {
   private JTextField tamanhoSabre = new JTextField(4);
   private JTextField estadoSabre = new JTextField(5);
   private ControlerJava controle = new ControlerJava();
   private String data;

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   
   public TelaSabre() { 
    this.setTitle("****Cadastro Sabre****");
    this.getContentPane().setLayout(new BorderLayout());
    this.getContentPane().add(getInputsSabre(), BorderLayout.CENTER);
    this.getContentPane().add(getButtons(), BorderLayout.PAGE_END);
    this.setSize(1280, 900);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
 }  

 public JPanel getInputsSabre() {
    JPanel panelSabre = new JPanel(new GridLayout(3, 2));
  panelSabre.add(new JLabel("Digite a cor do Sabre:"));
  panelSabre.add(this.corSabre);
  panelSabre.add(new JLabel("Digite o tamanho do Sabre:"));
  panelSabre.add(this.tamanhoSabre);
  panelSabre.add(new JLabel("O Sabre está aberto? digite: True(V) ou False(F)"));
  panelSabre.add(this.estadoSabre);

  return panelSabre;
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
    this.corSabre.setText("");
    this.tamanhoSabre.setText("");
    this.estadoSabre.setText("");
 }

 public void btnSalvarClick(ActionEvent e) {
    switch (JOptionPane.showConfirmDialog(this, "Você deseja salvar?", "Atenção",
          JOptionPane.YES_NO_OPTION)) {
       case JOptionPane.NO_OPTION:
          break;
       case JOptionPane.OK_OPTION:
          this.setData(
                this.corSabre.getText() + "," + this.tamanhoSabre.getText() + "," + this.estadoSabre.getText() );
          clearFields();
          controle.salvarJedi(this.getData());
          try {
             controle.escreverArquivoJedi();
             JOptionPane.showMessageDialog(this, "O cadstro do seu Sabre foi realizado com SUCESSO!");
          } catch (Exception ae) {
             System.out.println("Não foi possível salvar o seu Sabre!");
          }
          break;
    }
 }

 public void clearFields() {
    this.tamanhoSabre.setText("");
    this.estadoSabre.setText("");
 }
}


}