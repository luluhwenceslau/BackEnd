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

public class TelaJedi extends JFrame {
   private JTextField nome = new JTextField(30);
   private JTextField idade = new JTextField(4);
   private JTextField altura = new JTextField(3);
   private ControlerJava controle = new ControlerJava();
   private String data;

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   public TelaJedi() { 
      this.setTitle("****Cadastro Jedi****");
      this.getContentPane().setLayout(new BorderLayout());
      this.getContentPane().add(getInputsJedi(), BorderLayout.CENTER);
      this.getContentPane().add(getButtons(), BorderLayout.PAGE_END);
      this.setSize(1280, 900);
      this.pack();
      this.setLocationRelativeTo(null);
      this.setVisible(true);
   }  

   public JPanel getInputsJedi() {
      JPanel panelJedi = new JPanel(new GridLayout(3, 2));  //separando as telas
      panelJedi.add(new JLabel("Digite o nome do Jedi:"));
      panelJedi.add(this.nome);
      panelJedi.add(new JLabel("Digite a idade do Jedi:"));
      panelJedi.add(this.idade);
      panelJedi.add(new JLabel("Digite a altura do Jedi:"));
      panelJedi.add(this.altura);
     
      return panelJedi;
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
      this.nome.setText("");
      this.idade.setText("");
      this.altura.setText("");
   }

   public void btnSalvarClick(ActionEvent e) {
      switch (JOptionPane.showConfirmDialog(this, "Você deseja salvar?", "Atenção",
            JOptionPane.YES_NO_OPTION)) {
         case JOptionPane.NO_OPTION:
            break;
         case JOptionPane.OK_OPTION:
            this.setData(
                        this.nome.getText() + "," + this.idade.getText() + "," + this.altura.getText());
            clearFields();
            controle.salvarJedi(this.getData());
            try {
               controle.escreverArquivoJedi();
               JOptionPane.showMessageDialog(this, "O cadstro do seu Jedi foi realizado com SUCESSO!");
            } catch (Exception ae) {
               System.out.println("Não foi possível salvar o seu Jedi!");
            }
            break;
      }
   }

   public void clearFields() {
      this.nome.setText("");
      this.idade.setText("");
      this.altura.setText("");
   }
}
