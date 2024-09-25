// Fig. 12.6: LabelFrame.java
// JLabels with text and icons.
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

// importando a classe labelframe, onde o extends esta herdando o componente jframe
public class LabelFrame extends JFrame 
// iniciando o bloco de codigo da classe labelframe
{
// declarações de variaveis, private NAO EXPORTA A VARIAVEL, final declara variavel somente leitura, jlabel é o tipo de variavel, label1 é o nome da variavel
   private final JLabel label1; // JLabel with just text
   private final JLabel label2; // JLabel constructed with text and icon
   private final JLabel label3; // JLabel with added text and icon

 // LabelFrame constructor adds JLabels to JFrame
 // tem que ter o mesmo nome do arquivo labelframe  
   public LabelFrame()
   {
 // super define o titulo da tabela     
      super("Testing JLabel");
// vai definir o desenho do layout
      setLayout(new FlowLayout()); // set frame layout
// esta recebendo o objeto jlabel
      label1 = new JLabel("Label with text");
// invocando um texto  de dica quando o cursor do mouse estiver em cima, settooltiptext
      label1.setToolTipText("This is label1");
// vai mostrar na saida do layout
      add(label1); // add label1 to JFrame

// declando variavel bug do tipo icon que esta recendo variavel de novo objeto do tipo imagem icon, onde o getclass ira pegar a clase label
      // JLabel constructor with string, Icon and alignment arguments
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
// esta recebendo dois parametros, o texto e a imagem, e o swingconstants fara o alinhamento.
      label2 = new JLabel("Label with text and icon", bug, 
         SwingConstants.LEFT);
      label2.setToolTipText("This is label2");
      add(label2); // add label2 to JFrame
// declaracao de varivavel depois do "=" "atribuilção"
      label3 = new JLabel(); // JLabel constructor no arguments
      label3.setText("Label with icon and text at bottom");
// reutização do comando bug declarado antes
      label3.setIcon(bug); // add icon to JLabel
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
// define a posição do texto para baixo, BOTTOM
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      label3.setToolTipText("This is label3");
      add(label3); // add label3 to JFrame
// fechamento do construtor
   } 
// fechamento da classe
} // end class LabelFrame
