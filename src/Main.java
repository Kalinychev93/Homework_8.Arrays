public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 8.Arrays.");
//      Task 1
//        Part1
        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

//        Part 2
        double[] arr = {1.57, 7.654, 9.986};

//        Part 3
        int[] importantYears = new int[6];
        importantYears[0] = 1993;
        int myBorn = importantYears[0];
        importantYears[1] = 2000;
        int iWentToSchool = importantYears[1];
        importantYears[2] = 2010;
        int iWentToUniversity = importantYears[2];
        importantYears[3] = 2015;
        int iStartedWork = importantYears[3];
        importantYears[4] = 2020;
        int iMovedToMoscow = importantYears[4];
        importantYears[5] = 2022;
        int iStartedStudyingJava = importantYears[5];

        System.out.println("Task 2");
//      System.out.println(Arrays.toString(arrays)); - более простой вывод массива/не подходит, т.к. числа заключены в []
//      Вывод в консоль первого массива
        for (int a = 0; a < arrays.length; a++) {
            System.out.print(arrays[a]);
            if (a < (arrays.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
//      Вывод в консоль второго массива
        for (int b = 0; b < arr.length; b++) {
            System.out.print(arr[b]);
            if (b < (arr.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
//      Вывод в консоль третьего массива
        for (int i = 0; i < importantYears.length; i++) {
            System.out.print(importantYears[i]);
            if (i < (importantYears.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("Task 3");
//      Вывод в консоль первого массива в обратном порядке
        for (int a = arrays.length - 1; a >= 0; a--) {
            System.out.print(arrays[a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
//      Вывод в консоль второго массива в обратном порядке
        for (int a = arr.length - 1; a >= 0; a--) {
            System.out.print(arr[a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
//      Вывод в консоль третьего массива в обратном порядке
        for (int a = importantYears.length - 1; a >= 0; a--) {
            System.out.print(importantYears[a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("Task 4");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                arrays[i] += 1;
                System.out.println(arrays[i]);
            }
        }
    }
}