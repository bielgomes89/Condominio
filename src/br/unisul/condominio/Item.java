package br.unisul.condominio;

public class Item {

    private int quantidade;
    private String defeito;

    public Item() {
    }

    public Item(int quantidade, String defeito) {
        this.quantidade = quantidade;
        this.defeito = defeito;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    @Override
    public String toString() {
        return "Quantidade: " + quantidade
                + "\nDefeito: " + defeito;
    }

}
