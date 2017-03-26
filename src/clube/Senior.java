package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class Senior extends Socio {

    private String identificador; // Identificador pedido no enunciado
    private static int contSenior = 1; // Contador para identificador
    private boolean dirigente; // Boolean para aplicação de descontos no dirigente

    private static final int valorRefSenior = 150; // Valor da mensalidade por referência
    private static final String ID = "SSenior-";
    private static final boolean DIRIGENTE_POR_OMISSAO = false;

    public Senior(String nome, long nif, int dataNasc, boolean dirigente) { // Senior e os seus atributos definidos pelo utilizador
        super(nome, nif, dataNasc);
        this.identificador = ID + contSenior;
        this.dirigente = dirigente;
        contSenior++;
    }

    public Senior() { // Senior e os seus atributos por omissão
        super();
        this.dirigente = DIRIGENTE_POR_OMISSAO;
        this.identificador = ID + contSenior;
        contSenior++;
    }

    public Senior(Senior outroSenior) { // outroSenior e os seus atributos
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
        return "ID: " + identificador + " Sócio " + getNome() + " tem " + calcIdade() + " anos de idade e paga " + mensalidade() + " de mensalidade.";
    }

    public float desconto() { // Aplicação de descontos no caso de ser dirigente e os 10% por cada década.

        float desconto;
        float temp;

        if (isDirigente()) {
            desconto = 1; // Caso seja dirigente não paga mensalidade
        } else {

            temp = super.calcIdade() / 10;
            desconto = temp % 10;
            desconto = desconto / 10;
        }

        return desconto;
    }

    public float mensalidade() { // Método para calcular a mensalidade pelos valores referência e se necessário o desconto.
        float mensalidade;

        mensalidade = valorRefSenior - (valorRefSenior * desconto());

        return mensalidade;
    }

}
