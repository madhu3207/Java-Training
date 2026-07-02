package Day6;

public class MissingNumber {//finding missing number in an array
    public static void main(String[] args) {

        int[] arr={1,2,3,5};

        int n=5;
        int sum=n*(n+1)/2;

        int arraySum=0;

        for(int num:arr)
            arraySum+=num;

        System.out.println("Missing Number = "+(sum-arraySum));
    }
}
