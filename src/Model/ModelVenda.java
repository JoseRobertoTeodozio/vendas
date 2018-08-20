package Model;

import java.util.Date;

public class ModelVenda {

    private Integer idVenda;
    private Double valor;
    private Double valorTotal;
    private Double desconto;
    private Date dataVenda;
    private ModelCliente idCliente;
    private ModelProduto idProduto;

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ModelCliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ModelCliente idCliente) {
        this.idCliente = idCliente;
    }

    public ModelProduto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ModelProduto idProduto) {
        this.idProduto = idProduto;
    }

}
