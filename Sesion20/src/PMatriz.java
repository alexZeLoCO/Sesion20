import java.util.Scanner;		//IMPORTA SCANER

/**
 * @author UO281827 - RODRÍGUEZ LÓPEZ, ALEJANDRO
 * 	EL USUARIO DEFINIRÁ UNA MATRIZ Y EL PROGRAMA SUMARÁ LOS ELEMENTOS DE CADA COLUMNA.
 *
 */
public class PMatriz {
	
	/**
	 * 
	 * @param teclado
	 * @return MATRIZ DEFINIDA POR EL USUARIO
	 */
	public static int [][] creaMatriz (Scanner teclado) {
		System.out.print("Introduzca número de filas: ");		//SOLICITA VALOR
		int filas = teclado.nextInt();			//SOLICITA FILAS DE MATRIZ
		int [] [] matriz = new int [filas] [filas];			//CREA MATRIZ DE TAMAÑO DEFINIDO

		System.out.print("Introduzca los valores de la matriz separados por espacios: ");			//SOLICITA VALORES
		for (int i=0;i<filas;i++) {			//COLUMNAS
			for (int j=0;j<filas;j++) {				//FILAS
				matriz [i] [j] = teclado.nextInt();			//RELLENAR MATRIZ
			}
		}
		return matriz;		//RETURN MATRIZ
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int  [][] matriz = creaMatriz(teclado);			//CREA MATRIZ Y DA VALOR CON SUBRUTINA
			
		for (int i=0;i<matriz[1].length;i++) {			//PARA CADA FILA
			int suma = 0;							//CREA SUMA
			for (int j=0;j<matriz.length;j++) {				//PARA CADA ELEMENTO DE LA COLUMNA
				suma = suma + matriz [j] [i];		//CALCULA SUMA
			}
					//OUTPUT
			System.out.printf("La suma de los elementos en la columna %d es %d.\n", i+1,suma);				
		}
		
	}

}
