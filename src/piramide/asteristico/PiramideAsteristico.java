/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide.asteristico;

import java.util.Scanner;

/**
 *
 * @author Luis-Molinares
 */
public class PiramideAsteristico 
{

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introducir el número de filas: ");
        
       
        int numFilas = sc.nextInt();
 
        for(int i=1; i<=numFilas; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
                
            }
            
            System.out.println("");
        }
        // Este comando es para cerrar el ciclo y a la vez limpia el buffer
        sc.close();
    }
}
