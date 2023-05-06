package arrays;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

/**
 * Arrays examples, sorting examples
 */
public class ArraysExample {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4};
        System.out.println(intArray.length);
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray[2]);

        System.out.println("-------------------");
        int[] intArrayDuplicate = Arrays.copyOf(intArray, intArray.length);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArrayDuplicate));
        System.out.println("-------------------");

        //Array copy
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        System.out.println(arraySource.length);
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.arraycopy(arraySource, 0, arrayDestination, 0, arraySource.length);
        System.out.println(Arrays.toString(arrayDestination));

        //Defaults
        System.out.println("-------------------");
        int[] array = new int[10];
        String[] strArr = new String[10];
        String[] strArrNullStr = new String[]{"nulljerfhl", "nullffefcef", "nullfec", "null", "null", "null", "null", "null", "null", "null"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArrNullStr));
        char[] arrayChars = new char[5];
        System.out.println(Arrays.toString(arrayChars));
        boolean[] arrayBooleans = new boolean[5];
        System.out.println(Arrays.toString(arrayBooleans));

        //for
        System.out.println("-------------------");
        System.out.println("Код перед циклом");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Код после цикла");

        //for in other for
        for (int d = 1; d < 5; d++) {
            System.out.println("Внешний цикл итерация " + d + ": ");
            for (int g = 0; g < 5; g++) {
                System.out.println("Внутренний цикл итерация " + g + ": ");
            }
        }

        //foreach
        System.out.println("---------------------------");
        String[] names = {"Tetiana", "Anna", "Iryna", "Oleh", "Pavlo", "Artem"};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------");

        //while
        int v = 0;
        while (v < 10) {
            System.out.println(v);
            v += 5;
        }

        //do while
        System.out.println("---------");
        int f = 0;
        int b = 2;

        do {
            System.out.println("Привет!");
            f++;
        } while (f < b);

        //break
        System.out.println("--------");
        for (int d = 1; d < 4; d++) {
            System.out.println("Внешний цикл итерация " + d + ": ");
            for (int g = 0; g < 100; g++) {
                if (g == 5) {
                    break;
                } // выходим из цикла, если g равно 5
                System.out.println("Внутренний цикл итерация " + g + ": ");
            }
        }
        System.out.println("Циклы завершены");

        //continue
        System.out.println("-------");
        for (int x = 1; x <= 7; x++) {
            System.out.println(x + ": перед continue");
            if (x > 2) {
                continue;
            }
            System.out.println("     " + x + ": после continue");
        }

