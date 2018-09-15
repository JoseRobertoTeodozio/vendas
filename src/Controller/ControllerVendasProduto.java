package Controller;

import Model.ModelVendasProduto;
import DAO.DAOVendasProduto;
import java.util.ArrayList;

/**
*
* @author Jose Roberto
*/
public class ControllerVendasProduto {

    private DAOVendasProduto daoVendasProduto = new DAOVendasProduto();

    /**
    * grava VendasProduto
    * @param pModelVendasProduto
    * return int
    */
    public int salvarVendasProdutoController(ModelVendasProduto pModelVendasProduto){
        return this.daoVendasProduto.salvarVendasProdutoDAO(pModelVendasProduto);
    }

    /**
    * recupera VendasProduto
    * @param pIdVendaProduto
    * return ModelVendasProduto
    */
    public ModelVendasProduto getVendasProdutoController(int pIdVendaProduto){
        return this.daoVendasProduto.getVendasProdutoDAO(pIdVendaProduto);
    }

    /**
    * recupera uma lista deVendasProduto
    * @param pIdVendaProduto
    * return ArrayList
    */
    public ArrayList<ModelVendasProduto> getListaVendasProdutoController(){
        return this.daoVendasProduto.getListaVendasProdutoDAO();
    }

    /**
    * atualiza VendasProduto
    * @param pModelVendasProduto
    * return boolean
    */
    public boolean atualizarVendasProdutoController(ModelVendasProduto pModelVendasProduto){
        return this.daoVendasProduto.atualizarVendasProdutoDAO(pModelVendasProduto);
    }

    /**
    * exclui VendasProduto
    * @param pIdVendaProduto
    * return boolean
    */
    public boolean excluirVendasProdutoController(int pIdVendaProduto){
        return this.daoVendasProduto.excluirVendasProdutoDAO(pIdVendaProduto);
    }
}