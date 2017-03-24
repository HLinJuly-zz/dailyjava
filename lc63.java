public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
     
     int n=obstacleGrid.length;
     int m=obstacleGrid[0].length;
     int[][] path=new int[n][m];
     
     if(obstacleGrid[0][0]==1) return 0;
     
     for(int i=0;i<n && (obstacleGrid[i][0]!=1);i++){
         path[i][0]=1;
     }
     for(int i=0;i<m && obstacleGrid[0][i]!=1;i++)
         path[0][i]=1;
     for(int i=1;i<n;i++){
         for(int j=1;j<m;j++){
             if(obstacleGrid[i][j]==1) path[i][j]=0;
             else 
                 path[i][j]=path[i-1][j]+path[i][j-1];
         }
     }   
     return path[n-1][m-1];
    }
}