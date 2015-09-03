
package como.wordpress.javaes.modelo;

/**
 *
 * @author javaes.wordpress.com
 */
public class Calculadora<T extends Number> {
    private T num;

    public Calculadora(T num)
    {
        this.num = num;
    }
    
    public double raiz()
    {
        return Math.sqrt(this.num.doubleValue());
    }
}
