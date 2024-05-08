public class TransformacionBowser implements TransformacionesStrategyKorby {
    @Override
    public String transformarse(){
        return "Korby absorbió a Bowserkorby.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "Bowserkorby está atacando a "+ personajeAtacado.getNombre()+ " con fuego. " + personajeAtacado.recibeAtaque(30,getNombreTrans());
    }
    
    @Override
    public String getNombreTrans(){
        return "Bowserkorby";
    }
}
