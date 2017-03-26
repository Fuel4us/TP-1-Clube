package clube;

/**
 *
 * @author 1150503, 1140317
 */
public abstract class Jovem extends Socio {

    private int nrAulas; // número de aulas que define a mensalidade de cada um

    private static final int NRAULAS_POR_OMISSAO = 1; 
    public final int valorAula = 25; // Valor por cada aula 
    public static final int valorRefJovem = 100; // Referência da mensalidade para cada um

    public Jovem(String nome, long nif, int dataNasc, int nrAulas) { // Jovem e os seus atributos
        super(nome, nif, dataNasc);
        this.nrAulas = nrAulas;
    }

    public Jovem() { // Jovem e os seus atributos por omissão
        super();
        this.nrAulas = NRAULAS_POR_OMISSAO;
    }

    public Jovem(Jovem outroJovem) { // outroJovem e os seus atributos
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
    
    @Override // Método abstracto da mensalidade para usar na main.
    public abstract float mensalidade();
    
}
