import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class programm4 {

    public static void main(String[] args) throws IOException {
        ArrayList<String> resultList = new ArrayList<>();
        List<String> ourList = new ArrayList<>();
        userInput(ourList, resultList);
        // anserrr(ourList);
    }

    // ВВОД ДАННЫХ
    public static void userInput(List<String> ourList, ArrayList<String> resultList) {
        try{
            System.out.printf("Введите строку в формате text~num:");
            Scanner c1Scanner = new Scanner(System.in);
            String c1 = c1Scanner.next();
            splitInput(c1, ourList);
            System.out.printf("Хотите ввести ещё?(Yes/No): ");
            Scanner c2Scanner = new Scanner(System.in);
            Integer c2 = c2Scanner.nextInt();
            c1Scanner.close();
            c2Scanner.close();
            if (c2 == 2) {
                System.out.println("Ввод данных");
                userInput(ourList, resultList);
            }
            // splitInput(c1, ourList);
    
            } catch (Exception e) {
                System.out.println("Что вы там в консоль ввели ?");
                userInput(ourList, resultList);
            }
    }

    // Распарсили ввод на элементы
    public static void splitInput(String c1, List<String> ourList) {
        // ourList.add(c1);
        String[] split = c1.split("~");
        System.out.println(Arrays.toString(split));
        // System.out.println(ourList);
        indexElements(split, ourList);
    }

    // получаем эти элементы
    public static void indexElements(String[] split,  List<String> ourList) {
        String text = split[0];
        Integer num = Integer.parseInt(split[1]);
        // System.out.println(text);
        // System.out.println(num);
        // System.out.println(c2);
        while (ourList.size() <= num - 1) {
            ourList.add(null); // заполняем пустоты нулями, 

        }

        ourList.add(num, text); // на num-индекс ставим наши данные
        System.out.println(ourList);

    }
}



        
        /*
         * Реализовать консольное приложение, которое:
         *
         * 1. Принимает от пользователя строку вида text~num
         *
         * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
         * 2. Если введено print~num, выводит строку из позиции num в связном списке.
         * 3. Если введено exit, завершаем программу
         *
         * Пример:
         * string~4
         * num~3
         * print~3
         * > num
         * print~4
         * > string
         * my_value~1
         * print~1
         * > my_value
         *
         *
         */
//
    //    List<Integer> list = new ArrayList<>();
    //    while (list.size() <= 5) { // пока размер меньше
    //        list.add(null);
    //    }
    //    list.set(5, 5); // вставляет 5 в индекс 5
    //    System.out.println(list);

