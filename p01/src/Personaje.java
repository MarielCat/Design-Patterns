/**
 * Clase Personaje, es el contexto más general de nuestros objetos
 * establece vida, nombredefensa, transformacion, atacar, recibir ataque,
 * entre otros.
 */
public abstract class Personaje{
    int VIDA=100;
    int ATAQUE=20;
    String nombre;
    boolean defender=false;
    String poderDeAtaque;
    //TransformacionesStrategy estrategiaTrans;
    TransformacionesStrategyKorby estrategiaTransKorby;
    TransformacionesStrategyDittu estrategiaTransDittu;
    TransformacionesStrategyMeganMan estrategiaTransMeganMan;
    /**
     * Constructor de la clase abstracta Personaje
     */
    public Personaje(){
    }
    /**
     * Método setVida, establece la vida del Personaje
     * @param nuevaVida se asigna la vida en tiempo de ejecucion.
     */
    public void setVida(int nuevaVida){
        this.VIDA=nuevaVida;
    }
    /**
     * Método getVida, al llamarlo obtienes la vida del personaje
     * @return vida actual del personaje
     */
    public String getVida(){
        return String.valueOf(VIDA) + "/100 de vida";
    }
    /**
     * Método setNombre, establece el nombre del Personaje
     * @param nombrePersonaje recibe el nombre del Personaje de tipo String
     */
    public void setNombre(String nombrePersonaje){
        this.nombre=nombrePersonaje;
    }
    /**
     * Método getNombre para obtener el nombre del personaje
     * @return nombre del personaje
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Método setDefensa para establecer si el personaje se va a defender o no
     * @param siDefiende 
     */
    public void setDefensa(boolean siDefiende){
        this.defender=siDefiende;
    }
    /**
     * Método getDefensa para saber si el personaje se defiende
     * @return
     */
    public boolean getDefensa(){
        return this.defender;
    }
    /**
     * Método setTransformacion para establecer a qué Transformacion se convertirá
     * nuestro Personaje
     * @param personajeTransformado será la transformacion que queramos realizar
     * (ej. dittu.setTransformacion(new TransformacionMewtwo))
     */
    /*public void setTransformacion(TransformacionesStrategy personajeTransformado){
        estrategiaTrans= personajeTransformado;
    }*/
    public void setTransformacion(TransformacionesStrategyKorby personajeTransformado){
        estrategiaTransKorby= personajeTransformado;
    }
    public void setTransformacion(TransformacionesStrategyDittu personajeTransformado){
        estrategiaTransDittu= personajeTransformado;
    }
    public void setTransformacion(TransformacionesStrategyMeganMan personajeTransformado){
        estrategiaTransMeganMan= personajeTransformado;
    }
	
	/**
	 * Método para obtener la transformación del personaje
	 */
	/*public TransformacionesStrategy getTransformacion(){
		return estrategiaTrans;
	}*/
    public TransformacionesStrategyDittu getTransformacionDittu(){
        return estrategiaTransDittu;
    }
    public TransformacionesStrategyKorby getTransformacionKorby(){
        return estrategiaTransKorby;
    }
    public TransformacionesStrategyMeganMan getTransformacionMeganMan(){
        return estrategiaTransMeganMan;
    }
	/**
	 * Método para declarar ganador a un personaje
	 */
	public String haGanado(){
		return getNombre() + " ha ganado.";
	}

    //MÉTODOS ABSTRACTOS A HEREDAR
    /**
     * Método para que nuestro Personaje pueda recibir el ataque de otro Personaje
     * @param ataqueRecibido es el ataque recibido de otro Personaje
     * @param nombreDelAtacante es el nombre del otro Personaje 
	 * @return notificacion de la última accion
     */
    abstract public String recibeAtaque(int ataqueRecibido, String nombreDelAtacante);
    /**
     * Método para atacar a un personaje
     * @param personajeAtacado es el personaje que a atacar
	 * @return notificacion de haber sido atacado
     */
    abstract public String ataca(Personaje personajeAtacado);
    /**
     * Método de defensa de ataques.
     * IMPORTANTE:ESTE MÉTODO NO SE IMPLEMENTARÁ CON UN PARÁMETRO EN NINGUNA CLASE
     * SE IMPLEMENTA ANTES DE RECIBIR EL ATAQUE
     */
    abstract public void defender ();
    

}
