package com.ec.inventarios.servicio;

import com.ec.inventarios.modelo.Producto;
import java.util.List;

/**
 *
 * @author ING. Elosn Castillo
 */
public interface IProductoServicio {

    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);

}
