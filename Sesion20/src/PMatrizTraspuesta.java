import java.util.Scanner;
/**
 * @author UO281827
 * 	EL PROGRAMA RECIBE UNA MATRIZ CUADRADA, CALCULA SU TRASPUESTA Y LA IMPRIME
 *
 */
public class PMatrizTraspuesta {
	
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
	
	/**
	 * 
	 * @param matriz
	 * IMPRIME LA MATRIZ PASADA COMO PARÁMETRO
	 */
	public static void imprimeMatriz (int [] [] matriz) {
		for (int i=0;i<matriz.length;i++) {		//PARA CADA COLUMNA DE LA MATRIZ
			for (int j=0;j<matriz[i].length;j++) {		//PARA CADA ELEMENTO DE CADA FILA
				System.out.print(matriz[i][j]);			//OUTPUT
				System.out.print(" ");		//SEPARADOR
			}
			System.out.println();			//SALTO DE LÍNEA
		}
	}
	
	/**
	 * 
	 * @param matriz
	 * 	CALCULA LA MATRIZ TRASPUESTA
	 * @return MATRIZ TRASPUESTA
	 */
	public static int [][] trasponerMatriz (int [][] matriz) {
		int [][] matriztraspuesta = new int [matriz.length][matriz[1].length];	//CREA MATRIZ TRASPUESTA DE MISMO TAMAÑO QUE ORIGINAL
		for (int i=0;i<matriz.length;i++) {		//PARA CADA COLUMNA
			for (int j=0;j<matriz[1].length;j++) {		//PARA CADA FILA
				matriztraspuesta[i][j]=matriz[j][i];			//TRASPONER
			}
		}	
		return matriztraspuesta;			//RETURN MATRIZ TRASPUESTA
	}	
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);			//CREA TECLADO
		imprimeMatriz(trasponerMatriz(creaMatriz(teclado)));			//LLAMADA A SUBRUTINAS

	}

}
