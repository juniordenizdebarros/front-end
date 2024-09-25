// a linha abaixo importara o componente jframe do modelo swing da biblioteca (pacote) javax
import javax.swing.JFrame;

// a linha abaixo esta declarando a classe labeltest
public class LabelTest 
{
// a linha abaixao esta declando o metodo main
   public static void main(String[] args)
   { 
// esta declarando a variavel labelframe, é do tipo labelframe
      LabelFrame labelFrame = new LabelFrame(); 
// esta declarando fechamento 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// definir o tamanho
      labelFrame.setSize(260, 180); 
// comando para tornar visivel
      labelFrame.setVisible(true); 
// encerrar o bloco de comando do metodo main
   }  
// encerrar da classe label frame
} 
