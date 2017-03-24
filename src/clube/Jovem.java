package clube;

/**
 *
 * @author 1150503, 1140317
 */
public abstract class Jovem extends Socio {

    private int nrAulas;

    private static final int NRAULAS_POR_OMISSAO = 1;
    private final int valorAula = 25;
    private static final int valorRefJovem = 100;

    public Jovem(String nome, long nif, int dataNasc, int nrAulas) {
        super(nome, nif, dataNasc);
        this.nrAulas = nrAulas;
    }

    public Jovem() {
        super();
        this.nrAulas = NRAULAS_POR_OMISSAO;
    }

    public Jovem(Jovem outroJovem) {
        this(outroJovem.getNome(), outroJovem.getNif(), outroJovem.getDataNasc(), outroJovem.getNrAulas());
    }

    public int getNrAulas() {
        return nrAulas;
    }

    public void setNrAulas(int nrAulas) {
        this.nrAulas = nrAulas;
    }

    public String toString() {

        return "";
    }

    public float mensalidade() {
        float mensalidade;

        if (this.getNrAulas() >= 4) {
            mensalidade = valorRefJovem;
        }else {
            mensalidade = (this.getNrAulas() * valorAula);
        }
        
        return mensalidade;
    }

}
