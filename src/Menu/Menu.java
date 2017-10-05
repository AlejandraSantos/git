package Menu;

import gui.MarcoDibujo;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Menu {
   public static void main(String [] args){
      MarcoDibujo gui=new MarcoDibujo();
        gui.setTitle("GUI");
        gui.setVisible(true);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setSize(1000,500); 
   } 
}
