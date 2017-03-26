package clube;

/**
 *
 * @author 1150503, 1140317
 */
public abstract class Jovem extends Socio {

    private int nrAulas;

    private static final int NRAULAS_POR_OMISSAO = 1;
    public final int valorAula = 25;
    public static final int valorRefJovem = 100;

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

        return "Sócio de nome: " +getNome()+ " tem " +calcIdade()+ " anos de idade e paga " +mensalidade()+ " de mensalidade.";
    }
    
    @Override
    public abstract float mensalidade();
    
}
