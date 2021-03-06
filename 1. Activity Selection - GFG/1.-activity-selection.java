// { Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}

// } Driver Code Ends



class Activity implements Comparable<Activity>
    {
        int start,end;
        public Activity(int s,int e)
        {
            start=s;
            end=e;
        }
        public int compareTo(Activity a)
        {
            return (this.end - a.end);
        }
        
    }
class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
   
    public static int activitySelection(int start[], int end[], int n)
    {
        ArrayList<Activity> list=new ArrayList<Activity>();
        for(int i=0;i<n;i++)
        {
            list.add(new Activity(start[i],end[i]));
        }
        Collections.sort(list);
        int res = 1;
        Activity previous = list.get(0);
        for(int i=1;i<n;i++)
        {
            Activity current = list.get(i);
            if(current.start > previous.end)
            {
                res+=1;
                previous=current;
            }
        }
        return res;
    }
}