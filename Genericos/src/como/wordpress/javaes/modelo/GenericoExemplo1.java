package como.wordpress.javaes.modelo;

/**
 *
 * @author javaes.wordpress.com
 */
//Classe genérica de exemplo
//Foi declarada uma classe genérica onde T é o tipo genérico
public class GenericoExemplo1<T> {
    
    T obj;
    
    public GenericoExemplo1(T obj)
    {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    
    
    
}
