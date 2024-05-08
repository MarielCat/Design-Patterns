public class TransformacionDonkey implements TransformacionesStrategyKorby {
    @Override
    public String transformarse(){
        return "Korby absorbió a Donkeykorby.";
    }
    @Override
    public String ataqueEstrategia(Personaje personajeAtacado){
        return "DonkeyKorby está atacando a "+ personajeAtacado.getNombre()+ "con super fuerza. " + personajeAtacado.recibeAtaque(40,getNombreTrans());
    }

    @Override
    public String getNombreTrans(){
        return "DonkeyKorby";
    }
}
