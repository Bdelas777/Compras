package com.bdelas.springmicroservicecompra.service;

import com.bdelas.springmicroservicecompra.model.Compra;

import java.util.List;

public interface CompraService {
    // Guardamos la compra
    Compra saveCompra(Compra compra);

    // Leer todas las compras
    List<Compra> findAllComprasOfUser(Long userId);
}
