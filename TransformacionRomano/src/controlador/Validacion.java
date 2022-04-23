package controlador;

public class Validacion {
    
    //Validar campo de texto
    public static boolean validarTexto(String texto) {
        if(texto.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    //Validar int
    public static boolean validarNumero(String texto) {
        int valor;
        try {
            valor = Integer.parseInt(texto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
