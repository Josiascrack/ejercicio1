
package com.lp2.ejercicio1.Dao;

import com.lp2.ejercicio1.Entity.TProducto;
import java.util.List;
import java.util.Map;


public interface IProducto {
    
        List<Map<String, Object>> readAll();
    int create(TProducto tp);
    int update(TProducto tp);
    int delete(int id);
    TProducto read(int id);
    TProducto searchProducto(String nombre);
    
}
