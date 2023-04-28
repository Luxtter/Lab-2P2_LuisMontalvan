/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismontalvan;

/**
 *
 * @author luism
 */
class Escultura {
    private String escultor, material, departamento;
    private int ano;

    public Escultura() {
    }

    public Escultura(String escultor, String material, String departamento, int ano) {
        this.escultor = escultor;
        this.material = material;
        this.departamento = departamento;
        this.ano = ano;
    }

    public String getEscultor() {
        return escultor;
    }

    public void setEscultor(String escultor) {
        this.escultor = escultor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Escultor: " + escultor + "\nMaterial: " + material + "\nDepartamento: " + departamento + "\nAno de empiezo: " + ano;
    }
    
}
