package Assignment3; 

import java.util.*;
import java.util.stream.*;

public class Assignment3 {
	
	    public static <T> Set<T>
	    duplicateNumbers(Stream<T> stream)
	    {
	        Set<T> numbers = new HashSet<>();
	        return stream.filter(n -> !numbers.add(n)).collect(Collectors.toSet());
	    }
	  
	    public static void main(String[] args)
	    {
	    	
	   // QUESTION 1 - Duplicate numbers in List
	    	
	        Stream<Integer> list = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
	        System.out.println("Duplicate numbers in List: " + duplicateNumbers(list));	 
	    
	   // QUESTION 2 -  List after Removing Duplicate Numbers
	        
	       Collection<Integer> list2 = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
	       List<Integer> removeDuplicateList = list2.stream().distinct().collect(Collectors.toList());
	       System.out.println("List after Removing Duplicate Numbers: " + removeDuplicateList);
	       
	   // QUESTION 3 -  Finding Max numbers 
	       
	        List<Integer> list3 = Arrays.asList(3,90,350,5);
	        System.out.print("The maximum Number is : ");
	        Integer max = list3.stream().max(Integer::compare).get();
	        System.out.println(max);
	        
	   // QUESTION 4 -  Finding Max and Minimum numbers   
	        
	       List<Integer> list4 = Arrays.asList(6, 8, 3, 5, 1, 9);
	       
           Integer MAX = list4.stream().max(Comparator.comparing(Integer::valueOf)).get();
           Integer MIN = list4.stream().min(Comparator.comparing(Integer::valueOf)).get();
           System.out.println("Maximum Number is : " + MAX);
           System.out.println("Minimum Number is : " + MIN);
           
       // QUESTION 5 -  It is already in Assignment 2   
           
	    }   
} 
