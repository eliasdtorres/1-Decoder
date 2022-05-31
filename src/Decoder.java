

import servicios.Servicio;

public class Decoder {

	public static void main(String[] args) {
		
		Servicio s = new Servicio();
		
		
		if (s.elegirFuncion()=="Conversión de moneda") {
			s.conversion(s.elegirConversion(s.listaMonedas()));
		}
			
	}
	
	
}

