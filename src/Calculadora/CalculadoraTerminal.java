package Calculadora;
import java.util.Scanner;

public class CalculadoraTerminal {

   public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       //Declaração de variáveis;
       Double number1;
       Double number2;
       String operation;
       Boolean continuar;


       //Estrutura de controle para entrada de dados e tomada de decisão;
       do{
           System.out.println("Informe o primeiro valor");
           number1 = input.nextDouble();
           System.out.println("Informe a operação desejada: +, -, *, / ");
           operation = input.next();
           System.out.println("Informe o segundo valor");
           number2 = input.nextDouble();
           System.out.println("Resultado:" + RealizarOperacao(  number1,  number2, operation));
           continuar = VerificarNewOperacao();
       }while(continuar);
   }

   //Metodo para tomada de decisão.
    public static boolean VerificarNewOperacao() {
        Scanner read = new Scanner(System.in);
        System.out.println("Deseja realizar uma nova operação (S ou N)");
        return !read.nextLine().toUpperCase().equals("N");
   }


   //Metodo criado para a realização dasoperações;
   public static Double RealizarOperacao( Double number1, Double number2, String operation){
       Double resultCalculo = 0.0;
       switch (operation){
           case "+":
               resultCalculo = number1 + number2;
               break;
           case "-":
               resultCalculo = number1 - number2;
               break;
           case "*":
               resultCalculo = number1 * number2;
               break;
           case "/":
               resultCalculo = number1 / number2;
               break;
           default:
               System.out.println("Opção inválida");
       }
       return resultCalculo;
   }
}