/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Favian Azwadt R
 */
public class NewClass {
  int[] A = {2,4,5,1,6,7,9,3};
  int max;

  public void solution() {
    max = findMax(0, A.length-1);
    //print max
  }

  private int findMax(int a, int b){    
    if(b-a == 1){
        return A[a]>A[b] ? A[a] : A[b];
    }
    else if(a==b){
        return A[a];
    }

    return Math.max(findMax(a, (a+b)/2), findMax((a+b)/2 + 1, b));
  }
}
