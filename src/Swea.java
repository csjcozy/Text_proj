import java.util.Scanner;

public class Swea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] Ai = new int[a];
            int[] Bj = new int[b];
            int sum=Integer.MIN_VALUE;
            for(int i=0;i<a;i++)
            {
                Ai[i]=sc.nextInt();
            }
            for(int i=0;i<b;i++) {
                Bj[i] = sc.nextInt();
            }
            int plus = Math.max(a,b);
            int mius = Math.min(a,b);
            for(int i=0;i<=plus-mius;i++){
                int sum2=0;
                for(int j=0;j<mius;j++){
                    if(i+j<plus){
                        if(plus==a){
                            sum2+=Ai[i+j]*Bj[j];
                        }
                        else{
                            sum2+=Ai[j]*Bj[i+j];
                        }
                    }

                }
                sum=Math.max(sum,sum2);
            }
            System.out.println("#" + test_case+" "+sum);


        }
    }
}

