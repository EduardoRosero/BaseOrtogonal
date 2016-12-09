/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import javax.swing.JOptionPane;

/**
 *
 * @author tuteggito
 */
public class Base {
    public double[] calcularProyeccion(double u[], double v[], double lambda) {
        double d[] = new double[2];
        d[0] = v[0] - (lambda * u[0]);
        d[1] = v[1] - (lambda * u[1]);
        return d;
    }

    public int validarNulo(double u[], double v[]) {
        if ((u[0] == 0 && u[1] == 0) || (v[0] == 0 && v[1] == 0)) {
            JOptionPane.showMessageDialog(null, "Existe un vector nulo", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
            return 0;
        } else {
            return 1;
        }
    }

    public double calcularLambda(double u[], double v[]) {
        double producto = (u[0] * v[0]) + (u[1] * v[1]);
        double mul = (u[0] * u[0]) + (u[1] * u[1]);
        //double norma = Math.sqrt()
        return producto / mul;
    }

    public int validarColineales(double u[], double v[]) {
        double determinante = 0;
        determinante = (u[0] * v[1]) - (u[1] * v[0]);
        if (determinante == 0) {
            JOptionPane.showMessageDialog(null, "Los vectores son colineales", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
            return 0;
        } else {
            return 1;
        }
    }
}
