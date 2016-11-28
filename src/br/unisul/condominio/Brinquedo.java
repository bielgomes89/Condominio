package br.unisul.condominio;

public class Brinquedo extends Item {

    private String tipo;
    private String descricao;

    public Brinquedo() {
    }

    public Brinquedo(int quantidade, String tipo, String descricao, String defeito) {
        super(quantidade, defeito);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo
                + "\nDescrição: " + descricao
                + "\n" + super.toString();
    }
}
