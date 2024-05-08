/**
 * Personaje Dittu: su ataque por defecto es de 20 llamado mordiditas
 * se puede transformar en Mewtwodittu,Charmandittu y Squirtledittu
 */
public class Dittu extends Personaje{
    /**
     * Constructor en el que establecemos el valor por defecto de vida
     * de Dittu, su nombre y su poder base.
     */
    public Dittu(){
        setVida(VIDA);
        setNombre("Dittu");
        setTransformacion(new PoderDittuBase());
    }
    
    public void setTransformacion(TransformacionesStrategyDittu personajeTransformado){
        if(this.nombre!=personajeTransformado.getNombreTrans()){
            personajeTransformado.transformarse();
        }
        this.estrategiaTransDittu=personajeTransformado;
        setNombre(this.estrategiaTransDittu.getNombreTrans());
    }
    
    public String ataca(Personaje personajeAtacado){
        return estrategiaTransDittu.ataqueEstrategia(personajeAtacado);
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
