package practice;
//Reverse words in a given string
	import java.util.*;
	import java.lang.*;
	import java.io.*;
	public class ReverseWordsInString {
	    public static void main(String[] args) {
    
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the number of letters for the string");
	        int t = sc.nextInt();
	        while (t > 0) {
	            String s = sc.next();
	            Solution obj = new Solution();
	            System.out.println(obj.reverseWords(s));
	            t--;
	        }
	    }
	}

	// } Driver Code Ends




	class Solution 
	{
	    //Function to reverse words in a given string.
	    String reverseWords(String S)
	    {
	    	String rev="";
			for(int i=S.length()-1;i>=0;i--)
			{
				
				if(S.charAt(i)!='.');
				{
					rev=rev+S.charAt(i);
				}
				if(S.charAt(i)=='.')
				{
				 
				 continue;
				}
				
			}
			return rev;
	    	

	    }
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
