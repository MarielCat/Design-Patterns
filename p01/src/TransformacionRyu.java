public class TransformacionRyu implements TransformacionesStrategyMeganMan{
    @Override
    public String transformarse(){
        return "MeganMan absorbió a RyunMan.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "RyunMan está atacando a "+ personajeAtacado.getNombre()+" con Hadoken. " + personajeAtacado.recibeAtaque(28,getNombreTrans());
    }
    @Override
    public String getNombreTrans(){
        return "RyunMan";
    }
}
