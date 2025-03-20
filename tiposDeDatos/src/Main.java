import java.util.Scanner;
import java.util.concurrent.Flow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*
        System.out.println("Tipos de datos y su valor\n" +
                "------------------------------------ ");
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("char: " + Character.MIN_VALUE + " a " + Character.MAX_VALUE);
    */
    Scanner entrada = new Scanner(System.in);
    Scanner entradaNombre = new Scanner(System.in);

        System.out.println("ingrese un valor numerico:   ");
        byte numeroUno = entrada.nextByte();
        System.out.println("ingrese otro valor numerico:   ");
        byte numeroDos = entrada.nextByte();

        int suma = numeroUno+ numeroDos;
        int resta = numeroUno - numeroDos;
        int multiplicacion = numeroUno * numeroDos;
        int division = numeroUno / numeroDos;


        System.out.println("La suma es: " + suma +"\n"+
                "la resta es: "+ resta +"\n"+
                "la multiplicación es: "+ multiplicacion+"\n"+
                "la division es: "+ division);


        System.out.println("Ingresa tu nombre:");
        String nombre = entradaNombre.nextLine();
        System.out.println("Bienvenido " + nombre);


    }
}
