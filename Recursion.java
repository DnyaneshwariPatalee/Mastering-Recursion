public class Recursion {

    public static void printNumb1(int n1){
        if(n1==0){
            return;
        }
        System.out.print(n1+" ");
        printNumb1(n1-1);
        System.out.println();
    }

    public static void printNumb2(int n2){
        if(n2==6){
            return;
        }
        System.out.print(n2+" ");
        printNumb2(n2+1);
        System.out.println();
    }

    public static void sumOfnaturalno(int i,int n3,int sum){
        if(i==n3){
            sum+=i;
            System.out.println(sum);
            System.err.println();
            return;
        }
        sum+=i;
        sumOfnaturalno(i+1, n3, sum);
    }

    public static int calcFactorial(int n4){
        if(n4==1 || n4==0){
            return 1;
        }
        
        int fact_nm1 = calcFactorial(n4-1);
        int fact_n = n4 * fact_nm1;
        return fact_n;
    }

    public static void printFib(int a,int b,int n5){
        if(n5==0){
            return;
        }
        int c = a+b;
        System.out.print(c + " ");
        printFib(b, c, n5-1);
        System.out.println();
    } 

    public static int calcPower(int x , int n6){
        if(n6 ==0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        int xPownm1 = calcPower(x, n6-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static int calcPower1(int x , int n7){
        if(n7 ==0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        if(n7%2==0){
            return calcPower1(x, n7/2)*calcPower1(x, n7/2);
        }
        else{
            return calcPower1(x, n7/2)*calcPower1(x, n7/2)*x;
        }
    }
    public static void main(String[] args) {
        int n1 = 5;
        printNumb1(n1);
        int n2 = 1;
        printNumb2(n2);

        int sum=0;
        int n3=5;
        int i = 1;
        sumOfnaturalno(i,n3,sum);

        int n4 = 5;
        int ans = calcFactorial(n4);
        System.out.println(ans);
        System.err.println();

        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n5=7;
        printFib(a,b,n5-2);

        int x = 2, n6=5;
        int ans1 = calcPower(x,n6);
        System.out.println(ans1);

        int n7 = 5;
        int ans2 = calcPower1(x, n7);
        System.out.println(ans2);
    }
}
