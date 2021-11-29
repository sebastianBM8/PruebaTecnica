package PruebaTecnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bloques {
	 public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				

			List<String> coleccionBloques = new ArrayList<>();
			coleccionBloques.add("  ");
			coleccionBloques.add("BO"); // 0
			coleccionBloques.add("XK"); // 1
			coleccionBloques.add("DQ"); // 2
			coleccionBloques.add("CP"); // 3
			coleccionBloques.add("NA"); // 4
			coleccionBloques.add("GT"); // 5
			coleccionBloques.add("RE"); // 6
			coleccionBloques.add("TG"); // 7
			coleccionBloques.add("QD"); // 8
			coleccionBloques.add("FS"); // 9
			coleccionBloques.add("HU"); // 10
			coleccionBloques.add("VI"); // 11
			coleccionBloques.add("AT"); // 12
			coleccionBloques.add("OB"); // 13
			coleccionBloques.add("ER"); // 14
			coleccionBloques.add("FS"); // 15
			coleccionBloques.add("LY"); // 16
			coleccionBloques.add("PC"); // 17
			coleccionBloques.add("ZM"); // 18
			coleccionBloques.add("JW"); // 19
			coleccionBloques.add("  ");
			
			 /*{{"B", "O"}, {"X", "K"}, {"D", "Q"}, {"C", "P"}, {"N", "A"}, 
					{"G", "T"}, {"R", "E"}, {"T", "G"}, {"Q", "D"}, {"F", "S"},
					{"H", "U"}, {"V", "I"}, {"A", "T"}, {"O", "B"}, {"E", "R"}, 
					{"F", "S"}, {"L", "Y"}, {"P", "C"}, {"Z", "M"}, {"J", "W"}};*/
			
			
			System.out.println(metodoAuxiliar(coleccionBloques, "arlequin"));
			
			

		}
		
		public static boolean metodoAuxiliar(List<String> coleccionBloque, String palabraValidar) {

			List<String> coleccionBloqueAuxiliar = coleccionBloque;

			String palabraFormateada = palabraValidar.toUpperCase();
			char[] letras = palabraFormateada.toCharArray();
			
			boolean eliminoElemento = false;
			int segundaFila = 0;
			int finalizarMetodo = 0;
			int finalizoSegunda = 0;

			for (int i = 0; i < coleccionBloqueAuxiliar.size(); i++) {
				char[] letrasBloque = coleccionBloqueAuxiliar.get(i).toCharArray();
				eliminoElemento = false;
				
				if (finalizarMetodo == 1) {
					break;
				}
				
				for (int j2 = 0; j2 < letras.length; j2++) {
					for (int j = segundaFila; j < letrasBloque.length;) {
						
						if (letras[j2] == letrasBloque[j]) {
							coleccionBloqueAuxiliar.remove(i);
							letras[j2] = '-';
							eliminoElemento = true;
							i = 0;
							break;
						} 
						
						if(i == coleccionBloqueAuxiliar.size()-1){
							segundaFila=1;
							i = 0;
							finalizoSegunda++;
							if (finalizoSegunda == 3) {
								finalizarMetodo =1;
							}						
						} else {
							break;
						}
					}
					
					if (eliminoElemento) {
						break;
					}
				}
			}
			
			for (int i = 0; i < letras.length; i++) {
				if (letras[i] != '-') {
					return false;
				}
			}
			return true;
		}
}