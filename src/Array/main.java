package Array;

public class main {

	public static void main(String[] args) {
		int array [] = new int [20];
		for (int i=0; i<array.length; i++){
			array[i] = ((int)(Math.random()*20));
			 System.out.println(array[i]);
		
		}
		int summ=0;
			for (int i = 0; i < array.length; ++i)  {
            	if (array[i]<20) summ = summ + array[i];
            	System.out.print(summ +" ");
            }
}

}
