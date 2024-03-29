package com.valtek.backend_database.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.valtek.backend_database.persistence.entity.Proveedores;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestDTO {
    @JsonProperty("detalle_cliente")
    private DetalleClienteDTO detalleClienteDTO;

    @JsonProperty("cliente")
    private ClienteDTO clienteDTO;

    @JsonProperty("venta")
    private VentaDTO ventaDTO;

    @JsonProperty("compra")
    private CompraDTO compraDTO;

    @JsonProperty("inventario")
    private InventarioDTO inventarioDTO;

    @JsonProperty("detalle_venta")
    private List<DetalleVentasDTO> detalleVentasDTO;

    @JsonProperty("login")
    private UsuarioDTO usuarioDTO;

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }

    //++++++++++++++++++++++++++++++++METODOS DE CLIENTES
    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    //++++++++++++++++++++++++++++++METODOS DE DETALLES DE CLIENTES
    public DetalleClienteDTO getDetalleClienteDTO() {
        return detalleClienteDTO;
    }

    public void setDetalleClienteDTO(DetalleClienteDTO detalleClienteDTO) {
        this.detalleClienteDTO = detalleClienteDTO;
    }

    //++++++++++++++++++++++++++++METODOS DE INVENTARIO
    public InventarioDTO getInventarioDTO() {
        return inventarioDTO;
    }

    public void setInventarioDTO(InventarioDTO inventarioDTO) {
        this.inventarioDTO = inventarioDTO;
    }

    //++++++++++++++++++++++++++++METODOS DE VENTAS
    public VentaDTO getVentaDTO() {
        return ventaDTO;
    }

    public void setVentaDTO(VentaDTO ventaDTO) {
        this.ventaDTO = ventaDTO;
    }

    //++++++++++++++++++++++++++++METODOS DE COMPRAS
    public CompraDTO getCompraDTO() {
        return compraDTO;
    }

    public void setCompraDTO(CompraDTO compraDTO) {
        this.compraDTO = compraDTO;
    }

    //++++++++++++++++++++++++++++METODOS DE DETALLE_VENTAS
    public void setDetalleVentasDTO(List<DetalleVentasDTO> detalleVentasDTO) {
        this.detalleVentasDTO = detalleVentasDTO;
    }
    public List<DetalleVentasDTO> getDetalleVentasDTO() {
        return detalleVentasDTO;
    }

    @JsonProperty("proveedor")
    private ProveedoresDTO proveedoresDTO;

    public ProveedoresDTO getProveedoresDTO() {
        return proveedoresDTO;
    }

    public void setProveedoresDTO(ProveedoresDTO proveedoresDTO) {
        this.proveedoresDTO = proveedoresDTO;
    }
}
