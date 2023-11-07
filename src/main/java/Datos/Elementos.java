/*@author David Alexander Romero I*/
package Datos;
import Modelo.DatosClientes;
import Modelo.DatosProductos;
import java.util.HashMap;

public class Elementos {
/////////////////////////////////DATOSPRODUCTOS///////////////////////////////////////////////////////////
    private HashMap<String, DatosProductos>mapaDatosProductos;
    public  HashMap<String, DatosProductos> getMapaDatosProductos() {
        return mapaDatosProductos;
    }
    public void setMapaDatosProductos(HashMap<String,DatosProductos>mapaDatosProductos){
        this.mapaDatosProductos = mapaDatosProductos;
    }
 ///////////////////////////////DATOSCLIENTES/////////////////////////////////////////////////////////////////// 
    private HashMap<String, DatosClientes>mapaDatosClientes;     
    public HashMap<String, DatosClientes> getMapaDatosClientes(){ 
         return mapaDatosClientes; 
    }
    public void setMapaDatosClientes(HashMap<String,DatosClientes> mapaDatosClientes) {
        this.mapaDatosClientes = mapaDatosClientes;
    }
    public void getMapaDatosClientes(HashMap<String, Modelo.DatosClientes> mapaDatosClientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
