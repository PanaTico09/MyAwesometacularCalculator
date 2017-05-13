/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import util.FiguraGeometrica;

/**
 *
 * @author laboratorio
 */
public abstract class Figura implements FiguraGeometrica {
    
    protected String nombre;
    protected boolean es3d;

    @Override
    public String toString() {
        return "LLAMADO DESDE SUPER, Figura{" + "nombre=" + nombre + ", es3d=" + es3d + '}';
    }
    
    
}
