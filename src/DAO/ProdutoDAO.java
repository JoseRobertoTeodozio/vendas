package DAO;

import Model.ModelProduto;
import Conexoes.ConexaoMySql;
import java.util.ArrayList;

//cadastrar um produto no banco
public class ProdutoDAO extends ConexaoMySql {

    public int salvarProdutoDao(ModelProduto produto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto (" + "pro_nome, pro_valor, pro_estoque" + ") VALUES ("
                    + "'" + produto.getProNome() + "',"
                    + "'" + produto.getProValor() + "',"
                    + "'" + produto.getProEstoque() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    //excluir um produto do banco
    public boolean excluirProduto(int IdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM tbl_produto WHERE id_produto= '" + IdProduto + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    //Alterar dados do produto
    public boolean alterarProduto(ModelProduto produto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tbl_produto SET "
                    + "pro_nome = '" + produto.getProNome() + "',"
                    + "pro_valor = '" + produto.getProValor() + "',"
                    + "pro_estoque = '" + produto.getProEstoque() + "'"
                    + "WHERE id_produto = '" + produto.getIdProduto() + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

//    retornar um produto
    public ModelProduto retornaProduto(int idProduto) {
        ModelProduto produto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT id_produto, pro_nome, pro_valor, pro_estoque "
                    + "FROM tbl_produto WHERE id_produto = '" + idProduto + "'");

            while (this.getResultSet().next()) {
                produto.setIdProduto(this.getResultSet().getInt(1));
                produto.setProNome(this.getResultSet().getString(2));
                produto.setValor(this.getResultSet().getDouble(3));
                produto.setEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produto;
    }
    
    //Retorna uma lista completa de produtos
    public ArrayList<ModelProduto> retornarListaProduto(){
        ArrayList<ModelProduto> listaProdutos = new ArrayList<>();
        ModelProduto produtos = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT id_produto, pro_nome, pro_valor, pro_estoque "
                    + "FROM tbl_produto");
            
            while (this.getResultSet().next()) {
                produtos = new ModelProduto();
                produtos.setIdProduto(this.getResultSet().getInt(1));
                produtos.setProNome(this.getResultSet().getString(2));
                produtos.setValor(this.getResultSet().getDouble(3));
                produtos.setEstoque(this.getResultSet().getInt(4));
                listaProdutos.add(produtos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaProdutos;
    }
}
