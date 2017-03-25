package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class Adulto extends Jovem {

    private String identificador;
    private static int contA = 1;
    private boolean dirigente;

    private static final boolean DIRIGENTE_POR_OMISSAO = false;
    private static final String ID = "SAdulto-";

    public Adulto(String nome, long nif, int dataNasc, int nrAulas, boolean dirigente) {
        super(nome, nif, dataNasc, nrAulas);
        this.dirigente = dirigente;
        this.identificador = ID + contA;
        contA++;
    }

    public Adulto() {
        super();
        this.dirigente = DIRIGENTE_POR_OMISSAO;
        contA++;
        this.identificador = ID + contA;
    }

    public Adulto(Adulto outroAdulto) {
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


    public float mensalidade() {
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
