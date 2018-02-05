/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;

public class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String newstr = "";
		boolean si = false;
		char ch;
		char[] letras = { 'a', 'e', 'i', 'o', 'u' };
		System.out.print("Enter the Word: ");
		String str = br.readLine();
		LinkedList<Character> al = new LinkedList<Character>();
		StringBuffer txt = new StringBuffer();
		// Create LinkedList of Character
		for (int i = 0; i < str.length(); i++) {

			al.add(str.charAt(i));
		}
		/// {write your code here

		for (int j = 0; j < al.size(); j++) {
			si = false;
			for (int h = 0; h < letras.length; h++) {

				if (al.get(j) == letras[h]) {

					si = true;

				}

			}
			if (!si) {
				txt.append(al.get(j));
			}
		}

		System.out.println("Edited Word: " + txt.toString());
	}

}