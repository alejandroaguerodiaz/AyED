package P1E2;
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar n:");
        int n =  scan.nextInt(); 
        int resultado[] = multiplos(n);
        printIntArray(resultado);
        scan.close();
    }
    public static int[] multiplos(int x){
        int vec[] = new int [5];
        for (int n = 1, i = 0; i < 5; i++, n++){
            vec[i] = n * x;
        }
        return vec;
    }
    public static void printIntArray(int x []){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + "|");
        }
        System.out.println();
    }
}

/*
Escriba un método de clase que dado un número n devuelva un nuevo arreglo de tamaño n
con los n primeros múltiplos enteros de n mayores o iguales que 1.
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {n*k donde k : 1..k}
Agregue al programa la posibilidad de probar con distintos valores de n ingresandolos por
teclado, mediante el uso de System.in. La clase Scanner permite leer de forma sencilla
valores de entrada.
*/
