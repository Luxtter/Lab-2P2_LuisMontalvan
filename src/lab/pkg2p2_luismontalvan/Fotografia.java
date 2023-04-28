/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismontalvan;

/**
 *
 * @author luism
 */
class Fotografia {
    private String dimension, resolucion, color;

    public Fotografia() {
    }

    public Fotografia(String dimension, String resolucion, String color) {
        this.dimension = dimension;
        this.resolucion = resolucion;
        this.color = color;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fotografia{" + "dimension=" + dimension + ", resolucion=" + resolucion + ", color=" + color + '}';
    }
    
}
