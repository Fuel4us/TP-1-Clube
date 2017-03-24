package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class Menor extends Jovem {

    private String identificador;
    private String nomeEncarregado;
    private int contM = 1;

    private static final String ID = "SMenor-";
    private final String NOMEENCARREGADO_POR_OMISSAO = "Nome não definido";
    private final float descontoMenor = (float) 0.20;

    public Menor(String nome, long nif, int dataNasc, int nrAulas, String nomeEncarregado) {
        super(nome, nif, dataNasc, nrAulas);
        this.nomeEncarregado = nomeEncarregado;
        this.identificador = ID + contM;
        contM++;
    }

    public Menor() {
        super();
        this.nomeEncarregado = NOMEENCARREGADO_POR_OMISSAO;
        this.identificador = ID + contM;
        contM++;
    }

    public Menor(Menor outroMenor) {
        this(outroMenor.getNome(), outroMenor.getNif(), outroMenor.getDataNasc(), outroMenor.getNrAulas(), outroMenor.getNomeEncarregado());
        this.identificador = ID + contM;
        contM++;
    }

    public float mensalidade() {
        float mensalidade;

        mensalidade = mensalidade() - ((float) (mensalidade() * descontoMenor));

        return mensalidade;

    }

    public String getNomeEncarregado() {
        return nomeEncarregado;
    }

    public void setNomeEncarregado(String nomeEncarregado) {
        this.nomeEncarregado = nomeEncarregado;
    }

    @Override
    public String toString() {
        return "";
    }
}
