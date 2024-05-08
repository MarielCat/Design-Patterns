

public class TransformacionCharmander implements TransformacionesStrategyDittu {

    @Override
    public String transformarse(){
        return "Dittu absorbió a Charmandittu.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "Charmandittu está atacando a "+ personajeAtacado.getNombre()+" con bola de fuego." + personajeAtacado.recibeAtaque(30,getNombreTrans());
    }
    @Override
    public String getNombreTrans(){
        return "Charmandittu";
    }
    
    
}
