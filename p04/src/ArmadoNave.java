/**
 * La clase `ArmadoNave` se encarga de ensamblar diferentes tipos de naves predeterminadas 
 * utilizando componentes específicos. También permite obtener la nave construida una vez
 * que se han agregado todos los componentes necesarios.
 */
public class ArmadoNave {

    NaveConstruida nave;

    /**
     * Constructor de la clase `ArmadoNave`. Inicializa una nueva instancia de `NaveConstruida`.
     */
    public ArmadoNave() {
        this.nave = new NaveConstruida();
    }

    /**
     * Agrega un componente a la nave en construcción.
     *
     * @param componente El componente que se agregará a la nave.
     */
    public void armaNave(Componente componente) {
        nave.agregaComponente(componente);
    }

    /**
     * Ensambla una nave individual, agregando blindaje, cabina, armas y sistema de propulsión.
     *
     * @return La nave individual ensamblada.
     */
    public NaveIndividual armaNaveIndividual() {
        NaveIndividual nave = new NaveIndividual();
        nave.agregaBlindaje();
        nave.agregaCabina();
        nave.agregaArmas();
        nave.agregaSistemaPropulsion();
        return nave;
    }

    /**
     * Ensambla una nave militar, agregando blindaje, cabina, armas y sistema de propulsión.
     *
     * @return La nave militar ensamblada.
     */
    public NaveMilitar armaNaveMilitar() {
        NaveMilitar nave = new NaveMilitar();
        nave.agregaBlindaje();
        nave.agregaCabina();
        nave.agregaArmas();
        nave.agregaSistemaPropulsion();
        return nave;
    }

    /**
     * Ensambla una base espacial, agregando blindaje, cabina, armas y sistema de propulsión.
     *
     * @return La base espacial ensamblada.
     */
    public BaseEspacial armaBaseEspacial() {
        BaseEspacial nave = new BaseEspacial();
        nave.agregaBlindaje();
        nave.agregaCabina();
        nave.agregaArmas();
        nave.agregaSistemaPropulsion();
        return nave;
    }

    /**
     * Obtiene la nave construida hasta el momento.
     *
     * @return La nave construida.
     */
    public NaveConstruida regresaNave() {
        return this.nave;
    }
}
