/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_gabrielamontes;

import java.util.Scanner;
import java.util.Random;
public class Lab4P1_GabrielaMontes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Opcion 1: Fallout words ");
        System.out.println("Opcion 2:Rodatcripne");
        System.out.println("Opcion 3: Alpha ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        int op = entrada.nextInt();
        do{
            if (op>0){
         switch (op){
             case 1:
                 //fallout words
                 fallout();
                 break;
                 //case 1 end
             case 2:
                 //rodatcripne
                 entrada = new Scanner(System.in);
                 System.out.println ("Ingrese su contrasena: ");
                String password = entrada.nextLine();
                 encript (password); 
                 break;                    
                 //case 2 end
             case 3:
                 //Alpha
                 entrada = new Scanner(System.in);
                 System.out.println ("Ingrese la cadena que desea evaluar: ");
                String phrase = entrada.nextLine();
                 Alpha(phrase);
                 break;
                 //case 3 end
         }
            } else{
                System.out.println (" ERROR ");
            }
        // TODO code application logic here
        System.out.println("");
        System.out.println("---Menu---");
        System.out.println("Opcion 1: Fallout words ");
        System.out.println("Opcion 2:Rodatcripne");
        System.out.println("Opcion 3: Alpha ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        op = entrada.nextInt();
    }while(op!=4);
        
  }
    
        public static void Alpha (String cadena) {
        String min=cadena.toLowerCase();
        int j=1;
        for (int i = 0; i < cadena.length(); i++) {
           int num=min.charAt(i);
           if ((num>=97)&&(num <=122)){
             //System.out.println("La cadena solo contiene letras.");
           }else{
               //alpha=true;
               //System.out.println("La cadena contiene caracteres que no son letras.");
               j++;
           }
        }
        
         if (j==1){
               System.out.println("La cadena solo contiene letras.");
           }else{
               System.out.println("La cadena contiene caracteres que no son letras."); 
           }   
    }

    public static void encript (String contraseña) {
                   String cadena=contraseña.replace(" ", "");
                   String minuscula=cadena.toLowerCase();
                   String palabra="";
                   String reversa="";
                   for (int i=minuscula.length()-1;i>=0;i--){
                       if (i%2==0){
                           reversa=minuscula.charAt(i)+"";
                           palabra+=reversa;
                        }else{
                        int num=new Random().nextInt((9 - 0) + 1) + 0;
                        palabra+=num;
                       }   
    }
    System.out.println ("Output:"+palabra);  
}
    public static void fallout() {
          Scanner entrada = new Scanner(System.in);
        System.out.println("Tiene 5 intentos ");
        System.out.println("---Lista---");
        System.out.println("Opcion 1: comer ");
        System.out.println("Opcion 2: jugar");
        System.out.println("Opcion 3: salta");
        System.out.println("Opcion 4: llora ");
        System.out.println("Opcion 5: muere ");
        System.out.println("Opcion 6: unida ");
        System.out.println("Opcion 7: venti ");
        System.out.println("Opcion 8: llama ");
        System.out.println("Opcion 9: eevee ");
        System.out.println("Opcion 10: local ");
        System.out.println("Ingrese su respuesta: ");
        int op = entrada.nextInt();
        int h=1;
        while (h<=5){
        String word="";
        String palabra="";
        int j=0;
        int g=0;
        
        if (op<=10){
            int num=new Random().nextInt((10 - 1) + 1) + 1;
            switch (num){
            case 1:
                word="comer";
                break;
            case 2:
                word="jugar";
                break;
            case 3:
                word="salta";
                break;
            case 4:
                word="llora";
                break;
            case 5:
                word="muere";
                break;
            case 6:
                word="unida";
                break;
            case 7:
                word="venti";
                break;
            case 8:
                word="llama";
                break;
            case 9:
                word="eevee";
                break;
            case 10:
                word="local";
                break;
        }
            switch (op){
            case 1:
                palabra="comer";
                break;
                
            case 2:
                palabra="jugar";
                break;
            case 3:
                palabra="salta";
                break;
            case 4:
                palabra="llora";
                break;
            case 5:
                palabra="muere";
                break;
            case 6:
                palabra="unida";
                break;
            case 7:
                palabra="venti";
                break;
            case 8:
                palabra="llama";
                break;
            case 9:
                palabra="eevee";
                break;
            case 10:
                palabra="local";
                break;
                
            }
            j=1;
            g=1;
                   
            for (int i = 0; i<word.length(); i++){
                char letter=word.charAt(i);
                char letra=palabra.charAt(i);
                if (letter==letra){
                    j++;
                }
                if (letra==word.indexOf(i)){
                    g++;
                }
            }
            if (j==5){
                System.out.println("¡Acceso concedido!");
            }
            
            System.out.println (j +"letra correcta");
            System.out.println (g +"posicion correcta");
        }else{ 
            System.out.println("Error");
        }
        System.out.println("intentos: "+h);
        h++;
        System.out.println("---Lista---");
        System.out.println("Opcion 1: comer ");
        System.out.println("Opcion 2: jugar");
        System.out.println("Opcion 3: salta");
        System.out.println("Opcion 4: llora ");
        System.out.println("Opcion 5: muere ");
        System.out.println("Opcion 6: unida ");
        System.out.println("Opcion 7: venti ");
        System.out.println("Opcion 8: llama ");
        System.out.println("Opcion 9: eevee ");
        System.out.println("Opcion 10: local ");
        System.out.println("Ingrese su respuesta: ");
        op = entrada.nextInt();
    }             System.out.println("5 intentos, GAME OVER");

        
    
}
}

                     

                        