/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String a[]) throws Exception{
	    String strarr[];    //array which will hold splitted strings of the statement
        String st;      //contains user input statement 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Statement:"); 
        st=br.readLine();
        System.out.println("The reverse is:");

		strarr = st.split(" ");
		// Create ArrayList of String
		ArrayList<String> lista = new ArrayList<String>();
		/// {write your code here
		for (int i = 0; i < strarr.length; i++) {
			lista.add(strarr[i]);
		}
		Collections.reverse(lista);
		String nuevo = "";
		for (String nuevo2 : lista) {
			nuevo = nuevo + nuevo2 + " ";
			st = nuevo;
		}
        System.out.println(st);
 	 
    } 
	 
}
