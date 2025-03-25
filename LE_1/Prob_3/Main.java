/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	   // When methods are non static
	   // Mother m1 = new Child();
	   // m1.show();
	   // Running Fine output : Hello JUET
	   
	   // When Mother class method is static only
	   // Mother m1 = new Child();
	   // m1.show();
	   // error: show() in Child cannot override show() in Mother
	   	   
	   // When Child class method is static only
	   // Mother m1 = new Child();
	   // m1.show();
	   // error: show() in Child cannot override show() in Mother
	    
	   // When Child & MOther class method are static 
	   // Mother m1 = new Child();
	   // m1.show();
	   // Running Fine output : Hello World
	}
}
