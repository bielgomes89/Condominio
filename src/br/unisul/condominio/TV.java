package br.unisul.condominio;

public class TV extends Item {

    private String marca;
    private String modelo;

    public TV() {
    }

    public TV(int quantidade, String marca, String modelo, String defeito) {
        super(quantidade, defeito);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\n" + super.toString();

    }

}
