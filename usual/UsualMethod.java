package usual;

import java.util.concurrent.TimeUnit;

// Usual Method
public class UsualMethod {

    public static void menu(String options[]) {
        int size = options.length, i;

        for (i = 0; i < size; i++) {
            System.out.println(" " + (i + 1) + ". " + options[i] + ".");
        }
        System.out.print("  Opcion: ");
    }

    // Una letra en mayuscula
    public static char letterUpperCase(int position) {
        if (position >= 0 && position <= 25) {
            char upperCase[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                    'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

            return upperCase[position];
        }
        return '?';
    }

    // Una letra en minuscula
    public static char letterLowerCase(int position) {
        if (position >= 0 && position <= 25) {
            char lowerCase[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                    'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

            return lowerCase[position];
        }
        return '?';
    }

    // Crear un contorno para un titulo
    public static void title(String title, int width) {

        int length, space, titleLength = title.length();

        if (titleLength > width) {
            length = titleLength + 4;
            space = (titleLength + 2 - (titleLength)) / 2;
            // Nota: cuando se ingresa en un entero una divicion se redondea

        } else {
            length = width + 2;
            space = (width - (titleLength)) / 2;
        }

        // columnas
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                // filas
                for (int j = 0; j < length; j++) {
                    if (j == 0 || j == (length - 1)) {
                        System.out.print("|");

                    } else if (j == (space + 1)) {
                        System.out.print(title);
                        j += (titleLength - 1);

                    } else {
                        System.out.print(" ");
                    }
                }

            } else {
                // filas
                for (int j = 0; j < length; j++) {
                    if (j == 0 || j == (length - 1)) {
                        System.out.print("+");

                    } else {
                        System.out.print("-");

                    }
                }
            }
            System.out.println();
        }
    }

    // Delay
    public static void delay(Integer count) {
        try {
            TimeUnit.MILLISECONDS.sleep(count);
        } catch (Exception e) {

        }
    }

    // Limpiar la consola
    public static void clean() {
        // Borrar consola con mensaje
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Pausar y Limpiar la consola
    public static void cleaner() {
        // Borrar consola con mensaje
        try {
            System.out.println();
            new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}