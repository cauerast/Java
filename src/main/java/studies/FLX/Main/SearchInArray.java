package studies.FLX.Main;

public class SearchInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 7;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.printf("Number %d was found in index: %d", target, i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element is not found in the array!");
        }
    }
}
