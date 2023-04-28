/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2p2_luismontalvan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author luism
 */
public class Lab2P2_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
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

    static void menu(Login usuarioA) throws ParseException {
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
                    resp = pochita.nextInt();
                    switch (resp) {
                        case 1:
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese el nombre de la obra: ");
                            String nombre= pochita.nextLine();
                            System.out.print("Ingrese nombre del autor: ");
                            String autor = pochita.nextLine();
                            System.out.print("La obra esta en exposicion"
                                    + "\n1.Si"
                                    + "\n2.No"
                                    + "\nElija una opcion: ");
                            pochita = new Scanner(System.in);
                            int sino = pochita.nextInt();
                            String exposicion = sino==1? "Si":"No";
                            System.out.print("Ingrese la fecha de presentacion (en formato dd/MM/yyyy): ");
                            pochita = new Scanner(System.in);
                            String fecha1 = pochita.nextLine();
                            SimpleDateFormat parser = (SimpleDateFormat)new SimpleDateFormat("dd/MM/yyyy");
                            Date presentacion = parser.parse(fecha1);
                            System.out.print("Ingrese la fecha de aquiscion (en formato dd/MM/yyyy): ");
                            pochita = new Scanner(System.in);
                            String fecha2 = pochita.nextLine();
                            Date adquisicion = parser.parse(fecha1);
                            pinturas.add(new Pintura(nombre, autor, exposicion, presentacion, adquisicion));
                            break;
                        case 2:
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese el escultor: ");
                            String escultor = pochita.nextLine();
                            System.out.print("Ingrese el material de la esculura: ");
                            String material = pochita.nextLine();
                            System.out.print("Ingrese el departamento a el que pertenece"
                                    + "\n1.Arqueologia"
                                    + "\n2.Artes"
                                    + "\n3.Moderna"
                                    + "\nElija una opcion: ");
                            pochita = new Scanner(System.in);
                            int dep = pochita.nextInt();
                            String departamento = "";
                            switch (dep) {
                                case 1:
                                    departamento = "Arqueologia";
                                    break;
                                case 2:
                                    departamento = "Artes";
                                    break;
                                case 3:
                                    departamento = "Moderna";
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            System.out.print("Ingrese el ano en el que se empezo a esculpir");
                            pochita = new Scanner(System.in);
                            int ano = pochita.nextInt();
                            esculturas.add(new Escultura(escultor, material, departamento, ano));
                            break;
                        case 3:
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese las dimensiones: "
                                    + "\n1.512 x 512"
                                    + "\n2.420 x 360"
                                    + "\n3.720 x 560"
                                    + "\nElija una opcion: ");
                            int opc = pochita.nextInt();
                            String dimension = "";
                            switch (opc) {
                                case 1:
                                    dimension = "512 x 512";
                                    break;
                                case 3:
                                    dimension = "720 x 560";
                                    break;
                                case 2:
                                    dimension = "420 x 360";
                                    break; 
                                default:
                                    throw new AssertionError();
                            }
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese la resolucion: "
                                    + "\n1.1920 x 1080"
                                    + "\n2.2048 x 1440"
                                    + "\n3.3840 x 2160"
                                    + "\nElija una opcion: ");
                            opc = pochita.nextInt();
                            String resolucion = "";
                            switch (opc) {
                                case 1:
                                    resolucion = "1920 x 1080";
                                    break;
                                case 3:
                                    resolucion = "2048 x 1440";
                                    break;
                                case 2:
                                    resolucion = "3840 x 2160";
                                    break; 
                                default:
                                    throw new AssertionError();
                            }
                            System.out.print("1.Color"
                                    + "\n2.B/N"
                                    + "\nElija el color de la fotografia: ");
                            opc = pochita.nextInt();
                            String Color = opc==1? "Color":"B/N";
                            fotografias.add(new Fotografia(dimension, resolucion, Color));
                            break;
                        case 4:
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese el numero de palaras del escrito: ");
                            int palabras = pochita.nextInt();
                            System.out.print("Ingrese la epoca del escrito: ");
                            pochita = new Scanner(System.in);
                            String epoca = pochita.nextLine();
                            System.out.print("Ingrese el genero: ");
                            String genero = pochita.nextLine();
                            System.out.print("Ingrese el autor: ");
                            String autorE = pochita.nextLine();
                            escritos.add(new Escrito(palabras, epoca, genero, autorE));
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 3:
                    System.out.print("Que exhibicion desea modificar"
                            + "\n1.Pintura"
                            + "\n2.Escultura"
                            + "\n3.Fotografia"
                            + "\n4.Escrito"
                            + "\nIngrese una opcion: ");
                    pochita = new Scanner(System.in);
                    resp = pochita.nextInt();
                    System.out.println("Que exhibicion desea modificar");
                    
                    switch (resp) {
                        case 1:
                            String ecad = "";
                            for (int i = 0; i < pinturas.size(); i++) {
                                ecad+= i+".Exhibicion "+(i+1)+"\n";
                            }
                            System.out.print(ecad+"Elija una opcion: ");
                            int opc = pochita.nextInt();
                            System.out.print("Que desea modificar"
                            + "\n1.Nombre"
                            + "\n2.Autor"
                            + "\n3.Exposicion"
                            + "\n4.Ano de presentacion"
                            + "\n5.Ano de aquisicion"
                                    + "\nElija una opcion: ");
                            resp = pochita.nextInt();
                            SimpleDateFormat parser = (SimpleDateFormat)new SimpleDateFormat("dd/MM/yyyy");
                            switch (resp) {
                                case 1:
                                    System.out.print("Ingrese el nombre: ");
                                    String nom = pochita.nextLine();
                                    pinturas.get(opc).setNombre(nom);
                                    break;
                                case 2:
                                    System.out.print("Ingrese el autor: ");
                                    String aut = pochita.nextLine();
                                    pinturas.get(opc).setAutor(aut);
                                    break;
                                case 3:
                                    System.out.print("Esta en exposicion (Si/No): ");
                                    String exp = pochita.nextLine();
                                    pinturas.get(opc).setExposicion(exp);
                                    break;
                                case 4:
                                    System.out.print("Ingrese la fecha de adquisicion: ");
                                    
                                    Date adq = parser.parse(pochita.nextLine());
                                    pinturas.get(opc).setAdquisicion(adq);
                                    break;
                                case 5:
                                    System.out.print("Ingrese la fecha de adquisicion: ");
                                    
                                    Date exh = parser.parse(pochita.nextLine());
                                    pinturas.get(opc).setAdquisicion(exh);
                                    break;
                                    
                                default:
                                    throw new AssertionError();
                            }//1
                            
                            break;
                        case 2:
                        default:
                            throw new AssertionError();
                    }//2
                case 4:
                    System.out.print("De que exhibicion desea eliminar"
                            + "\n1.Pintura"
                            + "\n2.Escultura"
                            + "\n3.Fotografia"
                            + "\n4.Escrito"
                            + "\nIngrese una opcion: ");
                    pochita = new Scanner(System.in);
                    resp = pochita.nextInt();
                    String cadena= "";
                    int elim = 0;
                    switch (resp) {
                        case 1:
                            cadena= "";
                            for (int i = 0; i < pinturas.size(); i++) {
                                cadena+= i+".Exhibicion "+i+1+"\n";
                            }
                            System.out.print(cadena+"Que exhibicion desea eliminar: ");
                            elim = pochita.nextInt();
                            pinturas.remove(elim);
                            break;
                        case 2:
                            cadena = "";
                            for (int i = 0; i < esculturas.size(); i++) {
                                cadena+= i+".Exhibicion "+(i+1)+"\n";
                            }
                            System.out.print(cadena+"Que exhibicion desea eliminar: ");
                            elim = pochita.nextInt();
                            pinturas.remove(elim);
                            break;
                        case 3:
                            cadena = "";
                            for (int i = 0; i < fotografias.size(); i++) {
                                cadena+= i+".Exhibicion "+(i+1)+"\n";
                            }
                            System.out.print(cadena+"Que exhibicion desea eliminar: ");
                            elim = pochita.nextInt();
                            pinturas.remove(elim);
                            break;
                        case 4:
                            cadena = "";
                            for (int i = 0; i < escritos.size(); i++) {
                                cadena+= i+".Exhibicion "+(i+1)+"\n";
                            }
                            System.out.print(cadena+"Que exhibicion desea eliminar: ");
                            elim = pochita.nextInt();
                            pinturas.remove(elim);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                default:
                  
                    throw new AssertionError();
            }
        }
    }
}
