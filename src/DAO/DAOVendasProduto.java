package DAO;

import Model.ModelVendasProduto;
import Conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Jose Roberto
*/
public class DAOVendasProduto extends ConexaoMySql {

    /**
    * grava VendasProduto
    * @param pModelVendasProduto
    * return int
    */
    public int salvarVendasProdutoDAO(ModelVendasProduto pModelVendasProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas_produto ("
                    + "pk_id_venda_produto,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                + ") VALUES ("
                    + "'" + pModelVendasProduto.getIdVendaProduto() + "',"
                    + "'" + pModelVendasProduto.getProduto() + "',"
                    + "'" + pModelVendasProduto.getVendas() + "',"
                    + "'" + pModelVendasProduto.getVenProValor() + "',"
                    + "'" + pModelVendasProduto.getVenProQuantidade() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera VendasProduto
    * @param pIdVendaProduto
    * return ModelVendasProduto
    */
    public ModelVendasProduto getVendasProdutoDAO(int pIdVendaProduto){
        ModelVendasProduto modelVendasProduto = new ModelVendasProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                 + " FROM"
                     + " tbl_vendas_produto"
                 + " WHERE"
                     + " pk_id_venda_produto = '" + pIdVendaProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProduto.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProduto.setProduto(this.getResultSet().getInt(2));
                modelVendasProduto.setVendas(this.getResultSet().getInt(3));
                modelVendasProduto.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProduto.setVenProQuantidade(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProduto;
    }

    /**
    * recupera uma lista de VendasProduto
        * return ArrayList
    */
    public ArrayList<ModelVendasProduto> getListaVendasProdutoDAO(){
        ArrayList<ModelVendasProduto> listamodelVendasProduto = new ArrayList();
        ModelVendasProduto modelVendasProduto = new ModelVendasProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                 + " FROM"
                     + " tbl_vendas_produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProduto = new ModelVendasProduto();
                modelVendasProduto.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProduto.setProduto(this.getResultSet().getInt(2));
                modelVendasProduto.setVendas(this.getResultSet().getInt(3));
                modelVendasProduto.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProduto.setVenProQuantidade(this.getResultSet().getInt(5));
                listamodelVendasProduto.add(modelVendasProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasProduto;
    }

    /**
    * atualiza VendasProduto
    * @param pModelVendasProduto
    * return boolean
    */
    public boolean atualizarVendasProdutoDAO(ModelVendasProduto pModelVendasProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas_produto SET "
                    + "pk_id_venda_produto = '" + pModelVendasProduto.getIdVendaProduto() + "',"
                    + "fk_produto = '" + pModelVendasProduto.getProduto() + "',"
                    + "fk_vendas = '" + pModelVendasProduto.getVendas() + "',"
                    + "ven_pro_valor = '" + pModelVendasProduto.getVenProValor() + "',"
                    + "ven_pro_quantidade = '" + pModelVendasProduto.getVenProQuantidade() + "'"
                + " WHERE "
                    + "pk_id_venda_produto = '" + pModelVendasProduto.getIdVendaProduto() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui VendasProduto
    * @param pIdVendaProduto
    * return boolean
    */
    public boolean excluirVendasProdutoDAO(int pIdVendaProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas_produto "
                + " WHERE "
                    + "pk_id_venda_produto = '" + pIdVendaProduto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}