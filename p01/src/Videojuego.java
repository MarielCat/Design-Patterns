/**
 * Clase principal del proyecto
 */

public class Videojuego{
    public static void main(String [] args){
		Arena arena = new Arena();
		arena.agregarEspectador(new Espectador("Onecimo", "Korby", arena));
		arena.agregarEspectador(new Espectador("Margarita", "MeganMan", arena));
		arena.agregarEspectador(new Espectador("Yael", "Dittu", arena));
		arena.agregarEspectador(new Espectador("Yuridia", "Korby", arena));
		arena.elegirPelea();
	
    }
}
