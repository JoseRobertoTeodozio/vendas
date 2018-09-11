package Controller;

import DAO.ProdutoDAO;
import Model.ModelProduto;
import java.util.ArrayList;

public class ControllerProduto {
    private ProdutoDAO dao = new ProdutoDAO();
    
    // salvar produto controller
    public int salvarProdutoController(ModelProduto produto){
        return this.dao.salvarProdutoDao(produto);
    }
    
    // excluir produto controller
    public boolean excluirProdutoController(int codigo){
        return this.dao.excluirProduto(codigo);
    }
    
    //alterar produto controller
    public boolean alterarProdutoController(ModelProduto produto){
        return this.dao.alterarProduto(produto);
    }
    
    // retornar um produto pelo código
    public ModelProduto retornarProdutoController(int codigo){
        return this.dao.retornaProduto(codigo);
    }
    // retornar um produto pelo nome
    public ModelProduto retornarProdutoController(String nomeProduto){
        return this.dao.retornaProduto(nomeProduto);
    }
    
    //retornar uma lista de produtos
    public ArrayList<ModelProduto> retornarListaProdutoController(){
        return this.dao.retornarListaProduto();
    }
}
