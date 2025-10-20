import java.lang.reflect.Array;
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

    public double median_nosort(int[] input){

        int[] working_array = new int[input.length];


        for (int i=0; i<input.length; i++){


            int smallest_element = new SmallestElement().get_smallest_element(input);
            int biggest_element  = new GreatestElement().get_greatest_element(input);

            if (biggest_element != smallest_element) {
                working_array[i] = smallest_element;
                working_array[working_array.length - 1 - i] = biggest_element;

                input = new Cut().n_element(input, new GreatestElement().get_pos_greatest_element(input));
                input = new Cut().n_element(input, new SmallestElement().get_pos_smallest_element(input));
            }
            else {
                //WIP:
            }
        }

        input = working_array;

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
