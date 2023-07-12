package com.bdelas.springmicroservicecompra.service;

import com.bdelas.springmicroservicecompra.model.Compra;
import com.bdelas.springmicroservicecompra.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {
    @Autowired
    private CompraRepository compraRepository;

    // Guardamos la compra
    @Override
    public Compra saveCompra(Compra compra){
        compra.setFechaCompra(LocalDateTime.now());
         return compraRepository.save(compra);
    }

    // Leer todas las compras
    @Override
    public List<Compra> findAllComprasOfUser (Long userId){
        return compraRepository.findAllByUserId(userId);
    }
}
