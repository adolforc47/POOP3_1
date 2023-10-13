/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3_1;

/**
 *
 * @author Eduardo, Adolfo, Mariana
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class POOP3_1 {

    public static void main(String[] args) {
        // Impresión de encabezado
        System.out.println("####### ARREGLOS ######");

        // Declaración y asignación de arreglos de diferentes formas
        int[] nums;                   // Declaración de un arreglo de enteros
        int[] nums1;
        int[] nums2;
        int nums3[];
        int[] nums4 = {1, 2, 3, 4};  // Declaración e inicialización de un arreglo

        System.out.println("####### FOR ######");
        // Bucle 'for' para recorrer y mostrar los elementos del arreglo nums4
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }

        System.out.println("####### FOR-EACH ######");
        // Bucle 'for-each' para recorrer y mostrar los elementos del arreglo nums4
        for (int i : nums4) {
            System.out.println(i);
        }

        System.out.println("####### CONCATENAR ######");
        // Ejemplos de concatenación de cadenas
        String s = new String("Hola Mundo");
        String s1 = "Hola Mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre = "Mariana";
        String apellido = "Hernandez";
        String nombreCompleto = nombre + " " + apellido;  // Concatenación de cadenas
        System.out.println(nombreCompleto);

        System.out.println("####### ORDENAR PUNTO ######");
        // Operaciones y propiedades de cadenas
        System.out.println("Número de elementos del arreglo: " + nums4.length);
        System.out.println("Número de caracteres en el nombre: " + nombre.length());
        System.out.println(nombreCompleto.toUpperCase()); // Conversión a mayúsculas

        System.out.println("####### WRAPPERS Y AUTOBOXING ######");
        // Ejemplos de Wrappers y Autoboxing
        int a = 3;
        Integer k = new Integer(50);
        Integer l = 22;
        int r = l;
        int b = 7;
        float c = b; // Conversión implícita
        int d = (int) c; // Conversión explícita
        Integer rr = r;
        String s3 = rr.toString(); // Conversión a cadena
        System.out.println(s3);
        String s4 = r + ""; // Conversión a cadena
        System.out.println(s4);
        System.out.println(s4.length());

        System.out.println("####### COLECCIONES ######");

        System.out.println("####### ArrayList ######");
        // Uso de ArrayList para almacenar números enteros
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(0, 20);
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }

        System.out.println("####### Hashtable ######");
        // Uso de Hashtable para almacenar pares clave-valor
        Hashtable<Integer, String> agenda = new Hashtable<Integer, String>();
        agenda.put(k, "Tania");
        agenda.put(12347, "Araceli");
        agenda.put(9812, "Joy");
        agenda.put(8463, "Erika");
        System.out.println(agenda.size());
        for (String valor : agenda.values()) {
            System.out.println(valor);
        }
        for (Integer clave : agenda.keySet()) {
            System.out.println(clave);
        }

        System.out.println("####### Enumeracion ######");
        // Uso de enumeración para acceder a claves y valores en Hashtable
        Integer clave;
        String valor;
        Enumeration<Integer> llaves = agenda.keys();
        while (llaves.hasMoreElements()) {
            clave = llaves.nextElement();
            valor = agenda.get(clave);
            System.out.println("Clave: " + clave + " Valor: " + valor);
        }

        System.out.println("####### MATH ######");
        // Uso de funciones matemáticas de la clase Math
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));

        System.out.println("####### DATE ######");
        // Uso de la clase Date para obtener la fecha actual
        Date hoy = new Date();
        System.out.println(hoy);
    } 
}
