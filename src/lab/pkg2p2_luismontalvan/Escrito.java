/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismontalvan;

/**
 *
 * @author luism
 */
class Escrito {
    private int palabras;
    private String epoca, genero, autor;

    public Escrito() {
    }

    public Escrito(int palabras, String epoca, String genero, String autor) {
        this.palabras = palabras;
        this.epoca = epoca;
        this.genero = genero;
        this.autor = autor;
    }

    public int getPalabras() {
        return palabras;
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Escrito{" + "palabras=" + palabras + ", epoca=" + epoca + ", genero=" + genero + ", autor=" + autor + '}';
    }
    
}
