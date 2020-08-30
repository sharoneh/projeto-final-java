
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import projetofinaljava.Cliente;
import projetofinaljava.ClienteDAO;

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
        cliente1.setCpf("CPF atualizado");
        
        dao.atualiza(cliente1);
        System.out.println("[UPDATE] Cliente atualizado.");

        // get
        Cliente cliente2 = dao.get(cliente1.getId());
        System.out.println("[SELECT] Cliente buscado.");
        
        // list
        List<Cliente> clientes = dao.getLista();
        System.out.println("[SELECT *] Lista de clientes buscada.");
        
        // delete
        dao.deleta(cliente2);
        System.out.println("[DELETE] Cliente excluído.");
    }    
}
