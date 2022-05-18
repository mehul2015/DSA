// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
     
    n++;

   
    int powerOf2 = 2;

 
    int cnt = n / 2;

    
    while (powerOf2 <= n)
    {

      
        int totalPairs = n / powerOf2;

        cnt += (totalPairs / 2) * powerOf2;

       
        cnt += (totalPairs % 2 == 1) ? 
                      (n % powerOf2) : 0;

        
        powerOf2 <<= 1;
    }

   
    return cnt;
    }
}

// { Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}
  // } Driver Code Ends