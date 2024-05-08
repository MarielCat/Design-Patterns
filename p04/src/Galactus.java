import java.util.Scanner;

/**
 * La clase Galactus es un programa que simula un taller de naves espaciales donde los clientes pueden personalizar y construir sus propias naves espaciales.
 */
public class Galactus {
    // Definición de constantes para colores de texto en la consola
    public static final String RESET = "\u001B[0m";
    public static final String NEG = "\u001b[1m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001b[36m";

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String args[]) {
        recibirCliente();
    }

    /**
     * Método que gestiona la interacción con el cliente para recibir su presupuesto.
     */
    private static void recibirCliente() {
        System.out.println(NEG + BLUE + "\n***** Bienvenid@ al taller de naves. *****" + RESET);
        double presupuesto = obtenerPresupuesto();
        System.out.println("¡Perfecto!");
        Nave nave = armarNave();
        System.out.println(NEG + BLUE + "\n***** Su nave se ve de la siguiente forma: *****" + RESET);
        nave.muestraNave();
        int opcion = 1;
        while (nave.obtenCosto() > presupuesto || (opcion != 1 && opcion != 0)) {
            Scanner sc = new Scanner(System.in);
            System.out.println(RED + "\nOh no! Su nave construida excede su presupuesto!" + RESET);
            System.out.println("Desea:");
            System.out.println("1. Construir una nueva nave.");
            System.out.println("2. Ver nuestro catálogo.");
            System.out.println("0. Salir.");
            switch (sc.nextInt()) {
                case 1:
                    nave = armarNave();
                    System.out.println(NEG + BLUE + "\n***** Su nave se ve de la siguiente forma: *****" + RESET);
                    nave.muestraNave();
                    break;
                case 2:
                    nave = catalogo();
                    System.out.println(NEG + BLUE + "\n***** Su nave se ve de la siguiente forma: *****" + RESET);
                    nave.muestraNave();
                    break;
                case 0:
                    System.out.println(NEG + BLUE + "\n***** Gracias por su visita. *****" + RESET);
                    System.exit(0);
                default:
                    opcion = sc.nextInt();
                    sc.nextLine();
                    System.out.println(RED + "\nPor favor ingrese una entrada valida!" + RESET);
            }
        }
        System.out.println(YELLOW + "\nSu nave está lista para recoger, por favor pague en la caja el monto de $" + (float)nave.obtenCosto() + ".");
    }

    /**
     * Método que muestra el catálogo de naves disponibles y permite al cliente elegir una de ellas.
     *
     * @return La nave elegida por el cliente.
     */
    private static Nave catalogo() {
        System.out.println(NEG + CYAN + "\nA continuación nuestro catálogo." + RESET);
        ArmadoNave armador = new ArmadoNave();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(BLUE + "1. Nave Individual." + RESET);
            armador.armaNaveIndividual().muestraNave();
            System.out.println(BLUE + "2. Nave Militar." + RESET);
            armador.armaNaveMilitar().muestraNave();
            System.out.println(BLUE + "3. Base Espacial." + RESET);
            armador.armaBaseEspacial().muestraNave();
            System.out.println("¿Cuál es de su preferencia?");
            if (sc.hasNextInt()) {
                switch (sc.nextInt()) {
                    case 1:
                        return armador.armaNaveIndividual();
                    case 2:
                        return armador.armaNaveMilitar();
                    case 3:
                        return armador.armaBaseEspacial();
                    default:
                        break;
                }
            }
            System.out.println(RED + "\nPor favor ingrese una entrada valida!" + RESET);
            sc.nextLine();
        } while (true);
    }

    /**
     * Método que permite al cliente armar su propia nave espacial personalizada.
     *
     * @return La nave personalizada creada por el cliente.
     */
    private static NaveConstruida armarNave() {
        ArmadoNave armador = new ArmadoNave();
        System.out.println(NEG + CYAN + "\nHora de construir su nave espacial." + RESET);
        armador.armaNave(elegirCabina());
        armador.armaNave(elegirSistemaPropulsion());
        armador.armaNave(elegirBlindaje());
        armador.armaNave(elegirArma());
        return armador.regresaNave();
    }

    /**
     * Método que solicita al cliente ingresar su presupuesto.
     *
     * @return El presupuesto ingresado por el cliente.
     */
    private static double obtenerPresupuesto() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuál es su presupuesto?");
            System.out.println("Ejemplo de input: 3650.00");
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            }
            System.out.println(RED + "\nPor favor ingrese una entrada valida!" + RESET);
            sc.nextLine();
        } while (true);
    }

    /**
     * Método que permite al cliente elegir el tipo de cabina para la nave espacial.
     *
     * @return El tipo de cabina elegido por el cliente.
     */
    private static Cabina elegirCabina() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(YELLOW + "\n¿Qué tipo de cabina desea?" + RESET);
            System.out.println(BLUE + "1. Individual (un piloto)." + RESET);
            new UnPiloto().descripcionCompleta();
            System.out.println(BLUE + "2. Tripulación pequeña." + RESET);
            new TripulacionPequeña().descripcionCompleta();
            System.out.println(BLUE + "3. Ejército." + RESET);
            new Ejercito().descripcionCompleta();
            if (sc.hasNextInt()) {
                int eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return new UnPiloto();
                    case 2:
                        return new TripulacionPequeña();
                    case 3:
                        return new Ejercito();
                    default:
                        break;
                }
            }
            System.out.println(RED + "\nPor favor ingrese una entrada valida!" + RESET);
            sc.nextLine();
        } while (true);
    }

    /**
     * Método que permite al cliente elegir el tipo de sistema de propulsión para la nave espacial.
     *
     * @return El tipo de sistema de propulsión elegido por el cliente.
     */
    private static SistemaPropulsion elegirSistemaPropulsion() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(YELLOW + "\n¿Qué tipo de sistema de propulsión desea?" + RESET);
            System.out.println(BLUE + "1. Viaje interplanetario." + RESET);
            new ViajeInterplanetario().descripcionCompleta();
            System.out.println(BLUE + "2. Viaje intergaláctico." + RESET);
            new ViajeIntergalactico().descripcionCompleta();
            System.out.println(BLUE + "3. Viaje intercontinental." + RESET);
            new ViajeIntercontinental().descripcionCompleta();
            if (sc.hasNextInt()) {
                int eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return new ViajeInterplanetario();
                    case 2:
                        return new ViajeIntergalactico();
                    case 3:
                        return new ViajeIntercontinental();
                    default:
                        break;
                }
            }
            System.out.println(RED + "\nPor favor ingrese una entrada valida!" + RESET);
            sc.nextLine();
        } while (true);
    }

    /**
     * Método que permite al cliente elegir el tipo de blindaje para la nave espacial.
     *
     * @return El tipo de blindaje elegido por el cliente.
     */
    private static Blindaje elegirBlindaje() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(YELLOW + "\n¿Qué tipo de blindaje desea?" + RESET);
            System.out.println(BLUE + "1. Simple" + RESET);
            new BSimple().descripcionCompleta();
            System.out.println(BLUE + "2. Fortaleza." + RESET);
            new BFortaleza().descripcionCompleta();
            System.out.println(BLUE + "3. Reforzado." + RESET);
            new BReforzado().descripcionCompleta();
            if (sc.hasNextInt()) {
                int eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return new BSimple();
                    case 2:
                        return new BFortaleza();
                    case 3:
                        return new BReforzado();
                    default:
                        break;
                }
            }
            System.out.println(RED + "\nPor favor ingrese una entrada valida!" + RESET);
            sc.nextLine();
        } while (true);
    }

    /**
     * Método que permite al cliente elegir el tipo de sistema de arma para la nave espacial.
     *
     * @return El tipo de sistema de arma elegido por el cliente.
     */
    private static Armas elegirArma() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(YELLOW + "\n¿Qué tipo de sistema de arma desea?" + RESET);
            System.out.println(BLUE + "1. Láser simple." + RESET);
            new LaserSimple().descripcionCompleta();
            System.out.println(BLUE + "2. Misiles de plasma." + RESET);
            new MisilesPlasma().descripcionCompleta();
            System.out.println(BLUE + "3. Láser destructor." + RESET);
            new LaserDestructor().descripcionCompleta();
            if (sc.hasNextInt()) {
                int eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return new LaserSimple();
                    case 2:
                        return new MisilesPlasma();
                    case 3:
                        return new LaserDestructor();
                    default:
                        break;
                }
            }
            System.out.println(RED + "\nPor favor ingrese una entrada valida!" + RESET);
            sc.nextLine();
        } while (true);
    }
}
