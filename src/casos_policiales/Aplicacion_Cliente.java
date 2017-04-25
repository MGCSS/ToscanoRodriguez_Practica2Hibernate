/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos_policiales;

import controlador.ManejaExperto;

/**
 *
 * @author david
 */
public class Aplicacion_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManejaExperto me = new ManejaExperto();
        //me.obtenerNombresyEspeciaidad();
        //me.expertosConEspecialidadX("Armas");
        me.obtenerCasos();
    }
    
}
