package clube;

/**
 *
 * @author 1150503, 1140317
 */
public class Adulto extends Jovem{

    private String identificador;
    private int contA = 0;
    private boolean dirigente;
    
    private static final boolean DIRIGENTE_POR_OMISSAO = false;
    private static final String ID = "SAdulto-";
    
   public Adulto (String nome, long nif, int dataNasc, int nrAulas, boolean dirigente) {
       super(nome, nif, dataNasc, nrAulas);
       this.dirigente = dirigente;
   }
   
   public Adulto () {
       super();
       this.dirigente = DIRIGENTE_POR_OMISSAO;
   }
   
   public Adulto (Adulto outroAdulto) {
       this(outroAdulto.getNome(), outroAdulto.getNif(), outroAdulto.getDataNasc(), outroAdulto.getNrAulas(), outroAdulto.isDirigente());
   }

    public boolean isDirigente() {
        return dirigente;
    }

    public void setDirigente(boolean aDirigente) {
        dirigente = aDirigente;
    }
    
    public String toString() {
        return "";
    }
    
    public float desconto() {

        float desconto = 0;

        if (isDirigente()) {
            desconto = 100;
        }       
        return desconto;
    }
    
    public float mensalidade() {
        float mensalidade;
        
        mensalidade = getMensalidade() - (getMensalidade() * desconto());
        
        return mensalidade;
    }
    
}
