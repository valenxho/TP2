/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author avoch
 */
public class Moto extends Vehiculo {

    public Moto(String patente, String marca, double cantCombustible) {
        super(patente, marca, cantCombustible);
    }

    @Override
    public void avanzar(double km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        double consumo=km*5/100;
        if (getCantCombustible()>=consumo){
            
            setCantCombustible(getCantCombustible()-consumo);
        }
    }
    
    
}