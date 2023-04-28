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
            String usuario = "";
            String contrasena = "";
            switch (resp) {
                case 1:
                    int bandera = 0;
                    System.out.print("Usuario: ");
                    usuario = pochita.nextLine();
                    System.out.print("Contrasena: ");
                    contrasena = pochita.nextLine();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuario.equals(((Login) usuarios.get(i)).getUsuario())) {
                            if (contrasena.endsWith(((Login) usuarios.get(i)).getContrasena())) {
                                menu(((Login) usuarios.get(i)));
                            }
                        }
                        bandera++;
                        if (bandera == usuarios.size()) {
                            System.out.println("Usuario o contrasena no valido");
                        }
                    }
                    break;
                case 2:
                    pochita = new Scanner(System.in);
                    System.out.print("Ingrese usuario: ");
                    usuario = pochita.nextLine();
                    System.out.print("Ingrese contrasena: ");
                    contrasena = pochita.nextLine();
                    System.out.print("1. Cliente "
                            + "\n2. Personal Administrativo"
                            + "\n Elija el tipo de usuario que desea crear: ");
                    pochita = new Scanner(System.in);
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

    static void menu(Login usuarioA) {
        Scanner pochita = new Scanner(System.in);
        ArrayList<Pintura> pinturas = new ArrayList();
        ArrayList<Escultura> esculturas = new ArrayList();
        ArrayList<Fotografia> fotografias = new ArrayList();
        ArrayList<Escrito> escritos = new ArrayList();
        int resp = 0;
        while (resp != 5) {
            if (usuarioA.getTipo().equals("Personal Administrativo")) {
                System.out.print("1.Listar exhibiciones"
                    + "\n2.Crear exhibicion"
                        + "\n3.Modificar exhibiciones"
                        + "\n4.Eliminar exhibiciones"
                        + "\n5.Salir");
                resp = pochita.nextInt();
            } else {
                System.out.print("1.Ver exhibiciones"
                        + "\n2.Salir");
                resp = pochita.nextInt();
                resp = resp==2? 5:resp;
            }
            switch (resp) {
                case 1:
                    System.out.print("---Exhibiciones---\n\n---Pinturas---\n");
                    for (int i = 0; i < pinturas.size(); i++) {
                        System.out.println(pinturas+"\n\n");
                    }
                    System.out.print("---Esculturas---\n");
                    for (int i = 0; i < esculturas.size(); i++) {
                        System.out.println(esculturas+"\n\n");
                    }
                    System.out.print("---Fotografias---\n");
                    for (int i = 0; i < fotografias.size(); i++) {
                        System.out.println(fotografias+"\n\n");
                    }
                    System.out.print("---Escritos---\n");
                    for (int i = 0; i < escritos.size(); i++) {
                        System.out.println(escritos+"\n\n");
                    }
                    break;
                case 2:
                    resp=0;
                    pochita = new Scanner(System.in);
                    System.out.print("Que tipo de exhibicion desea crear:"
                            + "\n1.Pintura"
                            + "\n2.Escultura"
                            + "\n3.Fotografia"
                            + "\n4.Escrito"
                            + "\nElija una opcion: ");
                    resp = 
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
