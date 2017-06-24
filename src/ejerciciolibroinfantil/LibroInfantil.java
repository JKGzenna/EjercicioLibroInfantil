package ejerciciolibroinfantil;

/**
 *
 * @author JUAN
 */
public class LibroInfantil extends Libro {
    
    private int edadRecomendada = 18;
    
    public boolean esRecomendable(int edad) {
        
        if(edad >= getEdadRecomendada())
            return true;
        else
            return false;
    }

    /**
     * @return the edadRecomendada
     */
    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    /**
     * @param edadRecomendada the edadRecomendada to set
     */
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
