package P1E5;
public class Main{
    
    public static void main(String [] args){
        int vector[] = {2, 5, 6 , 1 , 7, 13, 513, 47, 341, 734, 71};
        int resultado[] = a(vector);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
    
    //a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
    public static int[] a(int vector[]){
        int resultado[] = new int [3];
        resultado[0] = -999999;
        resultado[1] = 999999;
        resultado[2] = 0;
        for (int i = 0; i < vector.length; i++) { //maximo, minimo, promedio
            if (vector[i] > resultado[0] ){
                resultado[0] = vector[i];
            }
            if (vector[i] < resultado[1]){
                resultado[1] = vector[i];
            }
            resultado[2] += vector[i];
        }
        resultado[2] = resultado[2] / vector.length;
        return resultado;
    }
}

/*
    Dado un arreglo de valores tipo entero se desea calcular el valor máximo, mínimo, y promedio
    en un único método. Escriba tres métodos de clase, donde respectivamente:

    
    b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de
    tipo arreglo).
    c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".
*/
