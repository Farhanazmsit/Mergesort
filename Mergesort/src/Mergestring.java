public class Mergestring{
	 void merge(char ch[], int l, int m, int r) 
	    { 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	        char L1[] = new char [n1]; 
	        char R1[] = new char [n2]; 
	  
	       
	        for (int i=0; i<n1; i++) 
	            L1[i] = ch[l + i]; 
	        for (int j=0; j<n2; j++) 
	            R1[j] = ch[m + 1+ j]; 
	  
	       
	        int i = 0, j = 0; 
	  
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L1[i] <= R1[j]) 
	            { 
	                ch[k] = L1[i]; 
	                i++; 
	            } 
	            else
	            { 
	                ch[k] = R1[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        while (i < n1) 
	        { 
	            ch[k] = L1[i];
	            i++; 
	            k++; 
	        } 
	  
	        while (j < n2) 
	        { 
	            ch[k] = R1[j]; 
	            System.out.println(ch[k]);
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    
	    void Sort(char ch[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	        
	            int m = (l+r)/2; 
	  
	      
	            Sort(ch, l, m); 
	            Sort(ch , m+1, r); 
	  
	       
	            merge(ch, l, m, r); 
	        } 
	    } 
	  
	  
	    static void printArray(char arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  
	   
	    public static void main(String args[]) 
	    { 
	        char arr[] = {'E','A','S','Y','Q','U','E','S','T','I','O','N'}; 
	  
	        System.out.println("Given Array"); 
	        printArray(arr); 
	  
	        Mergestring ob = new Mergestring(); 
	        ob.Sort(arr, 0, arr.length-1); 
	  
	        System.out.println("\nSorted array"); 
	        printArray(arr); 
	    } 

}

