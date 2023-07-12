package com.bdelas.springmicroservicecompra.controller;

import com.bdelas.springmicroservicecompra.model.Compra;
import com.bdelas.springmicroservicecompra.service.CompraService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/compra")
// Secuencia: cliente envia request , restcontroller a Service y de ahi se envia al repositorio
public class CompraController {
    @Autowired
    private CompraService compraService;

   @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Compra compra){
        return new ResponseEntity<>(
                compraService.saveCompra(compra),
                HttpStatus.CREATED
        );
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllComprasOfUser(@PathVariable Long userId){
       return  ResponseEntity.ok(compraService.findAllComprasOfUser(userId));
    }

}
