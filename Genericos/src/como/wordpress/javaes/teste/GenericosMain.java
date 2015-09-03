package como.wordpress.javaes.teste;

import como.wordpress.javaes.modelo.Calculadora;
import como.wordpress.javaes.modelo.GenericoExemplo1;

/**
 *
 * @author javaes.wordpress.com
 */
public class GenericosMain 
{
    public static void main(String[] args) 
    {
        //1° - Teste do exemplo 1
        //Foi criado um objeto para Integer
        GenericoExemplo1<Integer> objGenInteger = new GenericoExemplo1<Integer>(100);
        int v_int = objGenInteger.getObj();
        System.out.println(v_int);
        //Foi criado um objeto para String
        GenericoExemplo1<String> objGenString= new GenericoExemplo1<String>("Teste Exemplo 1");
        String v_str = objGenString.getObj();
        System.out.println(v_str);
        
        //2° - Tipo primitivos não são aceitos
        //GenericoExemplo1<int> objGenInt = new GenericoExemplo1<int>(100);// Erro em tempo de compilação
        
        //3° - Atribuindo Tipo de Referências diferentes
        //objGenInteger = objGenString;// Erro - incompatible types
        
        //4º - Tipos Limitados
        
        Calculadora<Double> objCalculadora = new Calculadora<Double>(9.0);
        System.out.println(objCalculadora.raiz());
    }
}
