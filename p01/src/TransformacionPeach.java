
public class TransformacionPeach implements TransformacionesStrategyKorby{
    
    @Override
    public String transformarse(){
        return "Korby absorbió a Peachkorby.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "Peachkorby está atacando a "+ personajeAtacado.getNombre()+ "con una sombrilla rosada. " + personajeAtacado.recibeAtaque(20,getNombreTrans());
    }
    
    @Override
    public String getNombreTrans(){
        return "Peachkorby";
    }
}
