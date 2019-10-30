
/**
 *  Representa a un cliente que hace un pedido 
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;

    /**
     * Constructor  
     */
    public Cliente(String nombre, String direccion, String ciudad, String provincia)    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    /**
     * accesor para el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * accesor para la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * accesor para la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * accesor para la provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * representación textual del cliente
     */
    public String toString() {
        String str1 = String.format("\n%10s %-10s \n",    "NOMBRE:", nombre);
        String str2 = String.format("%10s %-10s \n", "DIRECCION:", direccion); 
        String str3 = String.format("%10s %-10s \n",    "CIUDAD:",  ciudad);
        String str4 = String.format("%10s %-10s \n", "PROVINCIA:",  provincia);
        return str1 + str2 + str3 + str4;
    }

    /**
     * 
     */
    public void print() {
        System.out.println(this.toString());
    }

}
