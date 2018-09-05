package sobreCargaBloquesEstaticos;

public class JavaTest08 {

	public static void main(String[] args) {
		prueba(6);
		//Metodos sum ambiguos, por ello aroja error de compilacion
		//sum(3,2);
		
		//Si se crea un construtor con parametro, java ya no crea el constructor por defeto
		//JavaTest08 test = new JavaTest08();
		JavaTest08 test = new JavaTest08(5);
	}
	
	static int sum(Integer a, int b){return a+b;}
	static long sum(long x, int y){return x+y+10;}
	static double sum(int n, double r){return n+r;}
	
	static public void prueba(int num1){
		System.out.println("int" + num1);
	}
	
	/*Falla sobrecarga de metodo por que tiene el mismo tipo de parametro
	static public void prueba(int num5){
		System.out.println("int" + num1);
	}*/
	
	static public void prueba(long num2){
		System.out.println("long " + num2);
	}
	
	static public void prueba(double num3){
		System.out.println("double " + num3);
	}
	
	JavaTest08(int test){
		System.out.println("JavaTest08: " + test);
	}
}
