package Ejercicio1;
import java.util.Scanner;

public class Buses {
    public static void main(String[] args) throws Exception {
        Autobus[] bus = new Autobus[4];
        Scanner entrada = new Scanner(System.in);
        int potencia,numPla;
        String matri,model;
        for (int i = 0; i<4;i++){
            System.out.println("informacion del Bus: "+(i+1));
            potencia = entrada.nextInt();
            numPla = entrada.nextInt();
            entrada.nextLine();
            matri = entrada.nextLine();
            model = entrada.nextLine();
            bus[i] = new Autobus(matri,model,numPla,potencia);
        }
        for (int i = 0;i<4;i++){
            System.out.println("Matricula del Bus "+(i+1)+":"+bus[i].getMatricula());
            System.out.println("Modelo del Bus "+(i+1)+":"+bus[i].getModelo());
            System.out.println("Numero de plazas del Bus "+(i+1)+":"+bus[i].getNumeroPlazas());
            System.out.println("Potencia del Bus "+(i+1)+":"+bus[i].getPotenciaCV());
        }
        entrada.close();
    }
}
