package y_Aux_Programacio_II;

public class Anime {
	public String nombre;
	public String genero;
	private int nroEpisodio;
	private String[] episodio;
	
	//constructor
	public Anime(String nom,String gene, int nroEpi) {
		this.nombre = nom;
		this.genero = gene;
		this.nroEpisodio = nroEpi;
	
	}
	public String toString() { //tostring : muestra los datos dentro de la clase
		return "nombre: "+ this.nombre + " genero: "+ this.genero + " nroEPI: " + this.nroEpisodio + " Episodios: "+ this.episodio;
	}
	
	public int getNroEpisodio() {
		return nroEpisodio;
	}
	public void setNroEpisodio(int nroEpisodio) {
		this.nroEpisodio = nroEpisodio;
	}
	public String[] getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String[] episodio) {
        this.episodio = episodio;
    }

}
