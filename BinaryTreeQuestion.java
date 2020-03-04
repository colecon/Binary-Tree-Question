//Cole Constantino | In a binary tree, find the smallest level number x such that sum of all nodes at level x is maximal
import java.util.*;

public class BinaryTreeQuestion{
  
  public int calculate(int[] a){
    int levels = 0;
    
    if(a.length == 1){
      return 1;
    }
    else if (a.length < 4){
      levels = 2;
      int[] arr = new int[4];
      for(int i=0;i<arr.length;i++){
        arr[i] = 0;
      }
      for(int j=0;j<a.length;j++){
        arr[j] = a[j];
      }
      int level1 = arr[0];
      int level2 = arr[1] + arr[2];
      Integer[] allLevels = {level1, level2};
      Arrays.sort(allLevels, Collections.reverseOrder());
      
      if(allLevels[0] == level1)
        levels = 1;
      else if(allLevels[0] == level2)
        levels = 2;
    }
    else if(a.length < 8){
      levels = 3;
      int[] arr = new int[8];
      for(int i=0;i<arr.length;i++)
        arr[i] = 0;
      for(int j=0;j<a.length;j++)
        arr[j] = a[j];
      
      int level1 = arr[0];
      int level2 = arr[1] + arr[2];
      int level3 = arr[3] + arr[4] + arr[5] + arr[6];
      Integer[] allLevels = {level1, level2, level3};
      Arrays.sort(allLevels, Collections.reverseOrder());
      
      if(allLevels[0] == level1)
        levels = 1;
      else if(allLevels[0] == level2)
        levels = 2;
      else if(allLevels[0] == level3)
        levels = 3;
    }
    else if(a.length < 16){
      levels = 4;
      int[] arr = new int[16];
      for(int i=0;i<arr.length;i++)
        arr[i] = 0;
      for(int j=0;j<a.length;j++)
        arr[j] = a[j];
      
      int level1 = arr[0];
      int level2 = arr[1] + arr[2];
      int level3 = arr[3] + arr[4] + arr[5] + arr[6];
      int level4 = arr[7] + arr[8] + arr[9] + arr[10] +arr[11] + arr[12] + arr[13] + arr[14];//problem
      Integer[] allLevels = {level1, level2, level3, level4};
      Arrays.sort(allLevels, Collections.reverseOrder());
      
      if(allLevels[0] == level1){
        levels = 1;
      }
      else if(allLevels[0] == level2)
        levels = 2;
      else if(allLevels[0] == level3)
        levels = 3;
      else if(allLevels[0] == level4)
        levels = 4;
    }
    return levels;
  }
  
  
  public static void main(String[] args){
    BinaryTreeQuestion tree = new BinaryTreeQuestion();
    int[] array = {-1,7,0, -7,8};
    System.out.println(tree.calculate(array));
  }
}