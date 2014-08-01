package com.mycompany.springapp.service;

import com.mycompany.springapp.domain.Producto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by developer on 8/1/14.
 */
public class SimpleProductManagerTests {

    private SimpleProductManager productManager;

    private List<Producto> productos;

    private static int CONTADOR_PRODUCTOS = 2;

    private static Double PRECIO_SILLA = new Double(20.50);
    private static String DESC_SILLA = "Silla";

    private static Double PRECIO_MESA = new Double(150.10);
    private static String DESC_MESA = "Mesa";

    @Before
    public void setUp() throws Exception{
        productManager = new SimpleProductManager();
        productos = new ArrayList<Producto>();

        //stub up una lista de productos
        Producto producto = new Producto();
        producto.setPrecio(PRECIO_SILLA);
        producto.setDescripcion(DESC_SILLA);
        productos.add(producto);

        producto.setDescripcion(DESC_MESA);
        producto.setPrecio(PRECIO_MESA);
        productos.add(producto);

        productManager.setProductos(productos);
    }

    @Test
    public void testProductsWhitNoProducts(){
        productManager = new SimpleProductManager();
        assertNull(productManager.getProductos());
    }

    @Test
    public void testGetProducts(){
        List<Producto> productos = productManager.getProductos();
        assertNotNull(productos);
        assertEquals(CONTADOR_PRODUCTOS, productManager.getProductos().size());

        Producto producto = productos.get(0);
        assertEquals(DESC_SILLA,producto.getDescripcion());
        assertEquals(PRECIO_SILLA,producto.getPrecio());

        producto = productos.get(1);
        assertEquals(DESC_MESA,producto.getDescripcion());
        assertEquals(PRECIO_MESA,producto.getPrecio());
    }
}