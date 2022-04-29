/*
https://www.onlinegdb.com/online_java_compiler

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int N = 658;
		int val100, val10;
		
		if( N >= 100 ){
		    val100 = N / 100;
		    val10 = (N % 100) / 10;
		    
		    System.out.println("К-во сотен   : "+val100);
		    System.out.println("К-во десятков: "+val10);
		}
		else{
		    System.out.println("Ошибка, число < 100!");
		}
	}
}