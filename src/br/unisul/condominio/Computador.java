package br.unisul.condominio;

public class Computador extends Item {

    private String marca;
    private String modelo;
    private String caracteristicas;

    public Computador() {
    }

    public Computador(int quantidade, String marca, String modelo, String caracteristicas, String defeito) {
        super(quantidade, defeito);
        this.marca = marca;
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
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

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nCaracterísticas: " + caracteristicas
                + "\n" + super.toString();

    }
}
