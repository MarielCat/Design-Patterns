/**
 * Clase para el poder base de Korby, ayuda a regresar a Korby a
 * su estado original después de una transformación. 
 * Implementa la interfaz TransformacionesStrategy 
 */
public class PoderKorbyBase implements TransformacionesStrategyKorby{
    private String nombre="Korby";
    public String transformarse (){
        return nombre+ " regresó a su estado original.";
    }
    public String ataqueEstrategia(Personaje personajeAtacado){
        personajeAtacado.recibeAtaque(20,getNombreTrans());
        return nombre+" está atacando a "+personajeAtacado.getNombre()+" con pataditas. ";
    }
    public String getNombreTrans(){
        return nombre;
    }
}
