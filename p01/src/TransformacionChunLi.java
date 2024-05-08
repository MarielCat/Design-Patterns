public class TransformacionChunLi implements TransformacionesStrategyMeganMan{
    @Override
    public String transformarse(){
        return "MeganMan absorbió a ChunLiMan.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "ChunLiMan está atacando a "+ personajeAtacado.getNombre()+" con patadas poderosas." + personajeAtacado.recibeAtaque(40,getNombreTrans());
    }
    @Override
    public String getNombreTrans(){
        return "ChunliMan";
    }
}
