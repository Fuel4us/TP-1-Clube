package clube;

import java.util.Objects;

/**
 *
 * @author 1150503, 1140317
 */
public abstract class Socio {

    private String nome; // Nome sócio  
    private long nif; // NIF do sócio
    private int dataNasc; // Data de Nascimento do sócio
    private float mensalidade; // Mensalidade de cada sócio

    private final String NOME_POR_OMISSAO = "Nome não definido";
    private final long NIF_POR_OMISSAO = 000000000;
    private final int DATANASC_POR_OMISSAO = 0000;

    public Socio(String nome, long nif, int dataNasc) { // Socio e os seus atributos 

        this.nome = nome;
        this.nif = nif;
        this.dataNasc = dataNasc;
    }

    public Socio() { // Socios e os seus atributos por omissão

        this.nome = NOME_POR_OMISSAO;
        this.nif = NIF_POR_OMISSAO;
        this.dataNasc = DATANASC_POR_OMISSAO;
    }

    public Socio(Socio outroSocio) { // outroSocio e os seus atributos
        this(outroSocio.nome, outroSocio.nif, outroSocio.dataNasc);
    }

    public String getNome() {
        return nome;
    }

    public long getNif() {
        return nif;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNif(long nif) {
        this.nif = nif;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String toString() { 

        return "Sócio de nome: " +getNome()+ " tem " +calcIdade()+ " anos de idade e paga " +getMensalidade()+ " de mensalidade.";
    }

    public int calcIdade() { // Cálculo de idade para facilitar métodos mais tarde
        int idade;

        idade = 2017 - getDataNasc();

        return idade;
    }

    @Override
    public boolean equals(Object obj) { // Verificação se existe sócio igual, gerado pelo netBeans
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        if (this.nif != other.nif) {
            return false;
        }
        if (this.dataNasc != other.dataNasc) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    public abstract float mensalidade();

}
