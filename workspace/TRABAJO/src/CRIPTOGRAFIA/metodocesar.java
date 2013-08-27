package CRIPTOGRAFIA;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
public class metodocesar { 
 
    static String minuscula = "abcdefghijklmnopqrstuvwxyz"; 
    static String mayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
     
    public static void main(String[] args){ 
        try { 
        String texto = ""; 
        int n = 0; 
        System.out.println("Texto a cifrar"); 
        texto = bf.readLine(); 
        System.out.println("Desplazamiento para el cifrado.(numero entero)"); 
        n = Integer.parseInt(bf.readLine()); 
        System.out.println(n); 
        System.out.println("Texto: "+texto); 
        System.out.println("Texto cifrado: "+cifCesar(texto,n)); 
        } catch (Exception e) { 
            System.out.print("Valor no valido."); 
        } 
    } 
     
    private static String cifCesar(String entrada,int desp){ 
        String salida = ""; 
        for(int i = 0;i<entrada.length();i++){ 
            if((minuscula.indexOf(entrada.charAt(i)) != -1) || (mayuscula.indexOf(entrada.charAt(i)) != -1)) 
                salida += (minuscula.indexOf(entrada.charAt(i)) != -1) ? minuscula.charAt( ( (minuscula.indexOf(entrada.charAt(i)) )+desp)%minuscula.length() ) : mayuscula.charAt(( mayuscula.indexOf(entrada.charAt(i)) +desp)%mayuscula.length()); 
            else 
                salida += entrada.charAt(i); 
        } 
        return salida; 
    } 
 
} 


