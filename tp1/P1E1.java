package P1E1;
public class Main{
    public static void main(String [] args){
        int argumentos[] = new int[2];
        argumentos[0] = 1;
        argumentos[1] = 88;
        System.out.println("Con el for:");
        conFor(argumentos);
        System.out.println("Con el while: ");
        conWhile(argumentos);
        System.out.println("Recursivo:");
        recursivo(argumentos);
        
    }
    public static void conFor(int [] args){
        if ((args.length == 0) || (args.length > 2)){
            System.out.println("Cantidad de argumentos incorrecta");
            return;
        }
        for (int a = args[0]; a <= args[1]; a++){
            System.out.print(a + "|");
        }
    }
    public static void conWhile(int [] args){
        if ((args.length == 0) || (args.length > 2)){
            System.out.println("Cantidad de argumentos incorrecta");
            return;
        }
        int a = args[0];
        while (a <= args[1]){
            System.out.print(a + "|");
            a++;
        }
    }
    public static void recursivo(int [] args){
        if ((args.length == 0) || (args.length > 2)){
            System.out.println("Cantidad de argumentos incorrecta");
            return;
        }
        if (args[0] <= args[1]){
            System.out.print(args[0] + "|");
            args[0]++;
            recursivo(args);
        }
    }
}
