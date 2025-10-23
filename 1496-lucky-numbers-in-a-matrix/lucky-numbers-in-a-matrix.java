import java.util.*;
class Solution{
    public List<Integer> luckyNumbers(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int[] rowMin=new int[m];
        int[] colMax=new int[n];
        for(int i=0;i<m;i++){
            int minVal=matrix[i][0];
            for(int j=1;j<n;j++){
                if(matrix[i][j]<minVal){
                    minVal=matrix[i][j];
                }
            }
            rowMin[i]=minVal;
        }
        for(int j=0;j<n;j++){
            int maxVal=matrix[0][j];
            for(int i=1;i<m;i++){
                if(matrix[i][j]>maxVal){
                    maxVal=matrix[i][j];
                }
            }
            colMax[j]=maxVal;
        }
        List<Integer> result=new ArrayList<>();
        for(int min:rowMin){
            for(int max:colMax){
                if(min==max){
                    result.add(min);
                }
            }
        }
        return result;
    }
}
