public class Average {
    public double average(int[] input){
        double sum = 0;
        double average;

        //Sum all values in the Array
        for(int i=0; i < input.length; i++){
            sum += input[i];
        }

        //Calculate the average
        average = sum /input.length;

        //ADD ROUNDING

        return average;
    }
}
