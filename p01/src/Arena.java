import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que implementa SujetoObserver y que será la que maneje la transmisión
 * de las peleas a los espectadores
 */

public class Arena implements SujetoObserver{

	/**
	 * Lista que contiene a todos los espectadores
	 * interesados en la pelea
	 */
	private List<Observador> espectadores = new ArrayList<Observador>();

	@Override
	public void agregarEspectador(Observador observador){
		espectadores.add(observador);
	}

	@Override
	public void eliminarEspectador(Observador observador){
		espectadores.remove(observador);
	}

	@Override
	public void notificarObservador(String mensaje){
		for(Observador espectador:espectadores){
			espectador.actualizar(mensaje);
		}
	}

	/**
	 * Método que elegirá la pelea que será transmitida
	 */

	public void elegirPelea(){
        Korby korby = new Korby();
        Dittu dittu = new Dittu();
        MeganMan meganman = new MeganMan();

		Random rand = new Random();
		int random = rand.nextInt(3);
		switch(random){
			case 0:
				peleaCero(korby, dittu, meganman);
				break;
			case 1:
				peleaUno(korby, dittu, meganman);
				break;
			default:
				peleaDos(korby, dittu, meganman);
		}
	}

	/**
	 * Método que transmite una de las peleas
	 */
	private void peleaCero(Personaje korby, Personaje dittu, Personaje meganman){
    	notificarObservador(meganman.ataca(dittu));
		notificarObservador(korby.ataca(meganman));
		notificarObservador(meganman.getVida());
		notificarObservador(dittu.ataca(korby));
		dittu.setTransformacion(new TransformacionMewtwo());
		notificarObservador(dittu.getTransformacionDittu().transformarse());
		meganman.defender();
		notificarObservador(dittu.ataca(meganman));
		korby.setTransformacion(new TransformacionBowser());
		notificarObservador(korby.getTransformacionKorby().transformarse());
		notificarObservador(korby.ataca(dittu));
		notificarObservador(meganman.ataca(korby));
		notificarObservador(dittu.ataca(korby));
		meganman.defender();
		notificarObservador(korby.ataca(meganman));
		notificarObservador(dittu.ataca(korby));
   		dittu.ataca(meganman);
		notificarObservador(korby.ataca(meganman));
		notificarObservador(dittu.ataca(korby));
		dittu.setTransformacion(new PoderDittuBase());
		notificarObservador(dittu.getTransformacionDittu().transformarse());
		notificarObservador(dittu.ataca(korby));
		notificarObservador(dittu.ataca(korby));
		notificarObservador(korby.ataca(dittu));
		notificarObservador(korby.ataca(dittu));
		korby.setTransformacion(new PoderKorbyBase());
		notificarObservador(korby.getTransformacionKorby().transformarse());
		notificarObservador(korby.haGanado());

	}

	/**
	 * Método que transmite una de las peleas
	 */
	private void peleaUno(Personaje korby, Personaje dittu, Personaje meganman){
		notificarObservador(dittu.ataca(korby));
		korby.setTransformacion(new TransformacionDonkey());
		notificarObservador(korby.getTransformacionKorby().transformarse());
		notificarObservador(korby.ataca(meganman));
		notificarObservador(dittu.ataca(meganman));
		korby.setTransformacion(new TransformacionPeach());
		notificarObservador(korby.getTransformacionKorby().transformarse());
		notificarObservador(meganman.ataca(dittu));
		notificarObservador(meganman.ataca(korby));
		meganman.setTransformacion(new TransformacionChunLi());
		notificarObservador(meganman.getTransformacionMeganMan().transformarse());
		notificarObservador(meganman.ataca(korby));
		notificarObservador(dittu.ataca(korby));
		notificarObservador(meganman.ataca(dittu));
		notificarObservador(meganman.ataca(korby));
		meganman.setTransformacion(new PoderMeganManBase());
		notificarObservador(meganman.getTransformacionMeganMan().transformarse());
		dittu.setTransformacion(new TransformacionSquirtle());
		notificarObservador(dittu.getTransformacionDittu().transformarse());
		meganman.defender();
		notificarObservador(dittu.ataca(meganman));
		meganman.defender();
		notificarObservador(meganman.ataca(dittu));
		notificarObservador(dittu.ataca(meganman));
		notificarObservador(dittu.ataca(meganman));
		dittu.setTransformacion(new PoderDittuBase());
		notificarObservador(dittu.getTransformacionDittu().transformarse());
		notificarObservador(dittu.haGanado());
	}

	/**
	 * Método que transmite una de las peleas
	 */
	private void peleaDos(Personaje korby, Personaje dittu, Personaje meganman){
		meganman.setTransformacion(new TransformacionRyu());
		notificarObservador(meganman.getTransformacionMeganMan().transformarse());
		dittu.defender();
		notificarObservador(meganman.ataca(dittu));
		dittu.defender();
		notificarObservador(korby.ataca(meganman));
		dittu.setTransformacion(new TransformacionCharmander());
		notificarObservador(dittu.getTransformacionDittu().transformarse());
		notificarObservador(dittu.ataca(korby));
		meganman.setTransformacion(new TransformacionDante());
		notificarObservador(meganman.getTransformacionMeganMan().transformarse());
		notificarObservador(meganman.ataca(dittu));
		notificarObservador(meganman.ataca(korby));
		notificarObservador(dittu.ataca(korby));
		notificarObservador(korby.ataca(meganman));
		korby.defender();
		notificarObservador(meganman.ataca(korby));
		korby.defender();
		notificarObservador(dittu.ataca(meganman));
		notificarObservador(meganman.ataca(korby));
		notificarObservador(meganman.ataca(dittu));
		dittu.setTransformacion(new PoderDittuBase());
		notificarObservador(dittu.getTransformacionDittu().transformarse());
		notificarObservador(meganman.ataca(dittu));
		meganman.setTransformacion(new PoderMeganManBase());
		notificarObservador(meganman.getTransformacionMeganMan().transformarse());
		notificarObservador(meganman.haGanado());
	}
}
