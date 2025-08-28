package streams;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mathutils {
  
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evenNumbers = numbers.stream()
				
				 .filter(mathutils::isEven)
    		 
    		 .collect(Collectors.toList());
    		 
     		 System.out.println("Even numbers " + evenNumbers);
    		 
    		 
	}

}
