class Solution{
  public List<Integer> spiralOrder(int[][] matrix){
    List<Integer> result = new ArrayList<Integer>();
    if(matrix.length==0){
      return result;
    }

    int rowBegin=0;
    int rowEnd=matrix.length-1;
    int colBegin=0;
    int colEnd=matrix[0].length-1;
    int dir=0;
    //0-->right
    //1-->down
    //2-->left
    //3-->up
    while(rowBegin<=rowEnd && colBegin<=colEnd){
      if(dir==0){
        for(int i=colBegin;i<=colEnd;i++){
          result.add(matrix[rowBegin][i])
        }
        rowBegin++;
        dir=1;
      }
      else if(dir==1){
        for(int i=rowBegin;i<=rowEnd;i++){
          result.add(matrix[i][colEnd]);
        }
        colEnd--;
        dir=2;
      }
      else if(dir==2){
        for(int i=colEnd;i>=colBegin;i--){
          result.add(matrix[rowEnd][i]);
        }
        rowEnd--;
        dir=3;
      }
      else if(dir==3){
        for(int i=rowEnd;i>=rowBegin;i--){
          result.add(matrix[i][colBegin]);
        }
        colBegin++;
        dir=0;
      }
    }
    return result;
  }
}
