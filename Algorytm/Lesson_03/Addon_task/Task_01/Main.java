/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*
Задача 1. Напишите программу, находящую второй по величине элемент массива.
[2, 8, 9, 1, 5] -> 8
[-2, -8, -9, -1, -5] -> -2
*/


public class Main
{
	public static void main(String[] args) {
		// объявление прерменных
		int[] m1 = {2, 8, 9, 1, 5};
		int[] maxPos = {0,0};
		boolean firstFinded = false;
		
		// ищем 1й максимальный
		for(int i=1; i<m1.length; i++){
		    if(m1[i] > m1[maxPos[0]]){
		        maxPos[0] = i;
		    }
		}
		
		// ищем 2й максимальный
		for(int i=1; i<m1.length; i++){
		    if(i != maxPos[0]){
		        if(m1[i] > m1[maxPos[1]]){
		            maxPos[1] = i;
		        }
		    }
		}
		
		System.out.println("Второй максимальный элемент: "+m1[maxPos[1]]);
	}
}
