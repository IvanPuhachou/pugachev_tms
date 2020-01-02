package homework.hw_02.task_08;
/*
И ещё можете попрактиковаться и нарисовать оставшиеся 2 треугольника
            *
          * *
(1)     * * *
      * * * *

      * * * *
        * * *
 (2)      * *
            *
 */
public class Task_08 {
    public static void main(String[] zahar) {
        int sizeOfTriangle = 5; // при двухзначных числах  эта программа уже не работает, поскольку необходимо будет ставить по два пробела, чтобы треугольник не "поехал"
        for (int i = sizeOfTriangle; i > 0; i--) {
            for (int j = 1; j <= sizeOfTriangle; j++) { // не вижу смысла называть переменные типо "переменная строк первого массива"
                if (j < i) {
                    System.out.print(" ");
                }else  {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");// на примере два треугольника разбиты пустой строкой
        for (int i = 1; i <= sizeOfTriangle; i++) { // если необходимо напечатать треугольники отдельно, то с этой строки новая программа
            for (int j = 1; j <= sizeOfTriangle; j++) {
                if (j >= i) {
                    System.out.print("*");
                }else  {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
