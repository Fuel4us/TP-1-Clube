package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class TesteSocio {

    public static void main(String[] args) {

        //Criação de socios
        Menor sm1 = new Menor("Afonso", 112233445, 2010, 1, "Carlos");
        Menor sm2 = new Menor("Barbara", 554433221, 2006, 1, "Carlos");
        Menor sm3 = new Menor("Bernardete", 123123123, 2001, 1, "Alberto");
        Menor sm4 = new Menor("António", 321654987, 2011, 2, "Alvaro");

        Adulto sa1 = new Adulto("João", 123456789, 1990, 2, false);
        Adulto sa2 = new Adulto("Rafael", 123454321, 1991, 5, false);
        Adulto sa3 = new Adulto("Carlos", 123456543, 1974, 3, true);
        Adulto sa4 = new Adulto("Rubén", 987654321, 1990, 2, false);

        Senior ss1 = new Senior("Armindo", 111111111, 1950, false);
        Senior ss2 = new Senior("Albertino", 222222222, 1945, false);
        Senior ss3 = new Senior("Constantino", 333333333, 1940, true);
        Senior ss4 = new Senior("Ivaristo", 444444444, 1935, false);

        //Array de Socios listaSocios
        Socio[] listaSocios = new Socio[12];

        //Menores
        listaSocios[0] = sm1;
        listaSocios[1] = sm2;
        listaSocios[2] = sm3;
        listaSocios[3] = sm4;

        //Adultos
        listaSocios[4] = sa1;
        listaSocios[5] = sa2;
        listaSocios[6] = sa3;
        listaSocios[7] = sa4;

        //Seniores
        listaSocios[8] = ss1;
        listaSocios[9] = ss2;
        listaSocios[10] = ss3;
        listaSocios[11] = ss4;

//        // Print dos sócios todos criados
//        for (int i = 0; i < listaSocios.length; i++) {
//            if (listaSocios[i] != null) {
//                System.out.println("\n" + listaSocios[i]);
//            }
//
//        }

        //Estética
        System.out.println("--------------------x--------------------");

        // c)
        printEncarregados(listaSocios);

        //Estética
        System.out.println("--------------------x--------------------");

        // d)
        float tMens = totalMensalidades(listaSocios);
        float tJovem = jovemMensalidade(listaSocios);
        float tSenior = seniorMensalidade(listaSocios);
        percentagemMensalidades(tMens, tSenior, tJovem);

    }

    // c)
    public static void printEncarregados(Socio[] listaSocios) { // Este método depois de pegar na lista dos menores com o primeiro for, percorre-o 2x para verificar nomes de encarregados iguais implementando o contador se tal acontecer.

        int cont = 1;
        String prevEncarregado = "";

        for (Socio enc : listaSocios) {
            if (enc != null && enc instanceof Menor) {
                Menor m = (Menor) enc;
                for (Socio enc1 : listaSocios) {
                    if (enc1 != null && enc1 instanceof Menor) {
                        Menor m1 = (Menor) enc1;
                        if (!m.equals(m1) && m.getNomeEncarregado().equalsIgnoreCase(m1.getNomeEncarregado())) {
                            cont++;
                        }
                    }

                }

                if (!m.getNomeEncarregado().equalsIgnoreCase(prevEncarregado)) {
                    System.out.println("Encarregado: " + m.getNomeEncarregado() + " têm " + cont + " menores a seu encargo.");
                    prevEncarregado = m.getNomeEncarregado();
                }

                cont = 1;

            }
        }
    }

    // d)
    public static float totalMensalidades(Socio[] listaSocios) { // Pega no array listaSocios pega nas mensalidades de cada um e vai somá las.

        float tMens = 0;

        for (Socio s1 : listaSocios) {
            if (s1 != null) {
                if (s1 instanceof Menor) {  // Percorre o array mas só pega nos da classe Menor
                    Menor m = (Menor) s1; // passa de sócio a menor
                    tMens += m.mensalidade(); // soma mensalidade
                }
                if (s1 instanceof Adulto) {
                    Adulto a = (Adulto) s1;
                    tMens += a.mensalidade();
                }
                if (s1 instanceof Senior) {
                    Senior s = (Senior) s1;
                    tMens += s.mensalidade();
                }
            }
        }

        return tMens;
    }

    public static float seniorMensalidade(Socio[] listaSocios) {  // Pega no array listaSocios e soma as mensalidades dos séniores

        float sTotal = 0;

        for (Socio s2 : listaSocios) {
            if (s2 != null && s2 instanceof Senior) {
                Senior s = (Senior) s2;
                sTotal += s.mensalidade();
            }
        }

        return sTotal;
    }

    public static float jovemMensalidade(Socio[] listaSocios) { // Pega no array listaSocios e soma as mensalidades dos jovens

        float jTotal = 0;

        for (Socio s2 : listaSocios) {
            if (s2 != null && s2 instanceof Jovem) {
                Jovem j = (Jovem) s2;
                jTotal += j.mensalidade();
            }
        }

        return jTotal;
    }

    public static void percentagemMensalidades(float tMens, float sTotal, float jTotal) { // Pega nas mensalidades calculadas anteriormente e calcula as suas percentagens.

        float mensSenior, mensJovem;

        mensSenior = (sTotal / tMens) * 100;
        mensJovem = (jTotal / tMens) * 100;

        System.out.println("Mensalidade Total: " + tMens);
        System.out.println("Mensalidade Senior em relação à total: " + mensSenior);
        System.out.println("Mensalidade Jovem em relação à total " + mensJovem);
    }
}
