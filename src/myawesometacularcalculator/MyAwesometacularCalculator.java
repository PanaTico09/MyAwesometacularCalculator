/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myawesometacularcalculator;

import da.Circulo;
import da.Figura;
import da.Rectangulo;

/**
 *
 * @author laboratorio
 */
public class MyAwesometacularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura laFigura = new Rectangulo(15.2, 10);
        //System.out.println(laFigura.calcularPerimetro());

        Circulo theCircle = new Circulo(56.2);
        System.out.println((int) Math.floor(theCircle.calcularArea()));
        
        System.out.println((int) Math.floor(theCircle.calcularPerimetro()));
    }

}
