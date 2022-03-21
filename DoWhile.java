/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Aldous
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n1 = 0, n2 = 1, n3, i, count = 45;
        System.out.println(n1);
        System.out.println(n2);

        for (i = 0; i < count; ++i) {
            n3 = n1 + n2;

            int temp;
	boolean Prime = true;
	
	for(int j=2; j <= n3/2 ; j++)
	{
           temp = n3 % j;
	   if(temp == 0)
	   {
	      Prime = false;
	      break;
	   }
        }
	if(Prime)
	   System.out.println(n3 + " = Prime");
	else
	   System.out.println(n3 + " = Not Prime");
           
            n1 = n2;
            n2 = n3;

        }
    }

}
