
import org.junit.Test;
import projetofinaljava.Produto;
import projetofinaljava.ProdutoDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sharonhasegawa
 */
public class TestaProdutoDAO {
    @Test
    public void testaDAO() {
        ProdutoDAO dao = new ProdutoDAO();
        Produto produto1 = new Produto("Produto teste DAO");
        
        // insert
        dao.insere(produto1);
        System.out.println("[INSERT] Produto inserido.");
        
        // update
        produto1.setDescricao("Descrição atualizada");
        
        dao.atualiza(produto1);
        System.out.println("[UPDATE] Produto atualizado.");

        // get
        Produto produto2 = dao.get(produto1.getId());
        System.out.println("[SELECT] Produto buscado.");
        
        // list
        dao.getLista();
        System.out.println("[SELECT *] Lista de produtos buscada.");
        
        // delete
        dao.deleta(produto2);
        System.out.println("[DELETE] Produto excluído.");
    }
}
