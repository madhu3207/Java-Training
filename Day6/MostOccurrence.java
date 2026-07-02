package Day6;

public class MostOccurrence {
    public static void main(String[] args) {//finding most occurrence of an element in an array
        int[] arr = {2,3,2,5,2,3,4};

        int maxCount=0;
        int element=0;

        for(int i=0;i<arr.length;i++){
            int count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
            }

            if(count>maxCount){
                maxCount=count;
                element=arr[i];
            }
        }

        System.out.println("Element = "+element);
        System.out.println("Frequency = "+maxCount);
    }
}