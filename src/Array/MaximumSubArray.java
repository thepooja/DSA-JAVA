package Array;

public class MaximumSubArray {

    public static void main(String[] args) {

        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int currentSum = arr[0];
        int max = currentSum;
        for (int i = 1; i < arr.length ; i++) {
            if(currentSum >=0){
                currentSum += arr[i];
            } else{
                currentSum = arr[i];
            }

            if(currentSum > max){
                max = currentSum;
            }
        }



        System.out.println("Maximum sub Array is "+max);
    }

}
