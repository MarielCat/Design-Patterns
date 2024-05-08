/**
 * Clase para el poder base de MeganMan, ayuda a regresar a MeganMan a
 * su estado original después de una transformación. 
 * Implementa la interfaz TransformacionesStrategy 
 */
public class PoderMeganManBase implements TransformacionesStrategyMeganMan {
    private String nombre="MeganMan";
    public String transformarse (){
        return nombre+ " regresó a su estado original.";
    }
    public String ataqueEstrategia(Personaje personajeAtacado){
        personajeAtacado.recibeAtaque(20,getNombreTrans());
        return nombre+" está atacando a "+personajeAtacado.getNombre()+" con X-buster. ";
    }
    public String getNombreTrans(){
        return nombre;
    }
}
