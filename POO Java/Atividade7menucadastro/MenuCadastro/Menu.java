import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;

import Interface.TelaHabilidade;
import Interface.TelaJedi;

public class Menu extends JFrame{ //o frame sempre será a janela, tudo será feito dentro dele

    public Menu(){

        this.setTitle("****Menu Principal JEDI****");
        this.getContentPane().setLayout(new BorderLayout()); //coloca a borda no frame
        this.getContentPane().add(getMenu(), BorderLayout.BEFORE_FIRST_LINE); 
        this.pack();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //TELA CHEIA
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sai do programa
        this.setVisible(true);

    }

    public JMenuBar getMenu(){
      
      JMenuBar menuBar;
      JMenu menu, submenu;
      JMenuItem menuItem;
      JRadioButtonMenuItem rbMenuItem;
      JCheckBoxMenuItem cBoxMenuItem;

      //criacao do menuBar
      menuBar = new JMenuBar();

      //construção do menu
      menu = new JMenu("Menu De Cadastro");
      menu.setMnemonic(KeyEvent.VK_U); //atalho do menu
      menu.getAccessibleContext().setAccessibleDescription("Este Menu posssui itens");
      menuBar.add(menu);

      //itens do menu - item Um Texto
      menuItem = new JMenuItem("Cadastro Jedi", KeyEvent.VK_T);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("");
      TelaJedi(); //chamar a tela Jedi no menu
      menu.add(menuItem);

      //cadastro dos sabres
      menuItem = new JMenuItem("Cadastro Sabre", KeyEvent.VK_T);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("");
      TelaSabre(); //chamar a tela sabre no menu
      menu.add(menuItem);

      //cadastro das Habilidades
      menuItem = new JMenuItem("Cadastro Habilidades", KeyEvent.VK_T);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("TelaHabilidade");
      TelaHabilidade(); //chamar a tela habilidade no menu
      menu.add(menuItem);

      //item SAIR
      menuItem = new JMenuItem("Sair");
      menuItem.setMnemonic(KeyEvent.VK_S);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
      menu.add(menuItem);
 
      //action de SAIR
      menuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev){
          System.exit(0);
        }
      });
      
      menuBar.add(menu);
      return menuBar;
    }

  public static void main(String[] args) {
    new Menu();
  }
}

