import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int valor = sc.nextInt();
        String cadena = sc.nextLine();
        char valorCaracter = sc.next().charAt(0);
switch (valor){
        case 1:
            System.out.println("Entro en el case 1...");
        break;
        case 2:
            System.out.println("Este es el caso 2....");
        break;
        default:
            System.out.println("No existe el caso...");
            break;
}
        System.out.println("Ingresa un valor de cadena");
        cadena = sc.nextLine();
switch (cadena){
    case "hola":
        System.out.println("Que es lo que tu quiere hola");
        break;
    default:
        System.out.println("Aquí no ingreso nada");

}
        System.out.println("Ingrse el caracter perro");


switch (valorCaracter) {
    case 'h':
        System.out.println("Entreo en case h");
        break;
    case 'o':
        System.out.println("Entre en la o");
    defult:
    System.out.println("Opción invalida");
}

    }
}