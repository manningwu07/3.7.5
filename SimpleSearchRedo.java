/*
 * Activity 3.7.5
 */
public class SimpleSearchRedo
{
  public static void main(String[] args)
  {
    int[] primeUnder50 = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    int numToSearchFor = 11;
    
    /* your code goes here */
    for(int i: primeUnder50){
      if (primeUnder50[i] == numToSearchFor)
      {
        System.out.print(numToSearchFor + " was found at index " + i);
      }
    }
    
    int j = 0;
    while(j < primeUnder50.length){
      if (primeUnder50[j] == numToSearchFor)
      {
        System.out.print(numToSearchFor + " was found at index " + j);
      }
      j++;
    }
    
  }
}