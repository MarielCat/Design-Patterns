

public class Korby extends Personaje{
    /**
     * Constructor en el que establecemos el valor por defecto de vida
     * de Korby, su nombre y su poder base.
     */
    public Korby(){
        setVida(VIDA);
        setNombre("Korby");
        setTransformacion(new PoderKorbyBase());
    }
    public Korby(TransformacionesStrategyKorby nuevaTransormacion){
        setTransformacion(nuevaTransormacion);
    }
    public void setTransformacion(TransformacionesStrategyKorby personajeTransformado){
        if(this.nombre!=personajeTransformado.getNombreTrans()){
            personajeTransformado.transformarse();
        }
        this.estrategiaTransKorby=personajeTransformado;
        setNombre(this.estrategiaTransKorby.getNombreTrans());
    
    }
    
    public String ataca(Personaje personajeAtacado){
        return estrategiaTransKorby.ataqueEstrategia(personajeAtacado);
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
            return getNombre()+" recibió "+ ataqueRecibido + " de daño por "+ nombreDelAtacante + ". Ahora la vida de " +getNombre()+ " es " + getVida() + ".";
            }else{
                return getNombre()+ " ha muerto.";
            }
        }
    }
}
    
    
