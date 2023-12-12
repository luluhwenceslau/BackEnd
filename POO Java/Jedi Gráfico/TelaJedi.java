import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class TelaJedi extends JFrame{

    private JTextField nome = new JTextField(10);
    private JTextField idade = new JTextField(10);
    private JTextField altura = new JTextField(10);
    
    public TelaJedi(){
        this.setTitle("---Cadastro de Jedi---");
        this.getContentPane().setLayout(new BorderLayout()); //insere uma borda no layout
        this.getContentPane().add(getBotoes(), BorderLayout.PAGE_END); //adiciona um botão ,indica sua localização na tela
        this.getContentPane().add(getCampos(), BorderLayout.CENTER); 
        this.pack(); // deixa tudo em um pacote
        this.setVisible(true); // a tela ficará visível
        this.setLocationRelativeTo(null);
       // this.setSize(300,350); // especificação do tamanho da tela 
    }

    public JPanel getCampos(){
        JPanel painelJedi = new JPanel(new GridLayout(5,2));

        painelJedi.add(new JLabel("Nome:")); //insere "etiquetas" com as informações
        painelJedi.add(this.nome);
        painelJedi.add(new JLabel("Idade:"));
        painelJedi.add(this.idade);
        painelJedi.add(new JLabel("Altura:"));
        painelJedi.add(this.altura);

        return painelJedi; 
    }

    public JPanel getBotoes(){
        JPanel pnBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton btnSalvar =  new JButton("Salvar");
        pnBotoes.add(btnSalvar);
        JButton btnCancelar = new JButton("Cancelar");
        pnBotoes.add(btnCancelar);
        JButton btnSair =  new JButton("Sair");
        pnBotoes.add(btnSair);

        btnSair.addActionListener(this::btnSairClick);
        btnSalvar.addActionListener(this::btnSalvarClick); 
        btnCancelar.addActionListener(this::btnCancelarClick);

        return pnBotoes;
    }

    public void btnSairClick(ActionEvent e ){
       switch (JOptionPane.showConfirmDialog(this, "Deseja realmente sair?","Confirmacao" ,JOptionPane.CANCEL_OPTION)){
        case JOptionPane.CANCEL_OPTION:
           break;
        case JOptionPane.OK_OPTION:
         this.dispose(); //encerra e deixa de ficar na memoria
         break;

        }
    }

    public String btnSalvarClick(ActionEvent e){ 
        String dados = new String();
        dados = null;
        switch (JOptionPane.showConfirmDialog(this, "Deseja Salvar?","Confirmacao" ,JOptionPane.YES_NO_OPTION)){
            case JOptionPane.NO_OPTION:
               break;   
            case JOptionPane.YES_OPTION:
             //salvar em arquivo físico jedi atraves do controller
             dados = this.nome.getText() + 
                    ";" + this.idade.getText() + 
                    ";" + this.altura.getText();
        } 
        return dados;
    }

    public void btnCancelarClick(ActionEvent e){
        this.nome.setText("");
        this.idade.setText("");
        this.altura.setText("");

    }

    public static void main(String[] args){
        new TelaJedi();
    }
}