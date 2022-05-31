package moneda;

public class Moneda {
	
	private String nombre="";
	private String abreviatura="";
	private double valorACodificar=0;
	private double valorAUsd=0;
	private double valorUnUsd=0;
	
	
	
	public Moneda() {
		super();
	}
	public Moneda(String nombre, String abreviatura, double valorACodificar, double valorAUsd, double valorUnUsd) {
		super();
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.valorACodificar = valorACodificar;
		this.valorAUsd = valorAUsd;
		this.valorUnUsd = valorUnUsd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public double getValorACodificar() {
		return valorACodificar;
	}
	public void setValorACodifcar(double valorACodificar) {
		this.valorACodificar = valorACodificar;
	}
	
	public void setValorACodificar(double valorACodificar) {
		this.valorACodificar = valorACodificar;
	}
	public double getValorAUsd() {
		return valorAUsd;
	}
	public void setValorAUsd(double valorAUsd) {
		this.valorAUsd = valorAUsd;
	}
	public double getValorUnUsd() {
		return valorUnUsd;
	}
	
	public void setValorUnUsd(double valorUnUsd) {
		this.valorUnUsd = valorUnUsd;
	}
	
	
	@Override
	public String toString() {
		return "Moneda [Nombre: " + nombre + "] [Abreviatura: " + abreviatura + "] [Valor a codificar: " + valorACodificar + "] [Valor a USD: "
				+ valorAUsd + "] [Valor Propio USD (un dólar equivalente): " + valorUnUsd + "]";
	}
	
	
}
