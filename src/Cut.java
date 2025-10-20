public class Cut {
    public int[] last_element(int[] input){
        int[] new_array = new int[input.length-1];
        //int index_length = input.length -1;
        for(int i = 0; i< new_array.length;i++){
            new_array[i] = input[i];
        }
        return new_array;
    }
    public int[] first_element(int[] input){
        int[] new_array = new int[input.length-1];

        for (int i = 1; i<input.length; i++){
            new_array[i-1] = input[i];
        }
        return new_array;
    }
    public int[] n_element(int[] input, int n){
        int[] new_array = new int[input.length-1];
        int counter = 0;

        if (n > input.length){
            System.out.println("ERROR: N is greater than Array length");
        }

        for(int i=0; i<input.length; i++){
            if (i == n){
                counter -= 1;
            }
            else {
                new_array[counter] = input[i];
            }
            counter++;
        }




        return new_array;
    }
}
