import java.util.Arrays;
public class Reverse {
    public int length(int[] numbers){
        int count = 0;
        for (int num : numbers) {
            count++;
        }
        return count;
    }
    public int[] reversed(int count, int[] numbers){
        for(int i=0;i<count/2;i++){
                int j = numbers[i];
                numbers[i] = numbers[count - i - 1];
                numbers[count - i - 1] = j;
            }
            return numbers;
    }

public static void main(String[] args){
        int[] numbers = {0,1,2,3,4};
        Reverse rv = new Reverse();
        int count = rv.length(numbers);
        int[] reversed = rv.reversed(count, numbers);
        System.out.println(Arrays.toString(reversed));
    }
}
