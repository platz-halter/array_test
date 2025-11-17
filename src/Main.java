import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array_1 = {0,0, 0, 0};
        EineKlasse[] klassen = new EineKlasse[9];
        double[] medians = new double[10];

        int n = 1;

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        for (int i=0; i<9; i++){
            klassen[i] = new EineKlasse(array_1);
            medians[i] = klassen[i].getMedian();
        }

        EineKlasse obj_medians = new EineKlasse();


        new MainUI(array_1, n);
    }
}

