import java.util.*;
import java.io.*;
class CountInversions{
  public static long inversions=0;

  public static void mergeSort(int[] arr,int left,int right){
    if(left<right){
      int center = left + (right-left)/2;
      mergeSort(arr,left,center);
      mergeSort(arr,center+1,right);
      merge(arr,left,center,right);
    }
  }

  public static void merge(int [] arr,int left, int center,int right){
    int l=center - left + 1;
    int r=right-center;
    int L_temp[] = new int[l];
    int R_temp[] = new int[r];

    for(int i=0;i<l;i++){
      L_temp[i]=arr[left+i];
    }
    for(int i=0;i<r;i++){
      R_temp[i]=arr[center+1+i];
    }
    int i=0,j=0,k=left;
    while(i<l && j<r){
      if(L_temp[i]<R_temp[j]){
        arr[k]=L_temp[i];
        i++;
      }
      else{
        arr[k]=R_temp[j];
        inversions+=(l-i);
        j++;
      }
      k++;
    }
    while(i<l){
      arr[k]=L_temp[i];
      i++;
      k++;
    }
    while(j<r){
      arr[k]=R_temp[j];
      j++;
      k++;
    }
  }

  public static void printArray(int []arr){
    System.out.print("Array :  ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String args[]){
    int A[]= new int[100000];
    int i=0;

    try{
      Scanner scanner = new Scanner(new File("IntegerArray.txt"));
      while(scanner.hasNextInt()){
        A[i++] = scanner.nextInt();
      }
    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }

    mergeSort(A,0,A.length-1);
    System.out.println("Inversions : " +inversions);
  }
}
