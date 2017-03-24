package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class Senior extends Socio {

    private String identificador;
    private int contSenior = 1;
    private boolean dirigente;

    private static final int valorRefSenior = 150;
    private static final String ID = "SSenior-";
    private static final boolean DIRIGENTE_POR_OMISSAO = false;

    public Senior(String nome, long nif, int dataNasc, boolean dirigente) {
        super(nome, nif, dataNasc);
        this.identificador = ID + contSenior;
        this.dirigente = dirigente;
        contSenior++;
    }

    public Senior() {
        super();
        this.dirigente = DIRIGENTE_POR_OMISSAO;
        this.identificador = ID + contSenior;
        contSenior++;
    }

    public Senior(Senior outroSenior) {
        this(outroSenior.getNome(), outroSenior.getNif(), outroSenior.getDataNasc(), outroSenior.isDirigente());
        this.identificador = ID + contSenior;
        contSenior++;
    }

    public boolean isDirigente() {
        return dirigente;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setDirigente(boolean aDirigente) {
        dirigente = aDirigente;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "";
    }

    public float desconto() {

        float desconto;
        float temp;

        if (isDirigente()) {
            desconto = 100;
        } else {

            temp = super.calcIdade() / 10;
            desconto = temp % 10;
            desconto = desconto * 10;
        }

        return desconto;
    }
    
    public float mensalidade() {
        float mensalidade;
        
        mensalidade = getMensalidade() - (getMensalidade() * desconto());
        
        return mensalidade;
    }

}
