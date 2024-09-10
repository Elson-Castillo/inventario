package com.ec.inventarios.repositorio;

import com.ec.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hacks
 */
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
