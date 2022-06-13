public class Main {
	
	
		static float harmonicMean(int arr[], int n)
	    {
	        float sum = 0;
	        for (int i = 0; i < n; i++)
	            sum = sum + (float)1 / arr[i];
	        return (float)n / sum;
	    }

	    public static void main(String args[])
	    {
	        int arr[] = { 21, 15, 26, 24, 36 };
	        int n = arr.length;
	        System.out.println(harmonicMean(arr, n));
	    
	
}
}
