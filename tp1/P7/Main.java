package e7;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		Estudiante e1 = new Estudiante("pepe", "pepo");
		Estudiante e2 = new Estudiante("a", "b");
		Estudiante e3 = new Estudiante("y", "z");
		
		if (!estudiantes.contains(e1)) {
			estudiantes.add(e1);
		}
		if (!estudiantes.contains(e1)) {
			estudiantes.add(e1);
		}
		estudiantes.add(e2);
		estudiantes.add(e3);
		
		ArrayList<Estudiante> estudiantes2 = new ArrayList<>();
		estudiantes2 = estudiantes;
		
		estudiantes2.get(1).setNombre("pepe2");
		
		for(int i = 0; i < estudiantes.size(); i++) {
			System.out.print(estudiantes.get(i).getNombre() + "|");
		}
		System.out.println();
		
		
		System.out.println("Ingrese un numero: ");
		int n = scan.nextInt();
		ArrayList<Integer> capicua = toDigitArrayList(n);
		System.out.println(isPalindrome(capicua));
		
		System.out.println("======================");
		int n2 = scan.nextInt();
		List<Integer> sucesion = calcularSucesion(n2);
		for (int i = 0; i < sucesion.size(); i++) {
			System.out.print(sucesion.get(i) + "|");
		}
		
		ArrayList<Integer> darVuelta = toDigitArrayList(123456);
		invertirArrayList(darVuelta);
		for (int i = 0; i < darVuelta.size(); i++) {
			System.out.print(darVuelta.get(i) + "|");
		}
		System.out.println("la suma es:" + sumaArrayList(darVuelta));
		
		
		ArrayList<Integer> detalle1 = toDigitArrayList(13579);
		ArrayList<Integer> detalle2 = toDigitArrayList(2468);
		
		ArrayList<Integer> maestro = merge(detalle1, detalle2);
		for (int i = 0; i < maestro.size(); i++) {
			System.out.print(maestro.get(i) + "|");
		}
		
	}
	
	// Hace un merge de dos listas, no se fija si estan repetidos
	public static ArrayList<Integer> merge(ArrayList<Integer> d1, ArrayList<Integer> d2){
		ArrayList<Integer> maestro = new ArrayList<>();
		int i = 0; int j = 0;
		
		while ((i < d1.size()) && (j < d2.size())) {
			if (d1.get(i) < d2.get(j)) {
				maestro.add(d1.get(i));
				i++;
			} else {
				maestro.add(d2.get(j));
				j++;
			}
		}
		
		// Si uno esta vacio ahora se vacia el resto del otro
		
		while (i < d1.size()) {
			maestro.add(d1.get(i));
			i++;
		}
		while (j < d2.size()) {
			maestro.add(d2.get(j));
			j++;
		}
		
		return maestro;
	}
	
	// Convierte a arraylist un int con signo
    public static ArrayList<Integer> toDigitArrayList(int n) {
        ArrayList<Integer> digitos = new ArrayList<>();
        
        while (n != 0) {
            int digito = n % 10;
            digitos.add(0, digito);    
            n /= 10;            
        }
        
        return digitos;
    }
    
    // Devuelve un boolean dependiendo de si es capicua o no
    public static boolean isPalindrome(ArrayList<Integer> lista) {
    	int primero = 0;
    	int ultimo = lista.size() - 1;
    	while (lista.get(primero).equals(lista.get(ultimo)) && (primero < ultimo)) {
    		primero++;
    		ultimo--;
    	}
    	return lista.get(primero).equals(lista.get(ultimo));
    }
    
    // Invierte el arraylist
    public static void invertirArrayList(ArrayList<Integer> list){
    	if(!list.isEmpty()) {
    		Integer ultimo = list.remove(list.size() - 1);
    		invertirArrayList(list);
    		list.add(ultimo);
    	}
    }
    
    public static int sumaArrayList(ArrayList<Integer> list) {
    	int x = 0;
    	if (!list.isEmpty()) {
    		x += list.remove(0);
    		x += sumaArrayList(list);
    	}
    	return x;
    }
    
    public static List<Integer> calcularSucesion(int n){
    	List<Integer> lista = new ArrayList<>();
    	if (n != 1) {
    		lista.add(n);
    		if(n % 2 == 0) {
    			lista.addAll(calcularSucesion(n / 2));
    		}
    		else {
    			lista.addAll(calcularSucesion(3 * n + 1));
    		}
    	}
    	if (n == 1) {
    		lista.add(n);
    	}
    	return lista;
    }
}
