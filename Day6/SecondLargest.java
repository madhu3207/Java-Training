package Day6;

public class SecondLargest {//finding second largest element in an array
    public static void main(String[] args) {

        int[] arr={10,40,25,50,30};

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }else if(num>second && num!=first){
                second=num;
            }
        }

        System.out.println("Second Largest = "+second);
    }
}
