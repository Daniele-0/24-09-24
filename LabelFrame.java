// As linhas abaixo importam de certo a biblioteca
import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 

// A linha abaixo diz que o (extends) esta herdando o componente (JFrame), tudo o que o JFrame tem podemos usar no bloco de códigos
public class LabelFrame extends JFrame 

// Na linha abaixo estamos iniciando o bloco de códigos da LabelFrame
{
   // As 3 linhas abaixos são declaração de váriaveis de um modo genérico ( o Private não exporta a váriavel), o (final) serve para declarar uma váriavel somente leitura e o JLabel é o tipo da váriavel, no caso elas só se diferenciam pelo numero
   private final JLabel label1; 
   private final JLabel label2; 
   private final JLabel label3; 

   // Na linha abaixo ele é o construtor, tem que ser flexivel, váriavel, ele só oferece as coisas e não precisa de paramentros pois usa a váriavel da classe que tem o mesmo nome do arquivo e da classe (LabelFrame)
   public LabelFrame()

   // inicio do bloco de código do construtor (JLframe)
   {

      // O super(parte superior da tela) significa que estamos definindo o titulo da janela, e o texto da parte superior precisa ter aspas duplas "testing JLabel"
      super("Testing JLabel");

      // Na linha abaixo ele define o desenho (layout) do desenho, como vai ficar as saidas das camadas,como parametro enviamos o  flowlayout (novo objeto) onde esta tudo espalhado no chão, definindo a saida das camadas
         setLayout(new FlowLayout()); 

      // Na linha abaixo ele esta recebendo um novo objeto, um texto por exemplo
      label1 = new JLabel("Label with text");

      // Na linha abaixo esta usando um operador de invoção, definindo um parametro, chamando o método de dica, definido um texto nesta ferramenta, ele faz isso quando coloca o mouse em cima do elemento ( ai um texto aparece)
      label1.setToolTipText("This is label1");

      // Na linha abaixo ele adciona o level1, o tipo de objeto e a dica de colocar o mouse em cima. O Add irá mostrar na saida de camadas, reimprimir, mostrar
      add(label1); // add label1 to JFrame

      // Na Linha abaixo declara uma váriavel do tipo Icon que recebe um novo objeto do tipo (imageIcon), esta enviando um parametro com metodos, que ele envia a classe e se apropia da classe LabelFrame, depois ele a coleta e invoca o recurso (getResource)      
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));

      // Na linha abaixo, ela esta recebendo um objeto de label, e também um outro parametro, (usando a (,) que dentro da declaração de parametros, ela serve para separar, separar parametros, matrizes, entre outro. virgula é sepador se ela estiver entre parenteses). Feito isso ela define um alinhamento do bug e nao do texto. o SwingConstants tem informações sobre alinhamento (inferior,superio etc) que chama a variavel LEFT (screamcrease) não pode mudar a variavel em hipotese alguma. que é um alinhamento do bug, que no caso esta alinhando o bug a esquerda
     label2 = new JLabel("Label with text and icon", bug, 
         SwingConstants.LEFT);
         label2.setToolTipText("This is label2");
      add(label2); 

      // Na linha abaixo ele esta atribuindo um objeto
      label3 = new JLabel(); // JLabel constructor no arguments

      // na linha abaixo ele esta definindo um texto

      // Na linha abaixo esta definindo o icone que é o bug
      label3.setText("Label with icon and text at bottom");

      // Definindo a posição do texto horizontal
      label3.setIcon(bug); // add icon to JLabel

      // Definindo a posição horizontal do de texto, a posição será ao centro
      label3.setHorizontalTextPosition(SwingConstants.CENTER);

      // Esta definindo a posição vertical do texto para baixo, e o icone vai para cima
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);

      // Quando coloca o mouse no texto ou no icone ele mostra a dica: (este é o rotulo 3, ou esta é o texto 3)
      label3.setToolTipText("This is label3");

      // O fluxo dele é por ultimo
      add(label3); // add label3 to JFrame

      //Fechamento de chave do contrutor
   } 

   // Este fechamento é da Classe
} // end class LabelFrame


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
