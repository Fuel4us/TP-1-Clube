package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class Menor extends Jovem {

    private String identificador; // Identificador pedido no enunciado
    private String nomeEncarregado; // Nome do encarregado do menor
    private static int contM = 1; // Contador para o ID

    private static final String ID = "SMenor-";
    private final String NOMEENCARREGADO_POR_OMISSAO = "Nome não definido";
    private final float descontoMenor = (float) 0.20; // Valor final para desconto de menor

    public Menor(String nome, long nif, int dataNasc, int nrAulas, String nomeEncarregado) { // Socio Menor e os seus atributos
        super(nome, nif, dataNasc, nrAulas);
        this.nomeEncarregado = nomeEncarregado;
        this.identificador = ID + contM;
        contM++;
    }

    public Menor() { // Socio Menor e os seus atributos por omissao
        super();
        this.nomeEncarregado = NOMEENCARREGADO_POR_OMISSAO;
        this.identificador = ID + contM;
        contM++;
    }

    public Menor(Menor outroMenor) { // Socio outroMenor e os seus atributos
        this(outroMenor.getNome(), outroMenor.getNif(), outroMenor.getDataNasc(), outroMenor.getNrAulas(), outroMenor.getNomeEncarregado());
        this.identificador = ID + contM;
        contM++;
    }

    @Override
    public float mensalidade() { // Cálculo da mensalidade e aplicação do desconto de menor
        float mensalidade;
        float temp;

        temp = (valorAula * getNrAulas());
        mensalidade = temp - ((float) (temp * descontoMenor));

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
        return "ID: " +identificador+ " Sócio " +getNome()+ " tem " +calcIdade()+ " anos de idade e paga " +mensalidade()+ " de mensalidade.";
    }
}
