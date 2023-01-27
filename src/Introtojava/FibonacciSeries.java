package Introtojava;



public class FibonacciSeries {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		    // Variables n1 and n2 will be used to switch values when looping
		    int n1 = 0, n2 = 1;
		    // With the for loop we are starting with an index of 0, declare how many interations, and increment the index by 1
		    for(int i = 0; i < 8; i++) {
		        if(i < 2) {
		            System.out.println(i);
		        }
		        // n3 is used to calulate the sum of n1 and n2 
		        int n3 = n1 + n2;
		        // Is used to print out n3
		        System.out.println(n3);
		        // n1 stores n2 as a new value in order to use it for the next interation of the fibonacci series
		        n1 = n2;
		        // n2 stores n3 as a new value in order to use it for the next interation of the fibonacci series
		        n2 = n3;
		    }
		}

		}


