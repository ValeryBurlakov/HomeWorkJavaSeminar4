// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) throws IOException {
//         List<String> ourList = new ArrayList<>();
//         System.out.println(ourList + " Пустой список");
//         inputUser(ourList);
//     }
//     public static List<String> inputUser(List<String> ourList) {
//         System.out.printf("Введите строку в формате text~num: ");
//         Scanner inputScanner = new Scanner(System.in);
//         String c1 = inputScanner.next();
//         ourList.add(c1);
//         System.out.println(ourList);
//         System.out.printf("Хотите ввести ещё?(Yes/No): ");
//         Scanner answerScanner = new Scanner(System.in);
//         Integer c2 = answerScanner.nextInt();
//         // String answer = "y";
//         inputScanner.close();
//         answerScanner.close();
//         if (c2 == 2) {
//             System.out.println("Зашли в 2");
//             inputUser(ourList);
//             return ourList;
//         }
//         else {
//             System.out.println("не вышло");
//         }
//         return null;

//         // String[] split = c1.split("~");
//         // System.out.println(Arrays.toString(split));

//     }
// }


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {

    public static void main(String[] args) throws IOException {
        // ArrayList<String> resultList = new ArrayList<>();
        // userInput(resultList);



    }

    public static void userInput(ArrayList<String> resultList) {
        System.out.printf("Введите строку в формате text~num: ");
        Scanner inputScanner = new Scanner(System.in);
        String c1 = inputScanner.next();
        System.out.printf("Хотите ввести ещё?(Yes/No): ");
        Scanner answerScanner = new Scanner(System.in);
        String c2 = answerScanner.next();

        String answerYes = "y";
        String answerNo = "n";
        splitInput(c1, c2, answerYes, answerNo);
        if (c2 == "n") {
            inputScanner.close();
            answerScanner.close();
        }
        if (c2 == "y") {
            userInput(resultList);
            }
    }

    public static void splitInput(String c1, String c2, String answerYes, String answerNo) {
        String[] split = c1.split("~");
        System.out.println(Arrays.toString(split));

        indexElements(split, answerYes, answerNo, c2, c1);
    }

    public static void indexElements(String[] split, String answerYes, String answerNo, String c2, String c1) {
        // System.out.println(split[0]); // to String
        // System.out.println(split[1]); // to Int
        String text = split[0];
        Integer num = Integer.parseInt(split[1]);
        arrayCreation(num, text, answerNo, answerYes, c1, c2);
    }

    public static List<String> arrayCreation(int num, String text, String answerNo, String answerYes, String c1, String c2) {
       List<String> ourList = new ArrayList<>();
       System.out.println(c2);
       System.out.println(num);
    if (c2 == "n") {
            while (ourList.size() <= num - 1) {
                ourList.add(null);
                // resultList.add(null);
            }
            ourList.add(num, text);
            System.out.println("ANSWER NO");
        }   else  {
                if (c2 == "y")
            System.out.println("ANSWER YES");
        }
    //    ourList.set(num, text);
       System.out.println(ourList);
    //    resultList.set(num, text);
    //    System.out.println(resultList);
       return ourList;

    }

    // public static void answerInput(String c2) {
    //     if (c2 == "y") {
    //         userInput();
    //     }
    // }
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
//        List<Integer> list = new ArrayList<>();
//        while (list.size() <= 5) {
//            list.add(null);
//        }
//        list.set(5, 5);
//        System.out.println(list);