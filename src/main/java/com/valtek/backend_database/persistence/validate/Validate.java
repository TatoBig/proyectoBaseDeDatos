package com.valtek.backend_database.persistence.validate;

import com.valtek.backend_database.domain.dto.RequestDTO;
import com.valtek.backend_database.persistence.entity.DetalleVentas;
import com.valtek.backend_database.persistence.entity.Inventario;

public class Validate {

    public static void validateDetalleCliente(RequestDTO requestDTO) throws Exception {
        if (requestDTO.getDetalleClienteDTO().getDescuento() == null) {
            throw new BusinessException("BAD_REQUEST", "La cantidad de descuento es necesaria");
        }
        if (requestDTO.getDetalleClienteDTO().getNombre() == null) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignarle un nombre al tipo");
        }
    }

    public static void validateCliente(RequestDTO requestDTO) throws BusinessException {
        if (requestDTO.getClienteDTO().getNombre() == null) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un nombre de cliente");
        }
        if (requestDTO.getClienteDTO().getDetalleCliente_id() == null) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un tipo de cliente");
        }
    }

    public static void validateProveedor(RequestDTO requestDTO) throws BusinessException {
        if (requestDTO.getProveedoresDTO().getNombres() == null) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un nombre de proveedor");
        }
    }
    public static void validateCompra(RequestDTO requestDTO) throws BusinessException {
        if (requestDTO.getCompraDTO().getUsuarioId() == null ) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un nombre de proveedor");
        }
        if (requestDTO.getCompraDTO().getProveedoresId() == null ) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un nombre de proveedor");
        }
        if (requestDTO.getCompraDTO().getDetalleCompraDTO().size() == 0 ) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un producto minimo");
        }
    }
    public static void validateVenta(RequestDTO requestDTO) throws BusinessException {
        if (requestDTO.getVentaDTO().getUsuarioId() == null ) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un usuario");
        }
        if (requestDTO.getVentaDTO().getClienteId() == null ) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un cliente");
        }
        if (requestDTO.getVentaDTO().getDetalleVentasDTO().size() == 0 ) {
            throw new BusinessException("BAD_REQUEST", "Es necesario asignar un producto minimo");
        }
    }

    public static void validateAnAmountChange(DetalleVentas detalleVentas, Inventario inventario) throws BusinessException {
        if (detalleVentas.getCantidad() == null ) {
            throw new BusinessException("BAD_REQUEST", "La venta no posee cantidad a vender");
        }
        if (detalleVentas.getCantidad() > inventario.getCantidad()) {
            throw new BusinessException("BAD_REQUEST", "La venta supera la cantidad que existe en el inventario");
        }
    }
}
