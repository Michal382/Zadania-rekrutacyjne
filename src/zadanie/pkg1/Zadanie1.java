package zadanie.pkg1;

     /* Napisz ciało metody createPicture(int n), która dla dowolnego n > 0 stworzy gotowy do wypisania w konsoli wzór.
     *
     * Przykłady:
     *
     * Dla n = 1 w konsoli powinien pojawić się wzór:
     * 1
     *
     * Dla n = 2 w konsoli powinien pojawić się wzór:
     * 2 2 2
     * 2 1 2
     * 2 2 2
     *
     * Dla n = 3 w konsoli powinien pojawić się wzór:
     * 3 3 3 3 3
     * 3 2 2 2 3
     * 3 2 1 2 3
     * 3 2 2 2 3
     * 3 3 3 3 3
     *
     * Dla n = 4 w konsoli powinien pojawić się wzór:
     * 4 4 4 4 4 4 4
     * 4 3 3 3 3 3 4
     * 4 3 2 2 2 3 4
     * 4 3 2 1 2 3 4
     * 4 3 2 2 2 3 4
     * 4 3 3 3 3 3 4
     * 4 4 4 4 4 4 4
     *
     */

public class Zadanie1 {
    
        public static String createPicture(int n) {
            
        if(n<1)
        {
            return "n nie może być mniejsze niż 1!";
        }

        int size = 2*n-1;                                                   //rozmiar określony tak, aby powstał kwadrat
        int start=0;                                                        //początek wiersza
        int end=size-1;                                                     //koniec wiersza
        int [][]a = new int[size][size];
        while(n!=0) {
            for (int i=start;i<=end;i++) {
                for (int j=start;j<=end;j++) {
                    if((i==start)||(j==start)||(i==end)||(j==end))          //jeżeli któryś z warunków zostanie spełniony, a[i][j] będzie równe aktualnej wartości n
                        a[i][j] = n;
                }
            }
    start++;                                                                //start +1
    end--;                                                                  //end -1
    n--;                                                                    //n -1
        }
    for (int i=0;i<size;i++) {                                              //wypisanie całej tablicy
        for (int j=0;j<size;j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    return "";
    }
        
    public static void main(String[] args) {
        System.out.println(createPicture(9));
    }  
}
