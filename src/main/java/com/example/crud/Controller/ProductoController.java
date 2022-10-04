/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crud.Controller;

import com.example.crud.entity.Producto;
import com.example.crud.service.ProductoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/producto")
@Api(value = "Microservicios de productos", description ="Microservicio de productos")
public class ProductoController {
    

    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    @ApiOperation(value="Lista de productos")
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable Long id) {
        Producto producto = productoService.findById(id);
        return ResponseEntity.ok(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productoService.deleteById(id);
    }

    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PutMapping("/update")
    public Producto update(@RequestBody Producto producto) {
        return productoService.save(producto);
    }
}
