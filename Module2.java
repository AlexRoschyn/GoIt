import java.util.*;

public class Module2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // створюємо сканер для введення даних з консолі
        Random generator = new Random();     //створюємо генератор випадкових чисел
        System.out.println("Спробуйте відгадати число від 0 до 10");
        int gn;
        String more = "Y";

        while (more.equals("Y") || more.equals("y")) {  // поки змінна more рівна “Y” або “y”

            gn = generator.nextInt(10); // генерація випадкового числа від 0 до 10;
            System.out.print("Введіть число від 0 до 10: ");
            int number = in.nextInt();  // зчитуємо число з клавіатури

            if (gn == number)
                System.out.print("Вгадали!!!  Спробуєте ще раз? (Y/N)");
            else
                System.out.print("Не вгадали. Спробуєте ще раз? (Y/N)");

            more = in.next();    // отримати відповідь
        }
    }
}
