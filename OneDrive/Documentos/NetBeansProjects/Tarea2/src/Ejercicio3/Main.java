/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.io.IOException;

class Main {
    public static void main(String args[]) throws IOException {
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
                char ch1, ch2;
                String Ter ="";
                System.out.println("Meter la palabra:");
                String str = br.readLine();
                ArrayDeque<Character> dobleCola = new ArrayDeque<Character>();
                for (int i = 0; i < str.length(); i++)
                dobleCola.add(str.charAt(i));

                int cont=dobleCola.size();
                if (dobleCola.size() >= 2) {
                dobleCola.addLast(dobleCola.pollFirst());

                dobleCola.addLast(dobleCola.pollFirst());

                for (int i = 0; i < cont;i++) {
                Ter+=dobleCola.poll().toString();	
                }
                System.out.println(Ter);
                        }
    }
}