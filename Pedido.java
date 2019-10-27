

/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * Eunate Ibarrola Santesteban
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente, LineaPedido linea1, LineaPedido linea2)    {
        this.fecha = fecha;
        this.cliente = cliente;
        this.linea1 = linea1;
        this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() {
         return fecha.toString();
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
         cliente.toString();
    }
    
    
    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public int getImporteAntesIva() {
         
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
         double auxIVA = (linea1.getCantidad()) * (linea1.getProducto()) / (IVA / 100);
         return auxIVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public int getImporteTotal() {
         
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
         
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        
    }

}
