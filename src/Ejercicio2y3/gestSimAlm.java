package ejercicio2y3;

import java.util.Scanner;

public class gestSimAlm {
    public static void main(String[] args) {
        Scanner pregunta = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("Que quieres hacer:");
            System.out.println("0.Entrada Automatizada");
            System.out.println("1.Listado de articulos");
            System.out.println("2.Crear articulo nuevo");
            System.out.println("3.Borrar articulo");
            System.out.println("4.Aumentar Stock");
            System.out.println("5.Disminuir Stock");
            System.out.println("6.Salir\t");
            menu = pregunta.nextInt();
            pregunta.nextLine();
            switch (menu) {
                case 0:
                    PruebaArticulo.crear4();
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            }
        } while (menu != 6);
        pregunta.close();
    }
}
