class AllSorting{
  public static void SelectionSort(int arr[]){
    //Total : O(n^2)
    for(int i=0;i<arr.length;i++){//O(n)
      int minIndex=0;
      minIndex = findMin(arr,i);//O(n-i)
      swapElements(arr,i,minIndex);//O(1)
    }
  }

  public static void InsertionSort(int arr[]){
    //Total : O(n^2)
    for(int i=1;i<arr.length;i++){//O(n)
      findPlaceAndMove(arr,i);//O(i)
    }
  }

  public static void findPlaceAndMove(int arr[],int i){
    int temp=arr[i];
    System.out.println("temp : "+temp);
    int j;
    for(j=i-1;j>=0;j--){
      if(arr[j]>temp){
        arr[j+1]=arr[j];
      }
      else if(arr[j]<=temp){
        break;
      }
    }
    arr[j+1]=temp;

  }

  public static int findMin(int arr[], int start){
    int min=Integer.MAX_VALUE;
    int minIndex=0;
    for(int i=start;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
        minIndex=i;
      }
    }
    return minIndex;
  }

  public static void swapElements(int arr[], int pos1, int pos2){
    int temp = arr[pos1];
    arr[pos1]=arr[pos2];
    arr[pos2]=temp;
  }

  public static void printArray(int []arr){
    System.out.print("Array :  ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String args[]){
    int arr[] = {5,4,6,1,8,3,8};
    int copy[]= {4,6,8,2,0,1};
    System.out.println("Unsorted Array : ");
    printArray(arr);
    System.out.println("Sorted Array : ");
    SelectionSort(arr);
    printArray(arr);
    System.out.println("Unsorted Array : ");
    printArray(copy);
    InsertionSort(copy);
    System.out.println("Sorted Array : ");
    printArray(copy);
  }
}
