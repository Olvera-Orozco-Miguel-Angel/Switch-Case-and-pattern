import java.util.Scanner;
public class CalculadoraSwitch {
    public static void main( String []michelangelo){
    /*
       * cuando queremos realizar diferentes acciones basadas en el valor de una variable o expresion
       * por lo regular cuando hay opciones
     * */

    Scanner scanner  = new Scanner(System.in);
    int number1 = 0;
    int number2 = 0;
    char operation ='n' ;
    //11:40

        System.out.println("\tCalculator");
        System.out.println("Enter two numbers ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        System.out.println("Choose the operation you want to do " +
                " \n+ Addition\n- Subtraction\n* multiplication \n/ division");
        operation = scanner.next().charAt(0);
        switch (operation ){

            case '+':
                System.out.println(number1+" + "+number2+" = "+(number1+number2));
                break;

            case '-':
                System.out.println(number1+" - "+number2+" = "+(number1-number2));
                break;

            case '*':
                System.out.println(number1+" * "+number2+" = "+(number1*number2));
                break;

            case '/':
                System.out.println(number1+" / "+number2+" = "+(number1/number2));

                break;
            default:
                    System.out.println("Operation not allowed");
                break;

        }



    }
}
