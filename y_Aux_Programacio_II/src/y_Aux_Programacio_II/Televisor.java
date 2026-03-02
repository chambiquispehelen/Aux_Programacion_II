package y_Aux_Programacio_II;

public class Televisor {
	private String marca;
	private int resolucion;
	private String tipo;
	
	//constructor
	public Televisor(String mar,int reso, String tip) {
		this.marca = mar;
		this.resolucion = reso;
		this.tipo = tip;
	}
	public String toString() { //tostring : muestra los datos dentro de la clase
		return "marca: "+ this.marca + " resolucion: "+ this.resolucion + " tipo: " + this.tipo;
	}
	public Televisor() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

