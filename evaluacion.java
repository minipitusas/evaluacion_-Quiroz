import java.util.Scanner;

public class evaluacion {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de empreados");
        int cnombre = entrada.nextInt();
		
		String [] nombre = new String [cnombre];
		String [] apellido = new String [cnombre];
        int [] numdelegajo = new int [cnombre];
        
		for (int i = 0 ; i < cnombre ; i ++) {
			System.out.println("Ingrese el nombre:");
			nombre[i] = entrada.next();
			System.out.println("Ingrese el apellido:");
			apellido[i] = entrada.next();
			System.out.println("Ingrese el numero de legajo de cinco cifras:");
            numdelegajo[i] = entrada.nextInt();
            if (numdelegajo[i] < 9999 ) {
            	System.err.println("esta mal :( vuelve a itentarlo");
                numdelegajo[i] = entrada.nextInt();
            }
                if (numdelegajo[i] > 100000 ) {
                	System.err.println("esta mal :( vuelve a itentarlo");
                    numdelegajo[i] = entrada.nextInt();    
            }
            
		}
		for (int i = 0; i < (numdelegajo.length - 1); i++) {

			for (int j = 0; j < (numdelegajo.length - i - 1); j++) {

				if (numdelegajo[j] > numdelegajo[j + 1]) {

					int temporal = numdelegajo[j];

					numdelegajo[j] = numdelegajo[j + 1];

					numdelegajo[j + 1] = temporal;
				}
				
				System.out.println("\n Numeros ordenado de menor a mayor:");
				for (int num : numdelegajo) {
					System.out.print(num + " ");
				}

			}
		}		
		
		System.out.println("\n Ingrese el numero de legajo que uieres buscar:");
		int pa = entrada.nextInt();
		
		for (int i = 0 ; i < cnombre ; i ++) {
			if (pa == numdelegajo[i]) {
				System.out.println("el numero de legajo de la persona es: " + numdelegajo[i]);
				System.out.println("el nombre de la persona es: " + nombre[i]);
				System.out.println("el apellido de la persona es: " + apellido[i]);
			}
			
			
		}
		System.out.println("\nFin de la progamacion");
	}

}
