public class TransformacionDante implements TransformacionesStrategyMeganMan {
    @Override
    public String transformarse(){
        return "MeganMan absorbió a DanteMan.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "DanteMan está atacando a "+ personajeAtacado.getNombre()+" con poderes demoniacos. " + personajeAtacado.recibeAtaque(35,getNombreTrans());
    }
    @Override
    public String getNombreTrans(){
        return "DanteMan";
    }
}
