/**
 *
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
//Задание 1
        byte b = 1;
        System.out.println(b);
        int i = 432;
        System.out.println(i);
        short s = 20564;
        System.out.println(s);
        long l = 5367124L;
        System.out.println(l);
        float f = (float) 6.445555;
        System.out.println(f);
        double d = 5.66662544;
        System.out.println(d);
//Задание 2
        float f1 = (float) 27.12;
        long l1 = 987678965549L;
        double d1 = 2.786;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b1 = 67;
//Задание 3
        byte L = 23;
        byte A = 27;
        byte E = 30;
        int ALL = L + A + E;
        System.out.println(ALL + " Всего учеников у троих преподователей");
        int paper = 480;
        System.out.println(paper + " Всего закуплено бумаги");
        int pupils = paper / ALL;
        System.out.println("На каждого ученика рассчитано " + pupils + " листов бумаги");
//Задание 4
        byte oneMinute = (byte) 16 / 2;
        System.out.println("За одну минуту машина произвела " + oneMinute + " штук бутылок");
        short twentyMinute = (short) (oneMinute * 20);
        System.out.println("За 20 минут машина произвела " + twentyMinute + " штук бутылок");
        int thirdDay = (int) (oneMinute * 4320);
        System.out.println("За три дня машина произвела " + thirdDay + " штук бутылок");
        long oneMonth = (long) (oneMinute * 44640);
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");
//Задание 5
        byte all = 120;
        byte allClasses = (byte) (all / 6);
        System.out.println("Всего " + allClasses + " классов в школе");
        byte brown = (byte) (allClasses * 4);
        byte white = (byte) (allClasses * 2);
        System.out.println("Коричневой краски было закуплено " + brown + ". Белой краски было закуплено " + white + ".");
        System.out.println("В школе, где " + allClasses + " классов, нужно " + brown + " банок коричневой краски и " + white + " банок белой краски.");
//Задание 6
        short banan = (short) (80 * 5);
        short milk = (short) (105 * 2);
        short iceCream = (short) (100 * 2);
        short eggs = (short) (70 * 4);
        int allGrams = (int) (banan + milk + iceCream + eggs);
        System.out.println(+allGrams + " граммов получается всего.");
        double allKilograms = (double) (allGrams / 1000.0);
        System.out.println(+allKilograms + " килограмм получается всего");
//Задание 7
        short grams = (short) (7 * 1000);
        short g1 = (short) (grams / 250);
        System.out.println(+g1 + " дней потребуется если спортсмен будет сбрасывать по 250 граммов");
        short g2 = (short) (grams / 500);
        System.out.println(+g2 + " дней потребуется если спортсмен будет сбрасывать по 250 граммов");
        byte allDays = (byte) (g1 + g2);
        byte average = (byte) (allDays / 2);
        System.out.println("В среднем потребуется " + average + " дней, чтобы добиться результата.");
//Задание 8
        int M = 67760;
        System.out.println(+M + " Маша получает в месяц");
        int D = 83690;
        System.out.println(+D + " Денис получает в месяц");
        int K = 76230;
        System.out.println(+K + " Кристина получает в месяц");
        double M1 = (double) (M * 0.1);
        double D1 = (double) (D * 0.1);
        double K1 = (double) (K * 0.1);
        System.out.println("10% от зарплаты Маши будет " + M1);
        System.out.println("10% от зарплаты Дениса будет " + D1);
        System.out.println("10% от зарплаты Кристины будет " + K1);
        double M2 = (double) (M + M1);
        double D2 = (double) (D + D1);
        double K2 = (double) (K + K1);
        System.out.println("Зарплата при повышение у Маши будет составлять " + M2);
        System.out.println("Зарплата при повышение у Дениса будет составлять " + D2);
        System.out.println("Зарплата при повышение у Кристины будет составлять " + K2);
//Зарплата за год
        double M3 = (double) (M * 12);
        double D3 = (double) (D * 12);
        double K3 = (double) (K * 12);
        System.out.println("Годовая зарплата у Маши будет - " + M3 + " у Дениса - " + D3 + " и у Кристины - " + K3);
//Повышенная годовая зарплата
        double M4 = (double) (M2 * 12);
        double D4 = (double) (D2 * 12);
        double K4 = (double) (D2 * 12);
        System.out.println("Повышенная годовая зарплата у Маши будет - " + M4 + " у Дениса - " + D4 + " и у Кристины - " + K4);
//Разница между повышенной и обычной зарплатой за год
        double M5 = (double) (M4 - M3);
        double D5 = (double) (D4 - D3);
        double K5 = (double) (K4 - K3);
        System.out.println("Маша теперь получает " + M2 + " рублей. Годовой доход вырос на " +M5);
        System.out.println("Денис теперь получает " + D2 + " рублей. Годовой доход вырос на " +D5);
        System.out.println("Кристина теперь получает " + K2 + " рублей. Годовой доход вырос на " +K5);

    }
}

















