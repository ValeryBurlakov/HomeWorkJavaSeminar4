import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class programm4 {
    public static void main(String[] args) throws IOException{
        ArrayList<String> listData = new ArrayList<>();

        System.out.println("Введите строку в формате text~num,");
        System.out.println("для выхода - exit, показать массив - array, меню - help: ");
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String text = sc.nextLine();
            try {
                if (text.equals("exit")) {
                    sc.close();
                    System.out.println("Всего доброго !");
                    break;
                }
                if (text.equals("array")) {
                    if (listData.size() == 0) {
                        System.out.println("Ваш массив пуст, милорд, нужно больше данных!");
                        System.out.printf("Введите команду: ");
                    }
                    else {
                        Integer count = 0;
                        Integer sizeArr = listData.size();
                        Integer sizeQuarter = sizeArr/4;
                        Integer sizeHalf = sizeArr/2;
                        for (String i : listData) {
                            if (i == "_") {
                                count =  count + 1;
                            }
                        }
                        if (sizeQuarter >= count) {
                            System.out.println(listData);
                            System.out.println(" - Люди любят вас, Милорд!");
                            System.out.printf("Введите команду: ");
                        }
                        else if (count >= sizeHalf) {
                            System.out.println(listData);
                            System.out.println(" - Массив пустеет, ваша Светлость!");
                            System.out.printf("Введите команду: ");
                        }
                        else {
                            System.out.println(listData);
                            System.out.println("Ваша популярность растёт!");
                            System.out.printf("Введите команду: ");  
                        }
                    }
                    continue;
                }
                if (text.equals("help")) {
                    System.out.println("text~num добавить элемент, array - показать массив, exit - выход");
                    System.out.printf("Введите команду: ");
                    continue;
                }
                Integer.parseInt(text.split("~")[1]);
                addPrintElement(text, listData);
            } catch (Exception e) {
                System.out.println("Ошибка, данные некорректны, повторите ввод!");
                System.out.println("Введите команду: ");

            }
        }
    }
    
    static void addPrintElement(String text, ArrayList<String> listData) {
        
        String[] consData = text.split("~");
            int num = Integer.parseInt(consData[1]);
            int localSize = num - listData.size();
            for (int i = 0; i <= localSize; i++) {
                listData.add("_");
            }
            if (consData[0].equals("print")) {
                System.out.println(listData.get(num));
            } 
            else {
                System.out.println("Массив пополняется, Сэр");
                listData.set(num, consData[0]);
                System.out.printf("Введите команду: ");
            }
   
    }
}

    // Реализовать консольное приложение, которое:
    // Принимает от пользователя строку вида text~num
    // 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию
    // num.
    // 2. Если введено print~num, выводит строку из позиции num в связном списке.
    // 3. Если введено exit, завершаем программу
