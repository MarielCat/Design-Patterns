import java.util.LinkedList;

/**
 * La clase abstracta `Nave` representa una nave espacial y define métodos para administrar
 * sus componentes y calcular sus características como costo, ataque, defensa, velocidad y peso.
 */
public abstract class Nave {
    protected LinkedList<Componente> componentes = new LinkedList<Componente>();
    public static final String NEG = "\u001b[1m";
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    /**
     * Agrega un componente a la nave.
     *
     * @param componente El componente que se agrega a la nave.
     */
    public void agregaComponente(Componente componente) {
        componentes.add(componente);
    }

    /**
     * Calcula el costo total de la nave sumando los precios de todos sus componentes.
     *
     * @return El costo total de la nave.
     */
    public double obtenCosto() {
        double costo = 0;
        for (Componente com : componentes) {
            costo += com.precio();
        }
        return costo;
    }

    /**
     * Calcula el valor total de ataque de la nave sumando los ataques de todos sus componentes.
     *
     * @return El valor total de ataque de la nave.
     */
    public int obtenAtaque() {
        int ataqueFinal = 0;
        for (Componente com : componentes) {
            ataqueFinal += com.ataque();
        }
        return ataqueFinal;
    }

    /**
     * Calcula el valor total de defensa de la nave sumando las defensas de todos sus componentes.
     *
     * @return El valor total de defensa de la nave.
     */
    public int obtenDefensa() {
        int defensaFinal = 0;
        for (Componente com : componentes) {
            defensaFinal += com.defensa();
        }
        return defensaFinal;
    }

    /**
     * Calcula el valor total de velocidad de la nave sumando las velocidades de todos sus componentes.
     *
     * @return El valor total de velocidad de la nave.
     */
    public int obtenVelocidad() {
        int velocidadFinal = 0;
        for (Componente com : componentes) {
            velocidadFinal += com.velocidad();
        }
        return velocidadFinal;
    }

    /**
     * Calcula el peso total de la nave sumando los pesos de todos sus componentes.
     *
     * @return El peso total de la nave.
     */
    public int obtenPeso() {
        int pesoFinal = 0;
        for (Componente com : componentes) {
            pesoFinal += com.peso();
        }
        return pesoFinal;
    }

    /**
     * Muestra los componentes de la nave en la consola.
     */
    public void muestraComponentes() {
        for (Componente com : componentes) {
            System.out.println("* " + com.nombre());
        }
    }

    /**
     * Muestra las características y componentes de la nave en la consola.
     */
    public void muestraNave() {
        System.out.println("Costo total: $" + (float)obtenCosto());
        System.out.println("Ataque total: " + obtenAtaque()+" puntos");
        System.out.println("Defensa total: " + obtenDefensa()+" puntos");
        System.out.println("Velocidad total: " + obtenVelocidad()+" km/h");
        System.out.println("Peso total: " + obtenPeso()+" kg");
        System.out.println("Componentes: ");
        muestraComponentes();
    }

    /**
     * Métodos abstractos que deben ser implementados por las subclases para agregar
     * diferentes tipos de componentes a la nave.
     */
    public abstract void agregaBlindaje();

    public abstract void agregaArmas();

    public abstract void agregaSistemaPropulsion();

    public abstract void agregaCabina();
}
