/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "producto")
public class Producto{
    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;
    
    @Column(name = "prod_nombre")
    private String prodNombre;

    @Column(name = "prod_precio")
    private String prodPrecio;

    @Column(name = "prod_FV")
    private String prodFEVE;

    @Column(name = "prod_tipo")
    private String prodTipo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="code")
    private Categoria categoria;

}
