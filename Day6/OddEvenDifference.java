package Day6;

public class OddEvenDifference {//finding difference between sum of odd and even elements in an array
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int odd=0,even=0;

        for(int num:arr){
            if(num%2==0)
                even+=num;
            else
                odd+=num;
        }

        System.out.println("Difference = "+(odd-even));
    }
}
