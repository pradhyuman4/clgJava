public class CWH_35_ps_on_methods {
    static void multipliction(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", n, i, n * i);

        }
    }
    static void pattern1(int n){
        for (int i = 0 ; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    static int sumrec(int n){
        if (n == 1){
            return 1;

        }
        return n + sumrec(n-1);
    }
    static void pattern2(int n){
        for (int i = n; i>=1; i--){
            for (int j = i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    static void pattern1_rec(int n){

        if(n>0){
            pattern1_rec(n-1);

            for (int i = 0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    static double degree(double n){
        return (n*9/5)+ 32;
    }


        public static void main (String[] args){
        // problem 1
            //multipliction(7);

            //problem 2
           // pattern1(10);

            //problem 3
//           int c = sumrec(4);
//            System.out.println(c);

            // problem 4
           // pattern2(4);

            // fibonacii series = 0, 1, 1, 2, 3, 5, 8, 8, 13, 21.....
          //  int result = fib(7);
            //System.out.println(result);

            //problem 8
           // pattern1_rec(5);

           // problem
            double d = degree(8.0);
            System.out.println(d);
        }

}
