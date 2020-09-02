/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

import java.util.List;

/**
 *
 * @author sharonhasegawa
 * @param <T>
 */
public interface DAO<T> {
    T get(long id);
    List<T> getLista();
    void insere(T t);
    void atualiza(T t);
    void deleta(T t);
}
