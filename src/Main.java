/**
 * Лабораторная работа №1.
 * @author Mike Chinarev
 * @version 1.0
 */
public class Main {
    /** точка входа в программу */
    /* Упражнение 1 */

    public static void main(String[] args) {
        /** Печать в консоль */
        System.out.println("hi");

        /* Упражнение 2 */

        byte v_byte = 120;
        short v_short = 129;
        int v_int = 65999;
        long v_long = 4294967296L; //Исправлено добавлением постфикса L
        float v_float = 0.33333334f; //Исправлено добавлением f
       double v_double = 0.3333333333333333;
        char v_char = 'a'; //Исправлено с а на 'а'
        boolean v_boolean = true; //Исправлено на boolean

        System.out.println("This is a byte:" + v_byte);
        System.out.println("This is a short:" + v_short);
        System.out.println("This is an int:" + v_int);
        System.out.println("This is a long:" + v_long);
        System.out.println("This is a float:" + v_float);
        System.out.println("This is a double:" + v_double);
        System.out.println("This is a char:" + v_char);
        System.out.println("This is a boolean:" + v_boolean);

        /* Упражнение 3 */
        char x = 97;
        boolean cycl = true;
        while (cycl) {
            System.out.print(x + " ");
            if (x == 122){
                cycl = false;
            }
            else x +=1;
        }
        System.out.println();
        long begin = new java.util.Date().getTime();
        long i = 0;
        for (i = 0; i < 100000000; i++) {
            i = i + 1;
        }
        long end = new java.util.Date().getTime();
        System.out.println(end-begin); //При изменении типа i с int на long время увеличивается (32 бита vs 64 бита)

        /* Упражнение 5-1 */
        int[] mas = {12,43,12,-65,778,123,32,76};
        int max = mas[0];
        for (int count = 0; count < mas.length; count++){
            if (mas[count]>max){
                max = mas[count];
            }
        }
        System.out.println("max = " + max);

        /* Упражнение 5-2 */
        x = 0;
        int y = 0;
        int[][] array = new int[3][3];
        System.out.println("Исходная матрица: ");
        for (x = 0; x < array.length; x++) {
            for (y = 0; y < array[x].length; y++) {
                array[x][y] = (int) Math.round(Math.random() * 10);
                System.out.print(array[x][y] + "\t");
            }
            System.out.println();
        }
        System.out.println("Транспонированная версия: ");
        for (x = 0; x < array.length; x++) {
            for (y = 0; y < array[x].length; y++) {
                System.out.print(array[y][x] + "\t");
            }
            System.out.println();
        }
    }
}
