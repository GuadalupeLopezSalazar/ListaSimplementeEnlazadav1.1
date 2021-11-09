
package listasimplementeenlazadav1.pkg1;
/**
 * @Guadalupe Lopez Salazar
 */
import java.util.Scanner;      /*Libreria de introduccion de datos*/
public class ListaSimplementeEnlazadav11 {
     Scanner sc = new Scanner (System.in);    /*Permite ingresar datos por teclado*/
    static class Nodo {
        String Nombre; /*Declaracion de variable de tipo cadena*/
        Nodo Sig;   /*Declaracion de variable de tipo nodo*/
    }
    Nodo inicio = null;  /*Declaracion de variable llamada inicio y temp de tipo nodo y sus valores son nulos*/
    Nodo temp = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    /*Permite ingresar datos por teclado*/
        ListaSimplementeEnlazadav11 nodo = new ListaSimplementeEnlazadav11();
        int Opt;      /*Declaracion de variables enteras*/
        do {
            System.out.println("ESCOJA LA OPCION QUE QUIERA REALIZAR:\n"
                    + "1 - AGREGAR NODO\n"
                    + "2 - MOSTRAR LISTA\n"          /*Opciones a elegir por el  usuario*/
                    + "3 - SALIR\n");
            switch (Opt = sc.nextInt()) {
                case 1: /*Se agrega un nodo*/
                nodo.agregar();  
                break; /*Se termina el primer caso*/
                case 2: /*Se muestra la lista*/
                nodo.mostrar();    
                break; /*Se termina el tercer caso*/
    }
        }while (Opt != 3);   /*Salir*/
    }
public void agregar() {   /*Caso 1*/
        if (inicio == null) {    /*Condicion a cumplir*/
            inicio = new Nodo();  /*Se asigna a la variable inicio los atributos de la clase nodo*/
            System.out.print("\n" + "INGRESE EL NODO: ");   /*Solicitud de dato para el usuario*/
            inicio.Nombre = sc.nextLine();
            inicio.Sig=null;
        } else {
            temp = new Nodo(); /*Se asigna a la variable temp los atributos de la clase nodo*/
            System.out.print("\n" + "INGRESE EL NODO: ");  /*Solicitud de dato para el usuario*/
            temp.Nombre = sc.nextLine(); 
            temp.Sig = inicio; 
            inicio = temp; 
        }
    }

    public void mostrar() {   /*Caso 2*/
        temp = new Nodo();   /*Se asigna a la variable temp los atributos de la clase nodo*/
        temp = inicio; 
        if (inicio != null) {   /*Condicion a cumplir*/
            System.out.println("");
            while (temp != null) {   /*Condicion a cumplir*/
                System.out.println("NODO: " + temp.Nombre+ " "); 
                temp = temp.Sig;
            }
            
        } else {
            System.out.println( "LISTA VACIA");    /*Mensaje a mostrar*/
        }
    }
}

    

