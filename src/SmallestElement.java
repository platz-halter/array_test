public class SmallestElement {
    public int get_pos_smallest_element(int[] input){
        int smallest_num_pos = 0;
        int smallest_num = input[0];

        for(int i=0; i < input.length; i++){
            if(input[i] < smallest_num){
                smallest_num = input[i];
                smallest_num_pos = i;
            }
        }
        return smallest_num_pos;
    }
    public int get_smallest_element(int[] input){
        return input[get_pos_smallest_element(input)];
    }

}
