package com.mycompany.springapp.service;

import com.mycompany.springapp.domain.Producto;

import java.util.List;

/**
 * Created by developer on 7/31/14.
 */
public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID=1L;

    private List<Producto> productos;

    public List<Producto> getProductos(){
        return productos;
    }

    public void incrementarPrecio(int porcentaje){ throw new UnsupportedOperationException();}

    public void setProductos(List<Producto> productos){
        this.productos=productos;
    }
}
