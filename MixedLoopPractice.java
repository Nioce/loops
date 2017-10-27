/*
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 *
 *  1) oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}.
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}.
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}.
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}.
 *
 *  5) sumN            - uses a while loop to find the sum of the first n integers. YYYYYYYYYYEEEEEEEEEEEEEEEEEEEEEEEEEEe
 *
 *  6) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}. YYYYYYYYYYEEEEEEEEEEEEEEEEEEEEEEEEEEe
 *
 *  7) iLoveJava       - uses a while loop to print the sentence "I love java." n
 *                       times.
 *
 *  8) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 *  9) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 10) divBy5or7Sum    - uses a while loop to find the sum of all values in the
 *                   set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 11) bizzBuzz        - uses a while loop to count from 1 to n by ones. However,
 *                       if a number is divisible by 3, the word "bizz" should be 
 *               printed, and if the number is divisible by 5, "buzz" should
 *         j   be printed. Sample output:
 *
 *           1, 2, Bizz, 4, Buzz, Bizz, 7, 8, Bizz, Buzz, 11, Bizz, 13, 14, 
 *                       Bizz Buzz, 16, 17, Bizz, 19, Buzz, Bizz, 22, 23, Bizz, ...
 *
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  Depressed Andrew
 * @version 10/25
 */
 
 public class MixedLoopPractice
 {
    public static void oneToThirtyF()
    {
        for (int i=1; i<=30; i++) {
        System.out.print(i + " ");
    }
        
    }
    
    public static void oneToThirtyW()
    {
        int i = 0;
        while ( i<= 29)
        {
            i++;
            System.out.print(i + " ");
        }
    }
    
    public static void bartSimpson()
    {
        
    }
    // keep making methods here
    public static void twentyto0F()
    {
        for(int i=20; i>=0; i--){
            System.out.print(i + " ");
        }
    }
    
    public static void twentyto0W()
    {
        int i = 20;
        while ( i>= 0)
        {
            System.out.print(i + " ");
            i--;
            
        }
    }
    public static void countn(int b){
        int xd= 1;
        while(xd <=b){
            xd = xd + xd;
            System.out.print(xd + " ");
        }
    }
    public static void numberofhell(int a){
        int i = 0;
        while(i <= a){
            i++;
            System.out.print("Jjava makes me want to die " + i + " ");
        }
    }
    public static void countMtoN(int a, int b)
    {
        while(a<b||a>b){
            if(a>b){
                a--;
            }
            if(a<b){
                a++;
            }
            System.out.print(a + " : " + b + " ");
        }
    }
    public static void divBy2and9(){
        int b=100;
        for(int i=1; i<=b; i++){
            if((b%2)==0){
                b = b%2;
                System.out.println(b);
            }
        }
    }
    public static void main(String[] args)
    {
        oneToThirtyF();
        System.out.println();
        oneToThirtyW();
        System.out.println();
        twentyto0F();
        System.out.println();
        twentyto0W();
        System.out.println();
        countMtoN(20,25);
        System.out.println();
        countn(20);
        System.out.println();
        numberofhell(6);
        divBy2and9();
        // test your methods here
    }
 }