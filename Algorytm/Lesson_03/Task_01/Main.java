// https://www.onlinegdb.com/online_java_compiler

public class Main
{
	public static void main(String[] args) {
		int[] numbers = {2, 5, 13, 7, 6, 4};
        final double size = 6.0;
        int sum = 0;
        double avg = 0;
        int index = 0;

        while (index < size){
            sum += numbers[index];
            index++;
        }

        avg = sum/size;
        System.out.println("Начальный массив: ");
        for(int n : numbers)
        System.out.print(n+" ");
        System.out.println();
        System.out.println("среднее значение:");
        System.out.println(avg);
	}
}

