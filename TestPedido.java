
/**
 *  Clase para probar el resto de clases
 *  Eunate Ibarrola Santesteban
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // // crear pedido1
        Fecha fechaPedid1 = new Fecha(4, 9, 2019);
        Cliente clientePedid1 = new Cliente("Juan Soto", "Avenida Pio XII", "Pamplona", "Navarra");
        Producto producto1 = new Producto("Rotulador fosforescente", 6.70);
        Producto producto2 = new Producto("Memoria USB 64GB", 14.80);
        LineaPedido linea1 = new LineaPedido(producto1, 20);
        LineaPedido linea2 = new LineaPedido(producto2, 10);
        pedido1 = new Pedido (fechaPedid1, clientePedid1, linea1, linea2);

        // crear pedido2
        Fecha fechaPedid2 = new Fecha(8, 10, 2019);
        Cliente clientePedid2 = new Cliente("Elisa Nuin", "C/ Rio Alzania", "Pamplona", "Navarra");
        Producto producto12 = new Producto("Sacapuntas manual", 16.64);
        Producto producto22 = new Producto("Corrector tippex", 5.99);
        LineaPedido linea21 = new LineaPedido(producto12, 8);
        LineaPedido linea22 = new LineaPedido(producto22, 20);
        pedido2 = new Pedido (fechaPedid2, clientePedid2, linea21, linea22);
    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.println("Pedido 1 \n ----------------------------------- \n" + pedido1.toString());
        System.out.println("Pedido 2 \n ----------------------------------- \n" + pedido2.toString());

        if (pedido2.masAntiguoQue(pedido1)){
            System.out.println("El pedido 2 se ha realizado antes que el pedido 1");
        } else {
            System.out.println("El pedido 1 se ha realizado antes que el pedido 2");
        }
    }
}
