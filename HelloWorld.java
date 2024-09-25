public class HelloWorld { //Aqui é criada a classe Hello World
    public static void main (String[] args) { // aqui é criada a classe main
       System.out.println("Hello World!!!"); // aqui é "impressa uma linha com o texto "Hello World"
    } // aqui encerra o bloco de código do método main
} // aqui encerra o bloco de código da classe HelloWorld

 /** public: declaração de "exporta" e permite que a classe/método/variável seja importada/reutilizada em outras classes/objetos
  *class: declaração de clsse (que poderá se tornar um objeto)
  *HelloWorld: nome da classe, seguindo o padrao de nomeclatura PascalCase
  *{"abre" chave}:serve para declarar o inicio de um bloco de códigos/ações
  *{"fecha" chave}: serve para declarar o fim de um bloco de códigos/ações
  **/
  public class HelloWorld {//Aqui é criada a classe HelloWorld
    /*
    * static: declaração de método somente leitura, o qual não poderá ser editado,exceto pelo uso de @override
    * void: modo protegido de um método, o qual não retornará qualquer valor
    * main: nome do método "executor"
    *(abre parênteses): serve para declarar o inicio das declarações de parâmetros de um método/função
    * @param args
    * System: invoca a classe de sistema
    *. (ponto): serve como operador de invocação de método
    * out: invoca a subclasse de saída do sistema
    * println: invoca o método, ou função abstrata, o qual irá "imprimir" na tela uma string 
    * "HelloWorld": texto (string) que será "impresso" na tela 
    * ; (ponto e virgula): serve para de encerrar uma linha de código 
     */
    public static void main (string[]args) {// Aqui é criado o método executor main
        System.out.println("HelloWorld!!!"); //Aqui é "impressa" uma linha com texto "HelloWorld"
    } // Aqui encerra o bloco de código do método main
} // Aqui encerra o bloco de código de classe HelloWorld 
  