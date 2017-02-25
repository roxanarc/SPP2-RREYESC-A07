/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//DESARROLLA UN PROGRAMA EN JAVA QUE SOLICITE POR TECLADO AL USUARIO 
//LOS NUMEROS TELEFONICOS DE 10 PERSONAS Y LOS GUARDE EN UN ARREGLO DE ENTEROS LARGOS (LONG)
//dESPUES LE SOLICITE UNA POSICION A CONSULTAR Y MUESTRE EL NUMERO EN LA PANTALLA
//SI LA POSICION NO EXISTE DEBE INDICAR QUE ESTA FUERA DE RANGO

package spp2.rreyesc.a07;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RREYESCA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Roxana Reyes Cordoba A00820572 IIS
          Long [] telefono = new Long [10];
    for (int i=0; i<telefono. length; i++){
        telefono [i] = tel("el numero telefonico "+ (i+1));
    }
    
    int consulta = consult("El numero que desea saber");
    System.out.println("El numero de la persona "+consulta+" es: " + telefono[consulta]);
    }
    
    public static long tel(String mensaje){
        Scanner sc = new Scanner (System.in);
        long varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduce " + mensaje);
        try{
        varEntera = sc.nextLong();
        flag=false;
        }
        catch (Exception ex){
            System.out.println("Introduzca un numero valido");
            flag=true;
            sc.next();
        } 
        }while (flag); 
    return varEntera;
    }
    public static int consult(String mensaje){
        Scanner sc = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduce " + mensaje);
        try{
        varEntera = sc.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Incorrecto" + ex);
            flag=true;
            sc.nextLine();
    } 
  } while (flag); 
    return varEntera;}
}
    

