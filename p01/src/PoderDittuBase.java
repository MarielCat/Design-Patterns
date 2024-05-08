
/**
 * Clase para el poder base de Dittu, ayuda a regresar a Dittu a
 * su estado original después de una transformación. 
 * Implementa la interfaz TransformacionesStrategy 
 */
public class PoderDittuBase implements TransformacionesStrategyDittu{
    private String nombre="Dittu";
    public String transformarse (){
        return nombre+ " regresó a su estado original.";
    }
    public String ataqueEstrategia(Personaje personajeAtacado){
        personajeAtacado.recibeAtaque(20,getNombreTrans());
        return "Dittu está atacando a "+personajeAtacado.getNombre()+" con mordidita. ";
    }
    public String getNombreTrans(){
        return nombre;
    }
}
