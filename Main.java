public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i < 10; i++)
            System.out.println(" Интерация цикла" + i);
        {
        }

        // ex2
        for (int a = 10; a > 0; a--)
            System.out.println(" Интерация цикла " + a);
        {
        }
        ///EX3
        for (int b = 0; b < 17; b++)
            System.out.println(" Интерация цикла c б " + b++);
        // ex 4
        {
        }
        for (int c = 10; c > -10; c--)
            System.out.println(" Интерация цикла " + c);
        // ex 5
        for(int year = 1904; year < 2096; year = year + 4) {
            System.out.println( " Високосные года " + year);

        }
        // ex 6
        for(int nomber = 7; nomber < 85; nomber = nomber + 7) {
            System.out.println( " Цифры " + nomber);

        }
        for (int bit = 1; bit < 513; bit = bit * 2) {
            System.out.println( " умножить " + bit);
        }
        int salary = 29000;
        int total = 0;
        for (int i = 0 ; i < 12; i++) {
            total = total + total/100 * 12;
            total = total + salary;
            System.out.println(" за год програмист получит" + i + " Итого " + total);
        }




    }
}