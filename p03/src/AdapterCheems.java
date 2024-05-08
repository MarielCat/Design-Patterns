/**
 * Clase que adapta al soldado cheems para unirse a la batalla
 */
public class AdapterCheems extends Batallon{
	
	/**
	 * Atributo que guarda al cheems original
	 */
	CheemsSoldado cheems;

	/**
	 * Constructor de la clase 
	 */
	public AdapterCheems(CheemsSoldado cheems){
		this.nameID = "Cheems";
		this.description = "Cheems soldado + " + estilizarReliquias(cheems.mostrarReliquias());
		this.tab = "\t\t\t";
		this.color = BLUE;
		this.ataque = cheems.getAtaqueMagico();
		this.velocidad = cheems.getMovimientoMagico();
		this.defensa = cheems.getDefensaMagica();
		this.formacionCombate = "Soldado raso";
		this.cheems = cheems;
	}


    /**
     * Imprime la información de cheems antes de ser tuneado y después de ser tuneado.
     *
     * @param cheems Método que imprime todos los datos de cheems, incluso como era antes de adaptarse.
	 */
	@Override
	public void printForCreateSoldier(Batallon cheems){
		print(cheems);
	}

    /**
     * Método que imprime todos los datos de cheems.     
	 * * @param cheemsAdaptado Recibe a cheems adaptado ya con los cambios implementados.
     */
	@Override
	public void print(Batallon cheemsAdaptado){
        System.out.print(tab + color + "**" + cheemsAdaptado.getNameID() + "**: ");
        System.out.println("\n\t\t\tDescripción:" + cheemsAdaptado.getDescription() +
                "\n\t\t\tAtaque: " + cheemsAdaptado.getAtaque() + "." +
                "\n\t\t\tVelocidad: " + cheemsAdaptado.getVelocidad() + "." +
                "\n\t\t\tDefensa: " + cheemsAdaptado.getDefensa() + "." +
                "\n\t\t\tFormación: " + cheemsAdaptado.getFormacion() + "." + "\n");
	}

	@Override 
	public void setFormacionCombate(String formacion){
		this.formacionCombate = formacion;
	}

	/**
	 * Método auxiliar que ayuda a adaptar el estilo de escritura de reliquias a armas.
	 * @param reliquias Lista de reliquias de Cheems
	 */
	private String estilizarReliquias(String reliquias){
		String str = reliquias.replaceAll("\n", " + ");
		return str.substring(0, str.length() -3);
	}

}
