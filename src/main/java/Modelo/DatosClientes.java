/*@author David Alexander Romero I*/
package Modelo;
public class DatosClientes {
    private String NumeroDeDocumento;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;
    private String profesionCliente;
    //CONSTRUCTOR DatosClientes
    public String getNumeroDeDocumento() {
        return NumeroDeDocumento;
    }
    public void setNumeroDeDocumento(String NumeroDeDocumento) {
        this.NumeroDeDocumento = NumeroDeDocumento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getProfesionCliente() {
        return profesionCliente;
    }
    public void setProfesionCliente(String profesionCliente) {
        this.profesionCliente = profesionCliente;
    }   
   }

 

