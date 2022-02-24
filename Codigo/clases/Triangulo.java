package clases;
/*author Antonia Díaz Galindo
clase para implementar triángulo
@param base
@param altura
*/
public class Triangulo extends Figura{
    
    private double base;
    private double altura;
/*funcion para calcular el area
@param base
@param altura
@return double area, resultado de dividir entre dos el resultado de base por altura 
    */
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
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
