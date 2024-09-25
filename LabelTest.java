// A linha abaixo importara o componente JFrame do modulo swing da biblioteca (pacote) javax
import javax.swing.JFrame;

// A linha abaixo esta declarando a classe LabelTest
public class LabelTest 
//...
{
//... A linha abaixo esta declarando o método main
   public static void main(String[] args)
   //...
   { 
      // A linha abaixo esta declarando LabelFrame que é do tipo LabelFrame (construtor), declarando a váriavel
         LabelFrame labelFrame = new LabelFrame(); 

         // A linha abaixo esta definido a operação de fechamento padrão
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // A linha abaixo define (setar) o tamanho
      labelFrame.setSize(260, 180); 

      // A linha abaixo diz aparece ai, se mostra, true é o verdadeiro
      labelFrame.setVisible(true); 

      // Na linha abaixo a gente encerra o bloco de códigos do método
   } 

   // Nesta linha encerramos o bloco de código da classe
} // end class LabelTest


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
