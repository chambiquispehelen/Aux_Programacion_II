package y_Aux_Programacio_II;

public class Principal {

	public static void main(String[] args) {
		
		Anime a1 = new Anime("Naruto", "Shonen", 220);
        Anime a2 = new Anime("Death Note", "Misterio", 102);

        Televisor t1 = new Televisor("Chic", 4, "OLED");
        Televisor t2 = new Televisor("Sony", 8, "IPS");

        Instrumento i1 = new Instrumento("Violin", "Madera", "Cuerda");
        Instrumento i2 = new Instrumento("Flauta", "Metal", "Aire");
        Instrumento i3 = new Instrumento("Flauta", "Metal", "Aire");
        
        
        System.out.println("Televisor: "+t1);
        System.out.println("Televisor2: "+t2);
        
        System.out.println("Intrumento: "+i1);
        System.out.println("Instrumento2: "+i2);

	}

}
