public class irinapetrovajava {

    public static void main(String[] args) {

        //    1. Составить алгоритм: если введенное число больше 7, то вывести "Привет!"

        System.out.println("Задание 1");
        isPositive1(8);
        System.out.println("***");

//        2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести "Привет, Вячеслав!".
//    Если нет, то вывести "Нет такого имени".


        System.out.println("Задание 2");
        String name = "qwerty";
        switch (name) {
            case "Вячеслав":
                System.out.println("Привет, Вячеслав!");
                break;
            default:
                System.out.println("Нет такого имени");
                break;
        }

//              3. Составить алгоритм: на входе есть числовой массив.
//              Необходимо вывести элементы массива кратные 3.

//        **** Задавать массивы научилась. А вот читать пока нет.

        int [] array = new int[10];
        array[0] = 1;
        array[1] = 3;
        array[2] = 6;
        array[3] = 9;
        array[4] = 10;
        array[5] = 11;
        array[6] = 12;
        array[7] = 15;
        array[8] = 16;
        array[9] = 21;

//        4. Дана скобочная последовательность: [((())()(())]]
//        - Можно ли считать эту последовательность правильной?
//        - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

//        Ответ: Последовательность скобок кажется неверной.
//        Нужно привести в соответствие количество закрывающих и открывающих скобок.
    }

    public static void isPositive1(int variable) {
        if (variable > 7) {
            System.out.println("Привет!");
        } else {
            System.out.println("-");
        }
    }
}
