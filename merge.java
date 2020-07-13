/*package whatever //do not write package name here */

import java.io.*;

public class mergesort {
	
	public void sort(int a[],int l,int r){
	    if(l<r){
	    int mid=(l+r)/2;
	    sort( a,l,mid);
	    sort( a,mid+1,r);
	    merge( a,l,mid,r);
	    
	}
	}
	
	
	public void merge(int a[],int l,int m,int r){
	    int n1=(m-l)+1;
	    int n2=r-m;
	    int left[]=new int[n1];
	    int right[]=new int[n2];
	    
	    for(int i=0;i<n1;i++){
	        left[i]=a[l+i];
	    }
	     for(int j=0;j<n2;j++){
	        right[j]=a[m+1+j];
	    }
	    int k=l;
	    int j=0;
	    int i=0;
	    while(i<n1 && j<n2 ){
	        if(left[i]<right[j]){
	            a[k]=left[i];
	            
	            k=k+1;
	            i=i+1;
	        }
	        else{
	            a[k]=right[j];
	            k=k+1;
	            j=j+1;
	        }
	    }
	     while (i < n1) { 
            a[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            a[k] = right[j]; 
            j++; 
            k++; 
        } 
	    
	}
	public static void printarray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    public static void main (String[] args) {
	   int a[]={2,4,1,6,8,5,3,7};
	   int l=a.length;
	   System.out.println("intial array is");
	   printarray(a);
	   mergesort ms=new mergesort();
	   ms.sort(a,0,l-1);
	   System.out.println("sorted array is");
	   printarray(a);
	}

}
