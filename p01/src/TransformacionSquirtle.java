public class TransformacionSquirtle implements TransformacionesStrategyDittu{

    @Override
    public String transformarse(){
        return "Dittu absorbió a Squirtledittu.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "Squirtledittu está atacando a "+ personajeAtacado.getNombre()+" con chorrito de agua." + personajeAtacado.recibeAtaque(27,getNombreTrans());
    }
    @Override
    public String getNombreTrans(){
        return "Squirtledittu";
    }
}
