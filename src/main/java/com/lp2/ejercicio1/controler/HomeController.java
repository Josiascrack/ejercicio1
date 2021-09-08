
package com.lp2.ejercicio1.controler;

import com.lp2.ejercicio1.Service.SProducto;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private SProducto sp;
    @GetMapping("/productos")
    List<Map<String, Object>>mensaje(){
    return sp.readAll();
    
    }
}
