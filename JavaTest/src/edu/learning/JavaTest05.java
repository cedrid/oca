package edu.learning;

import java.util.Arrays;


public class JavaTest05 {

	static int i;
	public static void main(String[] args) {
		
		 int[] ino1 = {1,2,3,4,5};
		 int ino2[] = new int[5];
		 int x[] = {0,1,2};
		 int o= ino2[4];
		 for (int i : ino2) {
			System.out.println(i);
		}
		 
		 int[][] alex1 = new int[5][];
		 int[] alex2[] = new int[5][6];
		 int alex3[][] = new int[5][7];
		 
		 int i2=5;
		 long a1= i2;
		 
		 int array[] = new int[]{10,12,11};
		 System.out.println(array[i++]);
		 
		 char pepin = 66;
		 
		 int array1[] = {2,5,9,5,0,3};
		 Arrays.sort(array1,2,6);
		 for(int a:array1){
			 
			 System.out.println(a);
		 }
		 System.out.println(Arrays.toString(array1));
		 System.out.println(array1[2] + array1[5]);
		 
		 String[] valores = new String[2];
		 valores[0] = "certificacion";
		 valores[1] = "Java";
		 Object[] vals = (Object[]) valores;
		 vals[1] = "daniela";
		 System.out.println("Respuesta: " + vals[1].equals(valores[1]));
	

	}

}
