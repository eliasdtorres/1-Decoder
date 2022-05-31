package entidades;

public class UnidadDePeso {

	private String nombre ="";
	private String abreviatura="";
	private double valorAConvertir=0;
	private double valorUnKilo=0;
	private double multiploAKilo=0;
	
	
	public UnidadDePeso() {
		
	}
	
	public UnidadDePeso(String nombre, String abreviatura, double valorAConvertir, double valorUnKilo,double multiploAKilo ) {
	
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.valorAConvertir = valorAConvertir;
		this.multiploAKilo = multiploAKilo;
		this.valorUnKilo=valorUnKilo;
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

	public double getValorAConvertir() {
		return valorAConvertir;
	}

	public void setValorAConvertir(double valorAConvertir) {
		this.valorAConvertir = valorAConvertir;
	}

	public double getMultiploAKilo() {
		return multiploAKilo;
	}

	public void setMultiploAKilo(double multiploAKilo) {
		this.multiploAKilo = multiploAKilo;
	}
	
	

	public double getValorUnKilo() {
		return valorUnKilo;
	}

	public void setValorUnKilo(double valorUnKilo) {
		this.valorUnKilo = valorUnKilo;
	}

	

	@Override
	public String toString() {
		return "Unidad de medida de peso [ Nombre: " + nombre + " ] [ Abreviatura: " + abreviatura + " ] [ Valor a convertir: "
				+ valorAConvertir + " ] [ Multiplo a kilo: " + multiploAKilo + " ] [ Multiplo a kilo: " + valorUnKilo + " ]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
