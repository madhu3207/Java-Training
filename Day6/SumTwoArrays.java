package Day6;

public class SumTwoArrays {//finding sum of two arrays
    public static void main(String[] args) {

        int[] a={1,2,3};
        int[] b={4,5,6};

        int[] sum=new int[a.length];

        for(int i=0;i<a.length;i++){
            sum[i]=a[i]+b[i];
        }

        for(int x:sum)
            System.out.print(x+" ");
    }
}
