package br.unisul.condominio;

public class Sofa extends Item {

    private String descricao;

    public Sofa() {
    }

    public Sofa(int quantidade, String descricao, String defeito) {
        super(quantidade, defeito);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao
                + "\n" + super.toString();
    }
}
