package PruebaTecnica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;



class Pruebas {
	Bloques b= new Bloques();
	

		
	@Test
	void test() {
		List<String> coleccionBloques = new ArrayList<>();
		coleccionBloques.add("  ");
		coleccionBloques.add("BO");
		coleccionBloques.add("XK");
		coleccionBloques.add("DQ");
		coleccionBloques.add("CP");
		coleccionBloques.add("NA");
		coleccionBloques.add("GT");
		coleccionBloques.add("RE");
		coleccionBloques.add("TG");
		coleccionBloques.add("QD");
		coleccionBloques.add("FS");
		coleccionBloques.add("HU");
		coleccionBloques.add("VI");
		coleccionBloques.add("AT");
		coleccionBloques.add("OB");
		coleccionBloques.add("ER");
		coleccionBloques.add("FS");
		coleccionBloques.add("LY");
		coleccionBloques.add("PC");
		coleccionBloques.add("ZM");
		coleccionBloques.add("JW");
		coleccionBloques.add("  ");

	
		
		assertTrue(b.metodoAuxiliar(coleccionBloques, "A"));
		assertTrue(b.metodoAuxiliar(coleccionBloques, "LIBRO"));
		assertFalse(b.metodoAuxiliar(coleccionBloques, "BOZO"));
		assertTrue(b.metodoAuxiliar(coleccionBloques, "TRAJE"));
		assertTrue(b.metodoAuxiliar(coleccionBloques, "COMUN"));
		assertFalse(b.metodoAuxiliar(coleccionBloques, "CAMPANA"));
		assertTrue(b.metodoAuxiliar(coleccionBloques, "DORITO"));
		assertTrue(b.metodoAuxiliar(coleccionBloques, "ARLEQUIN"));
		
		
		
	
		
		
		
	
		
	
}
}
