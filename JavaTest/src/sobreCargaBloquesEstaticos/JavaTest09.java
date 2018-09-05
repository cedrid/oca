package sobreCargaBloquesEstaticos;

public class JavaTest09 {

	static int num1;

	
	public static void main(String[] args) {
		//Se ejecuta primero el Bloque estatico una unica ves 
		//y luego se ejeutaria por cada instancia el bloque de 
		//inicializacion para este caso dos veces se ejeutaria
		System.out.println("PRIMERA DECLARACION");
		JavaTest09 prueba1 = new JavaTest09();
		System.out.println("SEGUNDA DECLARACION");
		JavaTest09 prueba2 = new JavaTest09();
	}

	static{
		System.out.println("Esto es un bloque estatico " + num1++);
	}
	
	{
		System.out.println("Esto es un bloque de Inicializacion " + num1++  );
	}
}
