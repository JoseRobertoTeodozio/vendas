package Model;

public class ModelProduto {

    private int idProduto;
    private String proNome;
    private Double proValor;
    private int proEstoque;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String nome) {
        this.proNome = nome;
    }

    public Double getProValor() {
        return proValor;
    }

    public void setValor(Double valor) {
        this.proValor = valor;
    }

    public int getProEstoque() {
        return proEstoque;
    }

    public void setEstoque(int estoque) {
        this.proEstoque = estoque;
    }

}
