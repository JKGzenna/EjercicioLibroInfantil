package ejerciciolibroinfantil;

/**
 *
 * @author JUAN
 */
public class EjercicioLibroInfantil {

    public static void main(String[] args) {
        
        LibroInfantil li = new LibroInfantil();
        
        li.setEdadRecomendada(5);
        
        if(li.esRecomendable(7))
            System.out.println("Si es recomendable");
        else
            System.out.println("No es recomendable");
    }
    
}
