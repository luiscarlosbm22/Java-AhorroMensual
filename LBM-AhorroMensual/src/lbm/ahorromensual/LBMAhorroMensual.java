/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbm.ahorromensual;

import java.util.Scanner;

/**
 *
 * @author MenDark
 */
public class LBMAhorroMensual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
           double mensual, ahorro=0;
           int mes;
          

          for (mes=1; mes<=12; mes++) {
            System.out.print( "Ingrese dinero ahorrado en el mes: "+mes+" : ");
            mensual = sc.nextInt();
            
            ahorro = ahorro + mensual;
           System.out.print( "En el mes: "+mes+" se ahorro " + ahorro);
          }
    }
    
}
