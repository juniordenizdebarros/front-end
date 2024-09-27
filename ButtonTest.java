// Fig. 12.16: ButtonTest.java
// Testing ButtonFrame.
// importando modudo swing da biblioteca javax
import javax.swing.JFrame;

// declaracao da classe buttontest
public class ButtonTest 
{
// declaração do metodo main
   public static void main(String[] args)
   { 
// inicio do bloco de codigo do metodo principal
// declaração da variavel buttonframe
      ButtonFrame buttonFrame = new ButtonFrame(); 
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonFrame.setSize(275, 110); 
      buttonFrame.setVisible(true); 
   } 
} // end class ButtonTest
