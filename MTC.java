package MedidasTC;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MTC {

    public static void main(String[] args) {
//        int nr = (int) (Math.random() * (21) + 2);

        int nr = 10;
        System.out.println(nr);

        double[] num = new double[nr];
        for (int i = 0; i < num.length; i++) {
            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        }

//        CON METODO FOR
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

//        int auxiliarMayor = 1;
//        for (int i = 0; i < num.length; i++) {
//            int contador = 1;
//            for (int j = i + 1; j < num.length; j++) {
//                if (num[j] == num[i]) {
//                    contador++;
//
//                } else {
//                    break;
//                }
//            }
//            if (contador > auxiliarMayor) {
//                auxiliarMayor = contador;
//            }
//        }
//CON METODO WHILE
//        int auxiliarMayor = 1,iterador=0;
//
//        while (iterador < num.length) {
//            int contador = 1;
//            int j = iterador + 1;
//
//            while (j < num.length) {
//                if (num[j] == num[iterador]) {
//                    contador++;
//                } else {
//                    break;
//                }
//                j++;
//            }
//
//            if (contador > auxiliarMayor) {
//                auxiliarMayor = contador;
//            }
//
//            iterador = j;
//        }
//CON  DO-WHILE
        int auxiliarMayor = 1, iteracion2 = 0;

        do {
            int contador = 1;
            int j = iteracion2 + 1;

            while (j < num.length && num[j] == num[iteracion2]) {
                contador++;
                j++;
            }

            if (contador > auxiliarMayor) {
                auxiliarMayor = contador;
            }

            iteracion2 = j;
        } while (iteracion2 < num.length);

        //MODA
        System.out.println("\033[32mSU MODA ES");
        System.out.println("\033[32mEl o los digitos que mas se repiten son " + auxiliarMayor);
        for (int i = 0; i < num.length; i++) {
            int contador = 1;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] == num[i]) {
                    contador++;
                } else {
                    break;
                }
            }
            if (contador == auxiliarMayor) {
                System.out.print(num[i] + "->");
            }

        }

        System.out.println("\033[32mla encontre  " + auxiliarMayor + "\033[32m veces.");

        //MEDIA
        System.out.println("\033[32mSU MEDIA ES");
        double suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        double promedio = suma / num.length;
        System.out.println("\033[32m" + promedio);

        //MEDIANA
        System.out.println("\033[32mSU MEDIANA ES");

        double mediana;
        if (num.length % 2 == 0) {
            mediana = (num[num.length / 2 - 1] + num[num.length / 2]) / 2;
        } else {
            mediana = num[num.length / 2];
        }
        System.out.println("\033[32m" + mediana);

    }
}
