/*@author David Alexander Romero I*/
package Controlador;
public class Validacion {
    //VALIDACION REFERENCIA FACTURA
     public static boolean esNumericoRefernciaF(String textoEvaluar){
     String expresion = "^[0-9]*$";
     if (textoEvaluar.matches(expresion)){
     return true;
     }
     return false;
     }   
    //VALIDACION CODIGO PRODUCTOS
     public static boolean esNumericoCodigo(String textoEvaluar){
     String expresion = "^[0-9]*$";
     if (textoEvaluar.matches(expresion)){
     return true;
     }
     return false;
     }   
    //VALIDACION CANTIDAD PRODUCTOS
     public static boolean esNumericoCantidad(String textoEvaluar){
     String expresion = "^[0-9]*$"; 
     if (textoEvaluar.matches(expresion)){
     return true;
     }
     return false;
     }
     //VALIDACION PRECIOS PRODUCTOS
     public static boolean esNumericoPrecio(String textoEvaluar){
     String expresion = "^[0-9]*$"; 
     if (textoEvaluar.matches(expresion)){
     return true;
     }
     return false;
     }    
     //VALIDACION NUMERO DE DOCUMENTO CLIENTE 
     public static boolean esNumericoDocumento(String textoEvaluar){
     String expresion = "^[0-9]*$"; 
     if (textoEvaluar.matches(expresion)){
     return true;
     }
     return false;
    }
    //VALIDACION NOMBRE CLIENTE
     public static boolean esTextoNombre(String textoEvaluar){
     System.out.println(textoEvaluar);    
     String expresion = "^[A-ZÑ]*$"; 
     boolean nombre =  textoEvaluar.matches(expresion);
     System.out.println(nombre);
         return true;
     }
     //VALIDACION APELLIDO CLIENTE  
     public static boolean esTextoApellido(String textoEvaluar){
     System.out.println(textoEvaluar); 
     String expresion = "^[A-ZÑ]*$"; 
     boolean nombre =  textoEvaluar.matches(expresion);
     System.out.println(nombre);
         return true;
     }
     //VALIDACION PROFESION CLIENTE
     public static boolean esTextoProfesion(String textoEvaluar){
     System.out.println(textoEvaluar); 
     String expresion = "^[A-ZÑ]*$"; 
     boolean nombre =  textoEvaluar.matches(expresion);
     System.out.println(nombre);
       return true;
     }
}
