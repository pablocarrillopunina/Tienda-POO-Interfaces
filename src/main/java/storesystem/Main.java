package storesystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        //1. cramos objetos

        Dependiente dependiente = new Dependiente("Pablo", 32, "17452072296");
        Comprador comprador = new Comprador("Susana", 27, "18959237J");
        Tienda tienda = new Tienda();

        //2. mostra saludos
        System.out.println(dependiente.saludar());
        System.out.println(comprador.saludar());

        //3. mostrando inventario incial
        System.out.println(tienda);

        //menu interactivo
        int opcion;
        do {
            System.out.println("Usted es el comprador elija entre las siguientes opciones");
            System.out.println("1. Comprar producto");
            System.out.println("2. Devolver producto");
            System.out.println("3. Salir ");

            while (!sc.hasNextInt()){
                System.out.println("Opcion incorrecta");
                sc.next(); // limpiamos entrada incorrecta

            }
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1 ->{
                    System.out.println("introduzca el nombre del producto a comprar");
                    String productoComprar = sc.nextLine();
                    comprador.transaction(productoComprar, tienda);
                }
                case 2 -> {
                    System.out.println("introduzca el nombre del producto a devolver");
                    String productoDevolver = sc.nextLine();
                    dependiente.transaction(productoDevolver, tienda);

                    //devolver el dinero al comprador
                    System.out.println(" Introduzca el precio del producto devuelto ");
                    double precioDevolucion = sc.nextDouble();
                    sc.nextLine();
                    comprador.devolverDinero(precioDevolucion);

                }
                case 3 -> {
                    System.out.println("\nEl programa ha finalizado. El estado final de los distintos elemntos es el siguiente:\n ");
                    System.out.println(tienda);
                    System.out.println("Los ingresos de la tienda son: " + tienda.getDinero());
                    System.out.println("Los datos del dependiente son: ");
                    System.out.println(dependiente);
                    System.out.println("\n" + comprador);
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }

        }while (opcion != 3);
        sc.close();

    }
}
