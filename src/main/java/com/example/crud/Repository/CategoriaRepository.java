/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.crud.Repository;

import com.example.crud.entity.Categoria;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
    
}
