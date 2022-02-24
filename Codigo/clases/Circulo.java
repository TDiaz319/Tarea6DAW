package clases;
/*@author Antonia Diaz Galindo
Esta es la clase para implementar Circulo
*/
import clases.Figura;

public class Circulo extends Figura{
    /*@param constante pi
    @param radio, variable del radio del circulo
    */
    final double pi=3.1416;
    private double radio; 
/*funcion para calcular el area del circulo
    @param pi
    @param radio
    @return double
    
    */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
