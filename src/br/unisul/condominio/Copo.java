package br.unisul.condominio;

public class Copo extends Item {

    private String tipo;

    public Copo() {
    }

    public Copo(int quantidade, String tipo, String defeito) {
        super(quantidade, defeito);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo
                + "\n" + super.toString();
    }
}
