
package tp2;

/**
 *
 * @author avoch
 */
public class Camion extends Vehiculo {

    public Camion(String patente, String marca, double cantCombustible) {
        super(patente, marca, cantCombustible);
    }

    @Override
    public void avanzar(double km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        double consumo=km*15/100;
        if (getCantCombustible()>=consumo){
            
            setCantCombustible(getCantCombustible()-consumo);
        }
    }
    
    
}
