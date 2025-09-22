import java.util.Arrays;

public class Median {
    double median;

    public double median(int[] input){

        //Arrays.sort(input); //Replace with sorting algorithm
        input = new SelectionSort().sort(input);

        if (input.length % 2 == 0) {

            int half_array = input.length / 2;



            int sum = input[half_array]+input[half_array - 1];
            double average = sum / 2;
            median = average;
        } else {

            double calculate_element = input.length / 2;
            int element_pos = (int) Math.floor(calculate_element);

            median = input[element_pos];
        }
        return median;
    }
}
