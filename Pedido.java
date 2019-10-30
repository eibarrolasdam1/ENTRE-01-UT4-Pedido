
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
        return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() {
        Producto auxProducto1 = linea1.getProducto();
        double precioLinea1 = auxProducto1.getPrecio() * linea1.getCantidad();
        Producto auxProducto2 = linea2.getProducto();
        double precioLinea2 = auxProducto2.getPrecio() * linea2.getCantidad();
        return precioLinea1 + precioLinea2;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
        return (getImporteAntesIva() * IVA) - getImporteAntesIva();
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
        return getImporteAntesIva() * IVA;
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String auxStr1 = String.format("%-20s %20s\n", "IMPORTE SIN IVA: ",getImporteAntesIva());
        String auxStr2 = String.format("%-20s %8.2d\n", "IVA: ", getIva());
        String auxStr3 = String.format("%-20s %8.2d", "IMPORTE TOTAL: ", getImporteTotal());
        return "FECHA DE PEDIDO: " + fecha.toString() + cliente.toString() + auxStr1 + auxStr2 + auxStr3;
    }

    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
        Fecha fechaOtra = otro.getFecha();
        if (fecha.getYear() < fechaOtra.getYear()) {
            return true;
        }
        else if (fecha.getYear() == fechaOtra.getYear() && fecha.getMes() < fechaOtra.getMes()) {
            return true;
        }
        else if (fecha.getYear() == fechaOtra.getYear() && fecha.getMes() == fechaOtra.getMes() && 
        fecha.getDia() < fechaOtra.getDia()) {
            return true;
        }
        return false;
    }

    /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        Pedido refPedidoActual = new Pedido(fecha, cliente, linea1, linea2);
        return refPedidoActual;
    }

}
