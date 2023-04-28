/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismontalvan;

import java.util.Date;

/**
 *
 * @author luism
 */
class Pintura {
    private String nombre, autor, exposicion;
    private Date presentacion, adquisicion;

    public Pintura() {
    }

    public Pintura(String nombre, String autor, String exposicion, Date presentacion, Date adquisicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.exposicion = exposicion;
        this.presentacion = presentacion;
        this.adquisicion = adquisicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    public Date getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Date presentacion) {
        this.presentacion = presentacion;
    }

    public Date getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(Date adquisicion) {
        this.adquisicion = adquisicion;
    }

    @Override
    public String toString() {
        return "Pintura{" + "nombre=" + nombre + ", autor=" + autor + ", exposicion=" + exposicion + ", presentacion=" + presentacion + ", adquisicion=" + adquisicion + '}';
    }
   
}
