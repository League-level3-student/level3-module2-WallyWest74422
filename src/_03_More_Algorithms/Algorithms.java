package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int product = num1 * num2;
        return ""+num1+ " x " +num2+ " = " +product+"";
    }
    
    public static boolean isPrime(int num1) {
 for(int i =1;i<1000;i+=2) {
	 for(int j = 3;j<1000;j+=2) {
		 if(num1 ==i) {
			 if(num1!=j) {
				 if(num1%j ==0){
					 return false;
				 }else {
					 if(j==999) {
						 return true;
					 }
				 }
			 }
		 }
	 }
}
    	
return false;
    }
    
    public static boolean isSquare(int num1) {
    	if(num1 ==1) {
    		return true;
    	}
    	for(int i = 1;i<num1;i++) {
    		if(num1/i ==i) {
    			return true;
    		}
    	}
    	return false;
    }
    
    
    public static boolean isCube(double num1) { 
    	if(num1 == 1) {
    		return true;
    	}
    	for(double i = 1;i<num1;i++) {
    		System.out.println(i);
        	double divide1 = num1/i; 
        	if(divide1/i==i){
    			return true;
    		} 
    	}
		return false;
    }
    
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0;i<eggs.size();i++) {
    		
    	}
        return 0;
    }
}
