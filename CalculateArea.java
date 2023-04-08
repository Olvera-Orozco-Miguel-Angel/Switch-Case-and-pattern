import java.util.Scanner;
public class CalculateArea {
    public static void main(String[] michelangelo) {
        Scanner scanner = new Scanner(System.in);

        char figureGeometric = 'f';
        double base   = 0;
        double height = 0;
        double radius = 0;
        double length = 0;
        double width  = 0;

        System.out.println(" Enter \n 'a' to calculate triangle \n 'b' to calculate Square area " +
                            "\n 'c' to calculate circle area \n 'd' to calculate Rectangle area\n do it down...");
        figureGeometric = scanner.next().charAt(0);

        switch (figureGeometric){

            case 'a':
                System.out.println("Enter the triangle base ");
                base = scanner.nextDouble();
                System.out.println("Enter the triangle height");
                height = scanner.nextDouble();
                System.out.println(" Triangle area is: "+(( base * height )/2)+" ");
                break;

            case 'b':
                System.out.println("Enter the length square");
                length  = scanner.nextDouble();
                System.out.println("The square area is"+(length  * length ));
                break;

            case 'c':
                System.out.println("Enter the circule radius ");
                radius = scanner.nextDouble();
                System.out.println("The square area is "+(Math.PI * Math.pow(radius,2)));
                break;

            case 'd':
                System.out.println("Enter the rectangle length and width ");
                length = scanner.nextDouble();
                width  = scanner.nextDouble();
                System.out.println("The rectangle area is "+( length * width ));
                break;

            default:
                System.out.println("Option not allowed... ");
                break;
        }
    }
}
