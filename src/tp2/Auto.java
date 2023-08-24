
package tp2;

public class Auto extends Vehiculo {

    public Auto(String patente, String marca, double cantCombustible) {
        super(patente, marca, cantCombustible);
    }

    @Override
    public void avanzar(double km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        double consumo=km*10/100;
        if (getCantCombustible()>=consumo){
            
            setCantCombustible(getCantCombustible()-consumo);
        }
    }
    
    
}
