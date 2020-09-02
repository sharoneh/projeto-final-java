
import java.time.LocalDate;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
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
public class TestaClienteDAO {
    @Test
    public void testaDAO() {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente1 = new Cliente("12345678901", "Sharon", "Hasegawa");
        
        // insert
        dao.insere(cliente1);
        System.out.println("[INSERT] Cliente inserido.");
        
        // update
        cliente1.setNome("Nome atualizado");
        cliente1.setSobrenome("Sobrenome atualizado");
        cliente1.setCpf("12345678902");
        
        dao.atualiza(cliente1);
        System.out.println("[UPDATE] Cliente atualizado.");

        // get
        Cliente cliente2 = dao.get(cliente1.getId());
        System.out.println("[SELECT] Cliente buscado.");
        
        // get by cpf
        dao.get("12345678902");
        System.out.println("[SELECT] Cliente buscado pelo CPF.");
        
        // list
        List<Cliente> clientes = dao.getLista();
        System.out.println("[SELECT *] Lista de clientes buscada.");
        
        // delete
        dao.deleta(cliente2);
        System.out.println("[DELETE] Cliente excluído.");
    }
    
    @Test
    public void testaDeleteException() {
        // não pode excluir cliente que tem pedido
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente("12345678901", "Sharon", "Hasegawa");
        dao.insere(cliente);
        
        PedidoDAO pedidoDao = new PedidoDAO();
        Pedido pedido = new Pedido(-1L, LocalDate.now(), cliente, null);
        pedidoDao.insere(pedido);
        
        try {
            dao.deleta(cliente);
            fail("Devia lançar exceção e não permitir excluir cliente com pedido.");
        } catch (RuntimeException e) {
            assertEquals("O cliente não pode ser excluído porque ele tem pedidos registrados.", e.getMessage());
        }
        
        // deletar registros de teste
        pedidoDao.deleta(pedido);
        dao.deleta(cliente);
    }
}
