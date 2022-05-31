

import java.util.ArrayList;

import javax.swing.JOptionPane;

import entidades.Moneda;
import entidades.UnidadDePeso;
import servicios.ServicioMoneda;
import servicios.ServicioPeso;

public class Decoder {

	public static void main(String[] args) {
		
		ServicioMoneda sm = new ServicioMoneda();
		ServicioPeso sp = new ServicioPeso();
		ArrayList<UnidadDePeso>listaDeUnidades= new ArrayList<UnidadDePeso>(sp.listaDeUnidades());
		ArrayList<Moneda>listaDeMonedas=new ArrayList<Moneda>(sm.listaMonedas());
		boolean seguir=false;
		
		do {
			if (sm.elegirFuncion()=="Conversión de moneda") {
				
				seguir=sm.conversion(sm.elegirConversion(listaDeMonedas));
				
				
			}else {
				seguir=sp.conversion(sp.elegirConversion(listaDeUnidades));
			}
		} while (seguir==true);
			JOptionPane.showMessageDialog(null,"Programa finalizado");
				
	}
	
	
}

