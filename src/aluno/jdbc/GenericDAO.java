/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aluno.jdbc;

import java.util.List;

/**
 *
 * @author Antonio Sousa
 */
public interface GenericDAO<E> {
    
    public boolean insert(E e);
    public E selectById(long id);
    public List<E> selectAll();
    public List<E> selectByName(String nome);
    public boolean update(E e);
    public boolean delete(E e);
    
}
