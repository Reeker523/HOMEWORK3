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
        System.out.println("Значение переменной b с типом byte равно "+b);
        int i = 432;
        System.out.println("Значение переменной i с типом int равно "+i);
        short s = 20564;
        System.out.println("Значение переменной s с типом short равно "+s);
        long l = 5367124L;
        System.out.println("Значение переменной l с типом long равно "+l);
        float f = (float) 6.445555;
        System.out.println("Значение переменной f с типом float равно "+f);
        double d = 5.66662544;
        System.out.println("Значение переменной d с типом double равно "+d);
//Задание 2
        double meaning = 27.12;
        long meaning1 = 987678965549L;
        float meaning2 = 2.786F;
        short meaning3 = 569;
        short meaning4 = -159;
        int meaning5 = 27897;
        byte meaning6 = 67;
//Задание 3
        byte Ludmila = 23;
        byte Anna = 27;
        byte Ekaterina = 30;
        int allPupils = Ludmila + Anna + Ekaterina;
        System.out.println(allPupils + " Всего учеников у троих преподователей");
        int paper = 480;
        System.out.println(paper + " Всего закуплено бумаги");
        int pupils = paper / allPupils;
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
        short days = (short) (grams / 250);
        System.out.println(+days + " дней потребуется если спортсмен будет сбрасывать по 250 граммов");
        short days1 = (short) (grams / 500);
        System.out.println(+days1 + " дней потребуется если спортсмен будет сбрасывать по 250 граммов");
        byte allDays = (byte) (days + days1);
        byte average = (byte) (allDays / 2);
        System.out.println("В среднем потребуется " + average + " дней, чтобы добиться результата.");
//Задание 8
        int Masha = 67760;
        System.out.println(+Masha + " Маша получает в месяц");
        int Denis = 83690;
        System.out.println(+Denis + " Денис получает в месяц");
        int Kristina = 76230;
        System.out.println(+Kristina + " Кристина получает в месяц");
        double percentSalary = (double) (Masha * 0.1);
        double percentSalary0 = (double) (Denis * 0.1);
        double percentSalary1 = (double) (Kristina * 0.1);
        System.out.println("10% от зарплаты Маши будет " + percentSalary);
        System.out.println("10% от зарплаты Дениса будет " + percentSalary0);
        System.out.println("10% от зарплаты Кристины будет " + percentSalary1);
        double bonusSalaryMonth = (double) (Masha + percentSalary);
        double bonusSalaryMonth0 = (double) (Denis + percentSalary0);
        double bonusSalaryMonth1 = (double) (Kristina + percentSalary1);
        System.out.println("Зарплата при повышение у Маши будет составлять " + bonusSalaryMonth);
        System.out.println("Зарплата при повышение у Дениса будет составлять " + bonusSalaryMonth0);
        System.out.println("Зарплата при повышение у Кристины будет составлять " + bonusSalaryMonth1);
//Зарплата за год
        double salaryYearMasha = (double) (Masha * 12);
        double salaryYearDenis = (double) (Denis * 12);
        double SalaryYearKristina = (double) (Kristina * 12);
        System.out.println("Годовая зарплата у Маши будет - " + salaryYearMasha + " у Дениса - " + salaryYearDenis + " и у Кристины - " + SalaryYearKristina);
//Повышенная годовая зарплата
        double bonusSalaryYearMasha = (double) (bonusSalaryMonth * 12);
        double bonusSalaryYearDenis = (double) (bonusSalaryMonth0 * 12);
        double bonusSalaryYearKristina = (double) (bonusSalaryMonth1 * 12);
        System.out.println("Повышенная годовая зарплата у Маши будет - " + bonusSalaryYearMasha + " у Дениса - " + bonusSalaryYearDenis + " и у Кристины - " + bonusSalaryYearKristina);
//Разница между повышенной и обычной зарплатой за год
        double differenceYear = (double) (bonusSalaryYearMasha - salaryYearMasha);
        double differenceYear0 = (double) (bonusSalaryYearDenis - salaryYearDenis);
        double differenceYear1 = (double) (bonusSalaryYearKristina - SalaryYearKristina);
        System.out.println("Маша теперь получает " + bonusSalaryMonth + " рублей. Годовой доход вырос на " + differenceYear);
        System.out.println("Денис теперь получает " + bonusSalaryMonth0 + " рублей. Годовой доход вырос на " + differenceYear0);
        System.out.println("Кристина теперь получает " + bonusSalaryMonth1 + " рублей. Годовой доход вырос на " + differenceYear1);

    }
}

















