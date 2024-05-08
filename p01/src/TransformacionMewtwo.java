public class TransformacionMewtwo implements TransformacionesStrategyDittu {
    @Override
    public String transformarse(){
        return "Dittu absorbió a Mewtwodittu.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "Mewtwodittu está atacando a "+ personajeAtacado.getNombre()+ " con telequinesis." + personajeAtacado.recibeAtaque(25,getNombreTrans());
    }
    
    @Override
    public String getNombreTrans(){
        return "Mewtwodittu";
    }
}
