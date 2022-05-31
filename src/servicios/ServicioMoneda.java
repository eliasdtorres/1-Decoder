package servicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import entidades.Moneda;

public class ServicioMoneda {
	
	ArrayList<Moneda>listaDeMonedas=new ArrayList<Moneda>();	
	
	double valorACodificar=0;
	
	public ArrayList<Moneda> listaMonedas() {
		Moneda ars=new Moneda("Peso argentino", "ARS",0, 0.008262, 119.550010 );
		Moneda usd=new Moneda ("Dòlar estadounidense", "USD",0, 1, 1);
		Moneda sol=new Moneda("Sol peruano", "SOL",0,0.272244, 3.673030);
		Moneda pyg=new Moneda("Guaranì paraguayo", "PYG",0, 0.0001597, 6862.692168);
		//Se crea lista de monedas
		listaDeMonedas.add(usd);
		listaDeMonedas.add(ars);		
		listaDeMonedas.add(sol);
		listaDeMonedas.add(pyg);
		
		return listaDeMonedas;
			
	}

	
	public ArrayList<Moneda> elegirConversion(ArrayList<Moneda>listaDeMonedas) {
		
		String[]listadoMonedas=new String[listaDeMonedas.size()];
		ArrayList<Moneda>monedasElegidas=new ArrayList<Moneda>();
		
		
		
		for (int i = 0; i <= listaDeMonedas.size()-1; i++) {
			listadoMonedas[i]=listaDeMonedas.get(i).getNombre();	
		}
			
			String moneda1 = String.valueOf(JOptionPane.showInputDialog(null, "Seleccione una moneda para cambiar",	"Tipo de moneda", 1, null,listadoMonedas, null));
			
			for (Moneda aux : listaDeMonedas) {
				if(moneda1.equals(aux.getNombre())) {
					monedasElegidas.add(aux);
				}
			}
			
			try {//seteo a la primer moneda elegida el valor que se quiere convertir
				monedasElegidas.get(0).setValorACodifcar(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir", 0)));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Debe ingresar valores numèricos");
				
			}
			
			
			String moneda2 = String.valueOf(JOptionPane.showInputDialog(null, "Seleccione tipo de moneda a cambiar","Tipo de moneda", 1, null,listadoMonedas, null));
			for (Moneda aux : listaDeMonedas) {
				if(moneda2.equals(aux.getNombre())) {
					monedasElegidas.add(aux);
				}
			}
		
		
		
		return monedasElegidas;  
		
	}
	
	public boolean conversion(ArrayList<Moneda>monedasElegidas) {
			try {
				JOptionPane.showMessageDialog(null, monedasElegidas.get(0).getValorACodificar()*monedasElegidas.get(0).getValorAUsd()*monedasElegidas.get(1).getValorUnUsd() + " "+ monedasElegidas.get(1).getAbreviatura());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"No hay datos cargados para realizar el calculo");
			}
		
			
			return deseaSeguir();
	}
	
	
	
	//metodos de funcionalidades
	public String elegirFuncion() {
		
		String[] listaDeFunciones = { "Conversión de moneda", "Convertidor de unidades de peso" };
		
		// Cuadro de diálogo para elegir funcion
		String funcionElegida=String.valueOf(JOptionPane.showInputDialog(null, "Seleccione una opción de conversión","Menú", 1, null, listaDeFunciones, null));
		
		return funcionElegida;
	}
	
	
	public boolean deseaSeguir(){
		boolean seguir=false;
		Integer res =JOptionPane.showConfirmDialog(null, "Desea continuar","Continuar", 1);
		if (res==0) {
			seguir=true;
		}
		return seguir;
	}

	
	

	
	
	
	
	

	

}


