public class Produto {

    // Atributos
    private double preco;
    String modelo;

    // Setter
    public void setPreco(double _preco){
        if(nívelAcesso == 5) {
            this.preco = _preco;
        }
    }

    // Mais uma sobrecarga
    Produto(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }

}
