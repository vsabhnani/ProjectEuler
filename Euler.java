
public class Euler {

    public static void main(String[] args) {
        problem1();
        problem2();
    }
    
    public static void problem1(){ // Find the sum of all the multiples of 3 or 5 below 1000.
        int sum = 0;
        for(int i = 0; i < 1000; i ++)
        {
            if(i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
    public static void problem2(){ //By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. 
        int sum = 0;
	int f1 = 1;  
	int f2 = 2; 
        int next;
        while (f1 <= 4000000) {
            if (f1 % 2 == 0)
		sum += f1;
            next = f1 + f2;
            f1 = f2;
            f2 = next;
	}
        System.out.println(sum);  
    }
}