//----------------------------------------------------------------------------------------------------------------------
        int[][] array2; //двумерный массив
        String[][][] array3; //трёхмерный массив
        double[][][][][] array5; // пятимерный массив

        int[][] twoDimArray = new int[3][4];

        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 7;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;

        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;

        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

        int[][] twoDimArrayAlter = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};

        int[][] twoDimArrayPrint = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};//объявили массив и заполнили его элементами
        int[][] twoDimArrayPrintSame = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}, {46, 5, 77, 1}};//объявили массив и заполнили его элементами


        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + twoDimArrayPrint[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        int[][] myArray = {{18, 28, 18}, {28, 45, 90}, {45, 3, 14}};
        System.out.println(Arrays.deepToString(myArray));

        int[][] twoDimArrayLength = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};

        System.out.println(twoDimArray.length); //3

        System.out.println(twoDimArray[0].length); //4


        //создаём трёхмерный массив, состоящий из двух двухмерных массивов
        int[][][] threeDimArr = new int[2][][];
        //создаём первый двумерный массив трёхмерного массива размерностью 5х2
        threeDimArr[0] = new int[5][2];
        //создаём второй двумерный массив трёхмерного массива размерностью 1х1
        threeDimArr[1] = new int[1][1];


        //задаем булев трёхмерный массив. На этой парковке есть 3 этажа,
        // на каждом из которых можно поместить 2х5 = 10 машин. По умолчанию все ячейки пусты (false)
        boolean[][][] parkingLot = new boolean[4][3][4];
        //Выведем массив в консоль
        for (int i = 0; i < 4; i++) {
            //-------------------------------
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + parkingLot[i][j][k] + "\t");
                }
                System.out.println();
            }
            //---------------------------------------------------
        }

        System.out.println("----------------------------------------------------");
        // машина припарковалась на 3 этаже в ячейке [1][0]
        parkingLot[3][1][0] = true;

        //Выведем массив в консоль
        for (int i = 0; i < 4; i++) {
            //-------------------------------
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + parkingLot[i][j][k] + "\t");
                }
                System.out.println();
            }
            //---------------------------------------------------
        }

        //--------------------------------------------------
        //Average
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Среднее арифметическое " + result / nums.length);

        //-----------------------------------------
        //Fibonacci
        //с помощью рекурсии (метод recursive) и цикла for (метод calculateWithFor):
        //Если запустить данную программу и посмотреть на время выполнения обоих алгоритмов, то можно увидеть, что рекурсивный вариант работает дольше.
        //Если изменить значение переменной n на 250, программа зависнет. Проблема состоит в том, что скорость вычисления рекурсивного алгоритма крайне низкая.
        int n = 45;
        LocalTime localTime1 = LocalTime.now();
        //System.out.print("Рекурсия " + recursive(n));

        LocalTime localTime2 = LocalTime.now();
        long duration1 = Duration.between(localTime1, localTime2).getSeconds();
        System.out.println(", время выполнения - " + duration1);

        LocalTime localTime3 = LocalTime.now();
        System.out.print("Цикл for " + calculateWithFor(n));

        LocalTime localTime4 = LocalTime.now();
        long duration2 = Duration.between(localTime3, localTime4).getSeconds();
        System.out.println(", время выполнения - " + duration2);

        //-------------------------------------
        //swap
        //1 Вводим временную переменную, которая на время придержит значение из одной переменной:
        int first = 3;
        int second = 5;

        int tmp = first;
        first = second;
        second = tmp;

        System.out.println("first = " + first);
        System.out.println("ab = " + second);

        //2Третья переменная не вводится, обмен достигается путем сложения и вычитания:
        int c = 3;
        int d = 5;

        c = c + d; // c = 8, d = 5
        d = c - d; // c = 8, d = 3
        c = c - d; // c = 5, d = 3

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //--------------------------------
        //reverse
        System.out.println("--------------------");
        int[] arrayForReverse = {1, 2, 3, 4, 5, 6};
        invert(arrayForReverse);
        System.out.print(Arrays.toString(arrayForReverse) + " => ");
        invert(arrayForReverse);
        System.out.println(Arrays.toString(arrayForReverse));
        System.out.println("-----------------------------");

        //-----------------------------------
        //bubble
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }

        //-------------------------
        //selection sort
        int[][] data1 = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data1) {
            System.out.print(Arrays.toString(arr) + " => ");
            sortSelection(arr);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("------------------------------------");
        int[] example = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};
        Arrays.sort(example);
        System.out.println(Arrays.toString(example));
        System.out.println("------------------------------------");


        int[] line = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int index = jumpSearch(line, 16);
        System.out.println("Jump search result: " + index);

        //interpolation search: pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low])
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 13;
        int interpolationSearchResult = interpolationSearch(arr, key);
        System.out.println(interpolationSearchResult); // Output: 3

        //exponential search
        int[] exponentialArr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int exponentialKey = 10;
        int exponentialResult = exponentialSearch(exponentialArr, exponentialKey);
        System.out.println(exponentialResult); // Output: 4
    }

    //Сложность О(n) Фибоначчи
    static long calculateWithFor(int n) {

        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;

    }


    //Сложность О(2^n) Фибоначчи
    static long recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 2) + recursive(n - 1);
    }

    //selection
    private static void sortSelection(int[] array) {
        //Внешний цикл for отвечает за номер прохода,
        // а внутренний - за поиск минимального значения в текущем проходе.
        // Обратите внимание, что во внутреннем цикле начинаем искать минимальный элемент не с самого начала,
        // а пропускаем уже найденные на предыдущем шаге элементы:
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }

    //bubble
    private static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    //reverse array
    private static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    //1. Линейный поиск
    //Самый простой, но и самый долгий алгоритм. Перебираем элементы массива и сравниваем с elementToSearch, который мы должны найти.
    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    //2. Двоичный поиск, итеративный подход
    //Для использования алгоритма, массив должен быть отсортирован.
    // Идея метода состоит в том, что мы делим массив пополам, берем "средний элемент" с индексом middleIndex,
    // и сравниваем с искомым.
    // Если они равны, мы заканчиваем поиск.
    // Если искомый элемент меньше "среднего элемента" мы отбрасываем правую часть массива, иначе - левую.
    // После чего повторяем эти операции снова и снова, пока искомый элемент не будет найден, или пока новый отрезок не станет пустым.
    // Если элемент не нашелся возвращаем значение -1.
    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    //3. Двоичный поиск, рекурсивный подход
    public static int recursiveBinarySearch(int[] array, int firstElementIndex, int lastElementIndex, int elementToSearch) {
        // условие прекращения
        if (lastElementIndex >= firstElementIndex) {
            int middle = (lastElementIndex + firstElementIndex) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middle] == elementToSearch) {
                return middle;
            }

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (array[middle] > elementToSearch) {
                return recursiveBinarySearch(array, firstElementIndex, middle - 1, elementToSearch);
            }

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(array, middle + 1, lastElementIndex, elementToSearch);
        }
        return -1;
    }

    //4. Поиск прыжками - Math.sqrt это квадратный корень
    public static int jumpSearch(int[] array, int elementToSearch) {
        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                return -1;
            }
        }
        while (array[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }

        if (array[previousStep] == elementToSearch) {
            return previousStep;
        }
        return -1;
    }

    //Интерполяционный поиск
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == key) {
                return pos;
            }

            if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }

    //Экспонеенциальный поиск
    public static int exponentialSearch(int[] arr, int key) {
        int n = arr.length;

        // If the key is the first element
        if (arr[0] == key) {
            return 0;
        }

        // Find the range for binary search
        int i = 1;
        while (i < n && arr[i] <= key) {
            i *= 2;
        }

        // Perform binary search in the identified range
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), key);
    }
}