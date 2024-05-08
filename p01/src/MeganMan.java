
public class MeganMan extends Personaje {
    /**
     * Constructor en el que establecemos el valor por defecto de vida
     * de MeganMan, su nombre y su poder base.
     */
    public MeganMan(){
        setVida(VIDA);
        setNombre("MeganMan");
        setTransformacion(new PoderMeganManBase());
    }
    public MeganMan(TransformacionesStrategyMeganMan nuevaTransormacion){
        setTransformacion(nuevaTransormacion);
    }
    public void setTransformacion(TransformacionesStrategyMeganMan personajeTransformado){
        if(this.nombre!=personajeTransformado.getNombreTrans()){
            personajeTransformado.transformarse();
        }
        this.estrategiaTransMeganMan=personajeTransformado;
        setNombre(this.estrategiaTransMeganMan.getNombreTrans());
    }
    
    public String ataca(Personaje personajeAtacado){
        return estrategiaTransMeganMan.ataqueEstrategia(personajeAtacado);
    }
    public void defender(){
        setDefensa(!defender);
    }
    public String recibeAtaque(int ataqueRecibido, String nombreDelAtacante){
        if(this.defender){
            return getNombre()+" se defendió de "+ nombreDelAtacante + ".";
        }else{
            setVida(this.VIDA-ataqueRecibido);
            if(this.VIDA>0){
            return getNombre()+" recibió "+ ataqueRecibido + " de daño por "+ nombreDelAtacante + ". Ahora la vida de " +getNombre()+ " es " + this.getVida() + ".";
            }else{
                return getNombre()+ " ha muerto.";
            }
        }
    }
    
}
