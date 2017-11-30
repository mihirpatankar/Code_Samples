class BinarySearch{
  public static int binarySearchRecursive(int A[],int left,int right,int search){
    if(right>=left){
      int center=left+(right-left)/2;
      if(A[center]==search){
        return center;
      }
      else if (A[center]<search){
        return binarySearchRecursive(A,center+1,right,search);
      }
      else{
        return binarySearchRecursive(A,left,center-1,search);
      }
    }
    return -1;
  }

  public static int binarySearchIterative(int A[],int left,int right,int search){
    while(right>=left){
      int center=left+(right-left)/2;
      if(A[center]==search){
        return center;
      }
      if (A[center]<search){
        left=center+1;
      }
      if(A[center]>search){
        right=center-1;
      }
    }
    return -1;
  }

  public static void main(String args[]){
    int A[] = {1,2,3,4,5,6,7,8,9};
    int search = 1;
    int resultR = binarySearchRecursive(A,0,A.length-1,search);
    int resultI = binarySearchIterative(A,0,A.length-1,search);
    System.out.println("Recusrive : " + search + " is present at location " + resultR);
    System.out.println("Iterative : " + search + " is present at location " + resultI);
  }
}
