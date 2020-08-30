/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

/**
 *
 * @author sharonhasegawa
 */
public class Produto {
    private long id;
    private String descricao;

    public Produto(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public long getId() {
        return this.id;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
