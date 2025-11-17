import java.util.Arrays;

public class EineKlasse {
    private double[] array;
    private double median;

    public EineKlasse(double[] inhalt){
        this.array = inhalt;
        this.median =
    }

    public void setArray(int[] input){
        this.array = Arrays.stream(input).asDoubleStream().toArray();
    }
    public void printArray(){
        System.out.println(Arrays.toString(this.array));
    }
    public double getMedian(){
        return this.median;
    }
}
