package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class Adulto extends Jovem {

    private String identificador; // Identificador pedido no enunciado
    private static int contA = 1; // Contador para o ID
    private boolean dirigente; // Boolean para o caso de ter que aplicar os descontos de ser dirigente

    private static final boolean DIRIGENTE_POR_OMISSAO = false;
    private static final String ID = "SAdulto-";

    public Adulto(String nome, long nif, int dataNasc, int nrAulas, boolean dirigente) { // Socio Adulto e seus atributos
        super(nome, nif, dataNasc, nrAulas);
        this.dirigente = dirigente;
        this.identificador = ID + contA;
        contA++;
    }

    public Adulto() { // Socio Adulto e os seus atributos por omissao
        super();
        this.dirigente = DIRIGENTE_POR_OMISSAO;
        contA++;
        this.identificador = ID + contA;
    }

    public Adulto(Adulto outroAdulto) { // Socio outroAdulto e os atributos de outroAdulto
        this(outroAdulto.getNome(), outroAdulto.getNif(), outroAdulto.getDataNasc(), outroAdulto.getNrAulas(), outroAdulto.isDirigente());
        contA++;
        this.identificador = ID + contA;
    }

    public boolean isDirigente() {
        return dirigente;
    }

    public void setDirigente(boolean aDirigente) {
        dirigente = aDirigente;
    }

    public String toString() {
        return "ID: " + identificador + " Sócio " + getNome() + " tem " + calcIdade() + " anos de idade e paga " + mensalidade() + " de mensalidade.";
    }


    public float mensalidade() { // Cálculo da mensalidade para Jovens Adultos
        float mensalidade;

        if (isDirigente()) {
            mensalidade = 0;
            
            return mensalidade;
        }
        
        if (getNrAulas() >= 4) {
            mensalidade = valorRefJovem;
        } else {
            mensalidade = valorAula * getNrAulas();
        }
 
        return mensalidade;
    }

}
