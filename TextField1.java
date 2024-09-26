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
public class TextField1 extends JFrame 
// inicio do bloco textfield
{
// declaração das variaveis sem atribuicao, final nao pode modificar   
   private final JTextField textField1; // text field with set size

   // TextFieldFrame constructor adds JTextFields to JFrame
// publico é o exportador, textfieldframe é o construtor, inicio do bloco de codigo
   public TextField1()
   {
// definição do titulo da janela      
      super("TextField1");
// tipo do desing
      setLayout(new FlowLayout());
// declaração de variavel com atribuição com colunas
      // construct textfield with 10 columns
      textField1 = new JTextField(10); 
// adicionando textfield no quadro
      add(textField1); // add textField1 to JFrame

// handler é o manipular dos campos de texto   
      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();
// esta sendo adicionado um escutador de acao
      textField1.addActionListener(handler);
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
         // display JTextField content
// invocando joptionpane que sera exibido uma caixa de dialogo
         JOptionPane.showMessageDialog(null, string); 
// fecha metodo
      } 
// fecha class
   } // end private inner class TextFieldHandler
   public static void main(String[] args)
   { 
// inicio do bloco de codigo do metodo
// declaracao da variavel textfieldframe, e atribuiu um novo objeto com new
      TextField1 textField1 = new TextField1(); 
// operador de fechamento 
      textField1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textField1.setSize(350, 100); 
      textField1.setVisible(true); 
   } 

} // end class TextFieldFrame
