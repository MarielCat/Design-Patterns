import java.io.FileWriter;

/**
 * Clase espectador que implementa la interfaz Observador
 */
public class Espectador implements Observador{

	/**
	 * Atributo que almacena quien le manda la información
	 */
	private SujetoObserver sujeto;
	/**
	 * Atributo que almacena el nombre del espectador
	 */
	private String nombre;
	/**
	 * Atributo que almacena el pesonaje al que el espectador apoya
	 */
	private String personajeApoyado;
	/**
	 * Donde se guarda toda la información que el sujeto le transfiere al observador
	 */
	private FileWriter f;

	/**
	 * Constructor de la clase Espectador
	 */
	public Espectador(String nombre, String personajeApoyado, SujetoObserver sujeto){
		this.nombre = nombre;
		this.personajeApoyado = personajeApoyado;
		this.sujeto = sujeto;
		try{
			f = new FileWriter(nombre + ".txt");
			f.write("Tu personaje elegido es " + personajeApoyado + ".");
			f.write("\n ** INICIA PELEA EN 3,2,1: ** \n\n");
		} catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void actualizar(String mensaje){
		String mensajeNuevo = mensaje.replaceAll(personajeApoyado, "Tu personaje");
		try{
			f.write(mensajeNuevo);
			f.write("\n");
			f.write("\n");
			f.flush();
			if(mensajeNuevo.contains("ganado")) f.close();
		} catch(Exception e){
			System.out.println(e);
		}
	}


}
