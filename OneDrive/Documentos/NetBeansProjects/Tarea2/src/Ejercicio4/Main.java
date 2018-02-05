
package Ejercicio4;

import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author Jorgi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int rnum = 0;
            System.out.println("Enter the number:");
            int num = scanner.nextInt();
            String miStr = Integer.toString(num);
            // Create a Stack of Character
            Stack<Character> st = new Stack<Character>();  
            for (int i = 0; i < miStr.length(); i++)
            st.push(miStr.charAt(i));
            /// {write your code here
            while(!st.isEmpty()){  // creamos un while que se ejecute siempre que no este vacio el array
                System.out.print(st.pop());  // mostramos por pantalla el array con un pop, que muestra el numero de atras a delante 
            }                               // ya que al ser una pila, cuando desapila lo hace desde arriba(derecha), hacia abajo(izquierda)
    }
}
   
