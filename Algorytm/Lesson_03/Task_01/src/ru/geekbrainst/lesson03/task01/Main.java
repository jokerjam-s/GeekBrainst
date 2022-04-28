package ru.geekbrainst.lesson03.task01;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {2, 5, 13, 7, 6, 4};
        final int size = 6;
        int sum = 0;
        float avg = 0;
        int index = 0;

        while (index < size){
            sum += numbers[index];
            index++;
        }

        avg = sum/size;
        System.out.println("Начальный массив: ");
        System.out.println(numbers);
        System.out.println("среднее значение:");
        System.out.println(avg);
    }
}
