
import java.time.LocalDate;
import java.util.List;
import org.junit.Test;
import projetofinaljava.Cliente;
import projetofinaljava.ClienteDAO;
import projetofinaljava.ItemDoPedido;
import projetofinaljava.ItemDoPedidoDAO;
import projetofinaljava.Pedido;
import projetofinaljava.PedidoDAO;
import projetofinaljava.Produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sharonhasegawa
 */
public class TestaItemDoPedidoDAO {
    @Test
    public void testaDAO() {
        PedidoDAO pedidoDao = new PedidoDAO();
        ClienteDAO clienteDao = new ClienteDAO();
        ItemDoPedidoDAO dao = new ItemDoPedidoDAO();
        
        // inserir cliente, pedido, produto para teste
        Cliente cliente = new Cliente("12345678901", "Sharon", "Hasegawa");
        clienteDao.insere(cliente);
        
        Pedido pedido = new Pedido(-1L, LocalDate.now(), cliente, null);
        pedidoDao.insere(pedido);
        
        Produto produto = new Produto(1, "Produto teste");
        
        ItemDoPedido item1 = new ItemDoPedido(3, produto);
        // insert
        dao.insere(pedido.getId(), item1);
        System.out.println("[INSERT] Pedido inserido.");
        
        // update
        item1.setQuantidade(5);
        
        dao.atualiza(pedido.getId(), item1);
        System.out.println("[UPDATE] Pedido atualizado.");

        // get
        ItemDoPedido item2 = dao.get(pedido.getId());
        System.out.println("[SELECT] pedido buscado.");
        
        // list
        List<ItemDoPedido> itens = dao.getLista(pedido.getId());
        System.out.println("[SELECT *] Lista de pedidos buscada.");
        
        // delete
        dao.deleta(pedido.getId(), item2);
        System.out.println("[DELETE] Pedido excluído.");
        
        // deletar cliente e pedido de teste
        pedidoDao.deleta(pedido);
        clienteDao.deleta(cliente);
    }    

}
