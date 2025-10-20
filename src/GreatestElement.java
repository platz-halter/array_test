public class GreatestElement {
    public int get_pos_greatest_element(int[] input){
        int biggest_num_pos = 0;
        int biggest_num = input[0];

        for(int i=1; i < input.length; i++){
            if(input[i] > biggest_num){
                biggest_num = input[i];
                biggest_num_pos = i;
            }
        }
        return biggest_num_pos;
    }
    public int get_greatest_element(int[] input){
        return input[get_pos_greatest_element(input)];
    }
}
