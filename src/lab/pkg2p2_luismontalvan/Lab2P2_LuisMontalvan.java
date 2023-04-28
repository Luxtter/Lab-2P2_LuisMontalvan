/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2p2_luismontalvan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luism
 */
public class Lab2P2_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pochita = new Scanner(System.in);
        int resp = 0;
        ArrayList<Login> usuarios = new ArrayList();
        usuarios.add(new Login("admin", "admin123", "Personal Administrativo"));
        while (resp != 3) {
            System.out.print("1. Iniciar Sesion"
                    + "\n2. Crear usuario"
                    + "\n3. Salir"
                    + "\nElija un a opcion: ");
            resp = pochita.nextInt();
            String usuario= "";
            String contrasena= "";
            switch (resp) {
                case 1:
                    int bandera = 0;
                    System.out.print("Usuario: ");
                    usuario= pochita.nextLine();
                    System.out.print("Contrasena: ");
                    contrasena = pochita.nextLine();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuario.equals(((Login)usuarios.get(i)).getUsuario())) {
                            if (contrasena.endsWith(((Login)usuarios.get(i)).getContrasena())) {
                               menu(); 
                            }
                        }
                        bandera++;
                        if (bandera == usuarios.size()) {
                            System.out.println("Usuario o contrasena no valido");
                        }
                    }
                    break;
                case 2:
                    pochita= new Scanner(System.in);
                    System.out.print("Ingrese usuario: ");
                    usuario= pochita.nextLine();
                    System.out.print("Ingrese contrasena: ");
                    contrasena= pochita.nextLine();
                    System.out.print("1. Cliente "
                            + "\n2. Personal Administrativo"
                            + "\n Elija el tipo de usuario que desea crear: ");
                    pochita= new Scanner(System.in);
                    resp = pochita.nextInt();
                    String tipo = "";
                    switch (resp) {
                        case 1:
                            tipo = "Cliente";
                            break;
                        case 2:
                            tipo = "Personal Administrativo";
                        default:
                            throw new AssertionError();
                    }
                    usuarios.add(new Login(usuario, contrasena, tipo));
                    System.out.println("Usuario creado exitosamente");
                    break;
                default:
                    throw new AssertionError();
            }//fin switch case
        }//fin del while
    }//fin del main

    static void menu() {

    }
}
