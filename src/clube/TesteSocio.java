package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class TesteSocio {
    
    public static void main (String [] args) {
        
        Senior ss1 = new Senior ("Armindo", 111111111, 1950, false);
        System.out.println(ss1.desconto());
        System.out.println(ss1.getIdentificador());
        
        System.out.println(ss1.calcIdade());
        
        Socio[] listaSocios = new Socio [10];
    }
}
