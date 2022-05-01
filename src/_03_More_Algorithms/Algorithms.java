package _03_More_Algorithms;

import java.util.List;

import _01_Sorting_Algorithms.BubbleSorter;
import _01_Sorting_Algorithms.SortingVisualizer;

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
    		if(eggs.get(i).equals("cracked")) {
    			return i;
    		}
    	}
        return 0;
    }
    
   public static int countPearls(List<Boolean> oysters) {
	   int oysterCount = 0;
	   for(int i = 0;i<oysters.size();i++) {
		   if(oysters.get(i) == true) {
			   oysterCount = oysterCount +1;
		   }
	   }
	   return oysterCount;
   }
   
   public static Double findTallest(List<Double> peeps) {
	   Double tallestPeep = 0.0;
	   for(int i = 0;i<peeps.size();i++) {
		   if(peeps.get(i)>tallestPeep) {
			  tallestPeep = peeps.get(i);
		   }
	   }
	   return tallestPeep;
   }
   
   public static String findLongestWord(List<String> words) {
	   String longestWord = "hi";
	   for(int i = 0;i<words.size();i++) {
		   if(words.get(i).length() > longestWord.length()) {
			   longestWord = words.get(i);
		   }
	   }
	   return longestWord;
   }
   
   public static Boolean containsSOS(List<String> message1) {
	   for(int i = 0;i<message1.size();i++) {
		   if(message1.get(i).contains("... --- ...")) {
			   return true;
		   }					   						   								  		   	   
   }
    return false;
}
   
   public static List<Double> sortScores(List<Double> results) {
	   for(int i = 1;i<results.size();i++) {
		   for (int k = 0; k < results.size() - 1; k++) {
			   if(results.get(k)>results.get(k+1)) {
				   Double temp = results.get(k);
				   results.set(k, results.get(k+1));
				   results.set(k+1, temp);
			   }
		   }	    
	   }
	   return results;
   }
   
   public static List<String> sortDNA(List<String> unsortedSequences) {
	   for(int i = 1;i<unsortedSequences.size();i++) {
		   for (int k = 0; k < unsortedSequences.size() - 1; k++) {
			   if(unsortedSequences.get(k).length()>unsortedSequences.get(k+1).length()) {
				   String temp = unsortedSequences.get(k);
				   unsortedSequences.set(k, unsortedSequences.get(k+1));
				   unsortedSequences.set(k+1, temp);
			   }
		   }	    
	   }
	   return unsortedSequences;
   }
   
   public static List<String> sortWords(List<String> words) {
	   for(int i = 1;i<words.size();i++) {
		   for (int k = 0; k < words.size() - 1; k++) {
		int alphabetCheck = words.get(k).compareTo(words.get(k+1));
				if(alphabetCheck>0) {
					String temp = words.get(k);
					   words.set(k, words.get(k+1));
					   words.set(k+1, temp);	
				}		   		   
		   }
	   }
	   return words;
   }
   
   
}
