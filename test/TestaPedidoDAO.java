
import java.time.LocalDate;
import java.util.List;
import org.junit.Test;
import projetofinaljava.Cliente;
import projetofinaljava.ClienteDAO;
import projetofinaljava.Pedido;
import projetofinaljava.PedidoDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sharonhasegawa
 */
public class TestaPedidoDAO {
    @Test
    public void testaDAO() {
        PedidoDAO dao = new PedidoDAO();
        ClienteDAO clienteDao = new ClienteDAO();
        
        // inserir cliente para teste
        Cliente cliente = new Cliente("12345678901", "Sharon", "Hasegawa");
        clienteDao.insere(cliente);
        
        Pedido pedido1 = new Pedido(LocalDate.now(), cliente, null);
        
        // insert
        dao.insere(pedido1);
        System.out.println("[INSERT] Pedido inserido.");
        
        // update
        pedido1.setData(LocalDate.now());
        
        dao.atualiza(pedido1);
        System.out.println("[UPDATE] Pedido atualizado.");

        // get
        Pedido pedido2 = dao.get(pedido1.getId());
        System.out.println("[SELECT] pedido buscado.");
        
        // list
        List<Pedido> pedidos = dao.getLista();
        System.out.println("[SELECT *] Lista de pedidos buscada.");
        
        // delete
        dao.deleta(pedido2);
        System.out.println("[DELETE] Pedido excluído.");
        
        // deletar cliente de teste
        clienteDao.deleta(cliente);
    }    
}
