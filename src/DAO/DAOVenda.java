package DAO;

import Model.ModelVenda;
import Conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Jose Roberto
*/
public class DAOVenda extends ConexaoMySql {

    /**
    * grava Venda
    * @param pModelVenda
    * return int
    */
    public int salvarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas ("
                    + "id_vendas,"
                    + "id_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor,"
                    + "ven_valor_total,"
                    + "ven_desconto"
                + ") VALUES ("
                    + "'" + pModelVenda.getIdVenda() + "',"
                    + "'" + pModelVenda.getIdCliente() + "',"
                    + "'" + pModelVenda.getDataVenda() + "',"
                    + "'" + pModelVenda.getValor() + "',"
                    + "'" + pModelVenda.getValorTotal() + "',"
                    + "'" + pModelVenda.getDesconto() + "'"
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
    * recupera Venda
    * @param pIdVenda
    * return ModelVenda
    */
    public ModelVenda getVendaDAO(int pIdVenda){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda,"
                    + "id_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor,"
                    + "ven_valor_total,"
                    + "ven_desconto"
                 + " FROM"
                     + " tbl_vendas"
                 + " WHERE"
                     + " id_venda = '" + pIdVenda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setDataVenda(this.getResultSet().getDate(3));
                modelVenda.setValor(this.getResultSet().getDouble(4));
                modelVenda.setValorTotal(this.getResultSet().getDouble(5));
                modelVenda.setDesconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
    * recupera uma lista de Venda
        * return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaDAO(){
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_venda,"
                    + "id_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor,"
                    + "ven_valor_total,"
                    + "ven_desconto"
                 + " FROM"
                     + " tbl_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setDataVenda(this.getResultSet().getDate(3));
                modelVenda.setValor(this.getResultSet().getDouble(4));
                modelVenda.setValorTotal(this.getResultSet().getDouble(5));
                modelVenda.setDesconto(this.getResultSet().getDouble(6));
                listamodelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * return boolean
    */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas SET "
                    + "id_venda = '" + pModelVenda.getIdVenda() + "',"
                    + "id_cliente = '" + pModelVenda.getIdCliente() + "',"
                    + "ven_data_venda = '" + pModelVenda.getDataVenda() + "',"
                    + "ven_valor = '" + pModelVenda.getValor() + "',"
                    + "ven_valor = '" + pModelVenda.getValorTotal() + "',"
                    + "ven_desconto = '" + pModelVenda.getDesconto() + "'"
                + " WHERE "
                    + "id_venda = '" + pModelVenda.getIdVenda() + "'"
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
    * exclui Venda
    * @param pIdVenda
    * return boolean
    */
    public boolean excluirVendaDAO(int pIdVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas "
                + " WHERE "
                    + "id_venda = '" + pIdVenda + "'"
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