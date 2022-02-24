package clases;
/*@author Antonia Diaz Galindo
   Clase para implementar el rectángulo
    @param base 
    @param altura
*/
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
/*funcion para calcular el area del rectángulo
    @param base 
    @param altura
    @return double area, resultado de multiplicar base y altura
    */
    public double CalcularArea() {        
        return this.area=(base*altura);
     }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
