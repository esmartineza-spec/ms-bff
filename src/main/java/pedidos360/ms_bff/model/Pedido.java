package pedidos360.ms_bff.model;

public class Pedido {

    private Long id;
    private String cliente;
    private String producto;
    private Integer cantidad;

    public Pedido() {
    }

    public Pedido(Long id, String cliente, String producto, Integer cantidad) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
