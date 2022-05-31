

import java.util.ArrayList;

import javax.swing.JOptionPane;

import moneda.Moneda;
import servicios.Servicio;

public class Decoder {

	public static void main(String[] args) {
		
		Servicio s = new Servicio();
		ArrayList<Moneda>listaDeMonedas=new ArrayList<Moneda>(s.listaMonedas());
		boolean seguir=false;
		
		do {
			if (s.elegirFuncion()=="Conversión de moneda") {
				
				seguir=s.conversion(s.elegirConversion(listaDeMonedas));
				
				
			}else {
				
			}
		} while (seguir==true);
			JOptionPane.showMessageDialog(null,"Programa finalizado");
				
	}
	
	
}

