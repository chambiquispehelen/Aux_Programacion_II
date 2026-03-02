package y_Aux_Programacio_II;

public class Instrumento {
	public String nombre;
	private String material;
	private String tipo;
	
	//constructor
	public Instrumento(String nom,String mat, String tip) {
		this.nombre = nom;
		this.material = mat;
		this.tipo = tip;
	}
	public String toString() { //tostring : muestra los datos dentro de la clase
		return "nombre: "+ this.nombre + " material: "+ this.material + " tipo: " + this.tipo;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
