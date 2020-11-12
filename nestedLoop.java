/*
 * Josh Bartlett
 * Purpose: To output a number pattern using a nested loop
 * May 4, 2019
 * Bellevue University
 * nestedLoop.java
 */

public class nestedLoop {
    public static void main(String[] args){
        
        // nested for loop displays 1 to 6 on first line 
        // then 1 to 5 on second line and so on
        System.out.println(("#2:"));
        for(int i = 6; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // nested for loops displays 1 on the first line with 
        // 11 spaces before then 1 and 2 where 2 is below the 
        // first line's 1 and so on
        System.out.println("#3:");
        for(int i = 1; i <= 6; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
