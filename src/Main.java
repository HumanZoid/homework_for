import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            task1();
            task2(scanner);
            task3(scanner);
        }
    }

    public static void task1() {
        int i = 0;
        while (i <= 9) {
            i++;
            System.out.printf("  " + i);
        }
        System.out.println("\n");
        for (int a = 10; a > 0; a--) {
            System.out.print("  " + a);
        }
        System.out.println("\n");
    }

    public static void task2(Scanner scanner) {
        System.out.println(" Введите дату первой пятницы месяца : ");
        int a = scanner.nextInt();
        System.out.println(" Введите количество дней месяца : ");
        int b = scanner.nextInt();
        for (int i = a; i < b; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчет.");
        }
    }

    public static void task3(Scanner scanner) {
        int period = 79;
        System.out.println(" Введите цифру контрольного года ");
        int presentYear = scanner.nextInt();
        System.out.println(" Введите нужный период появления кометы до " + presentYear + " года");
        int periodVisitaBefor = scanner.nextInt();
        System.out.println(" Введите нужный период появления кометы после " + presentYear + " года");
        int periodVisitaAfter = scanner.nextInt();
        int conrolPointYear = (presentYear / 79) * 79;
//        System.out.println(conrolPointYear);    // проверка цифры controlPointerYear
//        int b = periodVisitaBefor/100;
//        int a = periodVisitaAfter/100;
//        System.out.println(" значение после / 100 = "+ a + " значение до /100 = " + b); // проверка переменных
        for (int b = periodVisitaBefor / 100; b >= 0; b--) {
            int d = conrolPointYear - (79 * b);
            System.out.println(" Год появления кометы до " + presentYear + " является " + d);
        }
        for (int a = periodVisitaAfter / 100; a >0; a--) {
            int g = conrolPointYear + (79 * a);
            System.out.println(" Год появления кометы после " + presentYear + " является " + g);


        }

    }
}


