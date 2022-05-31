

import java.util.ArrayList;

import javax.swing.JOptionPane;

import entidades.Moneda;
import servicios.ServicioMoneda;

public class Decoder {

	public static void main(String[] args) {
		
		ServicioMoneda s = new ServicioMoneda();
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

