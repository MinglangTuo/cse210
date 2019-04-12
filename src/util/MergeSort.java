/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Tyler.Tuo
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    
    public void merge(int arr[],int first,int middle,int end){
        //find sizes of two subarrays to be merged
        
        int n1 = middle - first + 1;
        int n2 = end - middle;
        
        //create temp arrays
        
        int L[] = new int [n1];
        int R[] = new int [n2];
        
        
        for(int i = 0; i <n1; ++i){
            L[i] = arr[first+i];
        }
        
        for(int j =0;j<n2;++j){
            R[j] = arr[middle+1+j];
        }
        
        //initial indexs of first and second subarrays
        int i =0;
        int j =0;
        
        //initial index of merged subarray array
        int k =first;
        while(i<n1 && j< n2){
            if ( L[i] <= R[j]){
                arr[k] = L[i];
                i++;
        }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        
        }
        
        
        while(i <n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
   }
    
    public void sort(int arr[],int first, int end){
        if(first<end){
            
            int middle = (first+end)/2;
            sort(arr,first,middle);
            sort(arr,middle+1,end);
            
            
            merge(arr,first,middle,end);
        }
    }
    
    
    public static void printArray(int arr[]){
        int n =arr.length;
       for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
    
    
   public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 


