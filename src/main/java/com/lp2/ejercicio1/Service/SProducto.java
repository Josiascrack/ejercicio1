
package com.lp2.ejercicio1.Service;

import com.lp2.ejercicio1.Entity.TProducto;
import java.util.List;
import java.util.Map;


public interface SProducto {
      List<Map<String, Object>> readAll();
    int create(TProducto tp);
    int update(TProducto tp);
    int delete(int id);
    TProducto read(int id);
    TProducto searchProducto(String nombre);
}
