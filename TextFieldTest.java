// Fig. 12.10: TextFieldTest.java
// Testing TextFieldFrame.

// importando o jframe do modelo swing da biblioteca javax
import javax.swing.JFrame;

// declaração da class text fieldtest 
public class TextFieldTest
// inicio do bloco de codigo da class textfieldtest
{
// declaração do metodo main, metodo executor
   public static void main(String[] args)
   { 
// inicio do bloco de codigo do metodo
// declaracao da variavel textfieldframe, e atribuiu um novo objeto com new
      TextFieldFrame textFieldFrame = new TextFieldFrame(); 
// operador de fechamento 
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldFrame.setSize(350, 100); 
      textFieldFrame.setVisible(true); 
   } 
} // end class TextFieldTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
