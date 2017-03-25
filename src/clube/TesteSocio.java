package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class TesteSocio {
    
    public static void main (String [] args) {
        
        //Criação de socios
        Menor sm1 = new Menor ("Afonso",112233445,2010,1,"Carlos");
        Menor sm2 = new Menor ("Barbara",554433221,2006,1,"Alberto");
        Menor sm3 = new Menor ("Bernardete",123123123,2001,1,"Paulo");
        Menor sm4 = new Menor ("António",321654987,2011,2,"Alvaro");
        
        Adulto sa1 = new Adulto ("João",123456789,1990,2,false);
        Adulto sa2 = new Adulto ("Rafael",123454321,1991,5,false);
        Adulto sa3 = new Adulto ("Carlos",123456543,1974,3,true);
        Adulto sa4 = new Adulto ("Rubén",987654321,1990,2,false);
        
        Senior ss1 = new Senior ("Armindo", 111111111, 1950, false);
        Senior ss2 = new Senior ("Albertino", 222222222, 1945, false);
        Senior ss3 = new Senior ("Constantino", 333333333, 1940, true);
        Senior ss4 = new Senior ("Ivaristo", 444444444, 1935, false);
        
        //Array de Socios listaSocios
        Socio[] listaSocios = new Socio [12];
        
        //Menores
        listaSocios[0]= sm1;
        listaSocios[1]= sm2;
        listaSocios[2]= sm3;
        listaSocios[3]= sm4;
        
        //Adultos
        listaSocios[4]= sa1;
        listaSocios[5]= sa2;
        listaSocios[6]= sa3;
        listaSocios[7]= sa4;
        
        //Seniores
        listaSocios[8]= ss1;
        listaSocios[9]= ss2;
        listaSocios[10]= ss3;
        listaSocios[11]= ss4;

        // Print dos sócios todos criados
        for (int i = 0; i < listaSocios.length; i++) {
            if (listaSocios[i] != null) {
                System.out.println(listaSocios[i]);
            }
            
        }
        
    }
}
