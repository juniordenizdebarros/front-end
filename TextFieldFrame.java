// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
//  importacao biblioteca, submodulo, componente
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

// declaração da classe com heranca do jframe
public class TextFieldFrame extends JFrame 
// inicio do bloco textfield
{
// declaração das variaveis sem atribuicao, final nao pode modificar   
   private final JTextField textField1; // text field with set size
   private final JTextField textField2; // text field with text
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   // TextFieldFrame constructor adds JTextFields to JFrame
// publico é o exportador, textfieldframe é o construtor, inicio do bloco de codigo
   public TextFieldFrame()
   {
// definição do titulo da janela      
      super("Testing JTextField and JPasswordField");
// tipo do desing
      setLayout(new FlowLayout());
// declaração de variavel com atribuição com colunas
      // construct textfield with 10 columns
      textField1 = new JTextField(10); 
// adicionando textfield no quadro
      add(textField1); // add textField1 to JFrame

      // construct textfield with default text
// declaracao de variavel com atribucao com texto
      textField2 = new JTextField("Enter text here");
      add(textField2); // add textField2 to JFrame

// atribuição com texto sem edição
      // construct textfield with default text and 21 columns
      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); // disable editing
      add(textField3); // add textField3 to JFrame
// atribuição com texto escondido
      // construct passwordfield with default text
      passwordField = new JPasswordField("Hidden text");
      add(passwordField); // add passwordField to JFrame

// handler é o manipular dos campos de texto   
      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();
// esta sendo adicionado um escutador de acao
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } // end TextFieldFrame constructor

   // private inner class for event handling
// esta injetando um objeto, o actionlistener no textfield
   private class TextFieldHandler implements ActionListener 
   {
      // process textfield events
// comando de sobrescrever 
      @Override
// void não tem retorno, actionperformed sao as acoes que irao acontecer
      public void actionPerformed(ActionEvent event)
      {
// definição da string do tipo string de texto vazio
         String string = ""; 
         // user pressed Enter in JTextField textField1
// if é um comando de validacao, "==" comparacao "=" receber, get source ira comparar duas coisas se sao iguais, se nao pula para o proximo comando 
         if (event.getSource() == textField1)
            string = String.format("textField1: %s",
// pegar o comando da acao, texto que estiver dentro do elemento 
               event.getActionCommand());

         // user pressed Enter in JTextField textField2
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());

         // user pressed Enter in JTextField textField3
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         // user pressed Enter in JTextField passwordField
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // display JTextField content
// invocando joptionpane que sera exibido uma caixa de dialogo
         JOptionPane.showMessageDialog(null, string); 
// fecha metodo
      } 
// fecha class
   } // end private inner class TextFieldHandler

} // end class TextFieldFrame

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
