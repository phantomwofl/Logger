import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Random random = new Random();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int M = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        logger.log("Создаём и наполняем список");
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}
