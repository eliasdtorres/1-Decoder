package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import entidades.UnidadDePeso;

public class servicioPeso {
	
	ArrayList<UnidadDePeso>listaDeUnidades=new ArrayList<UnidadDePeso>();	
	double[]valores=new double[4];	
	double valorAConvertir=0;
	
	public ArrayList<UnidadDePeso> listaMonedas() {
		UnidadDePeso t=new UnidadDePeso("Tonelada", "T",0.0,1000);
		UnidadDePeso kg=new UnidadDePeso("Kilogramo", "Kg",0, 1);
		UnidadDePeso g=new UnidadDePeso("Gramo", "G",0,0.001);
		UnidadDePeso mg=new UnidadDePeso("Miligramo", "Mg",0,0.00001);
		UnidadDePeso lb=new UnidadDePeso("Libra","Lb",0,0.453592);
		UnidadDePeso oz=new UnidadDePeso("Onza","Oz",0,0.02834950000001049);
		//Se crea lista de unidades
		listaDeUnidades.add(t);
		listaDeUnidades.add(kg);		
		listaDeUnidades.add(g);
		listaDeUnidades.add(mg);
		listaDeUnidades.add(lb);
		listaDeUnidades.add(oz);
		
		return listaDeUnidades;
			
	}
		
		
	public ArrayList<UnidadDePeso> elegirConversion(ArrayList<UnidadDePeso>listaDeUnidades) {
			
			String[]listadoUnidades=new String[listaDeUnidades.size()];
			ArrayList<UnidadDePeso>unidadesElegidas=new ArrayList<UnidadDePeso>();		
			
			for (int i = 0; i <= listaDeUnidades.size()-1; i++) {
				listadoUnidades[i]=listaDeUnidades.get(i).getNombre();	
			}
				
				String unidad1 = String.valueOf(JOptionPane.showInputDialog(null, "Seleccione una unidad a convertir",	"Unidad", 1, null,listadoUnidades, null));
				
				for (UnidadDePeso aux : listaDeUnidades) {
					if(unidad1.equals(aux.getNombre())) {
						unidadesElegidas.add(aux);
					}
				}
				
				try {//seteo a la primer moneda elegida el valor que se quiere convertir
					unidadesElegidas.get(0).setValorAConvertir(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir", 0)));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Debe ingresar valores numèricos");
					
				}
				
				
				String unidad2 = String.valueOf(JOptionPane.showInputDialog(null, "Seleccione una unidad a convertir",	"Unidad", 1, null,listadoUnidades, null));
				for (UnidadDePeso aux : listaDeUnidades) {
					if(unidad2.equals(aux.getNombre())) {
						unidadesElegidas.add(aux);
					}
				}	
						
			return unidadesElegidas;  
			
		}
		
	
	
	
	
}
