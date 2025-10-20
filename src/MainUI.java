import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MainUI extends JFrame{
    private JPanel MainPanel;
    private JButton execButton;

    public MainUI(int[] array_1, int n){
        setContentPane(MainPanel);
        setTitle("");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(true);
        setSize(450, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        execButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Input array: "+ Arrays.toString(array_1));

                System.out.println("First element: " + new FirstElement().first_element(array_1));
                System.out.println("Last element: " + new LastElement().last_element(array_1));
                System.out.println("Average:" + new Average().average(array_1));

                System.out.println("Position greatest element: " + new GreatestElement().get_pos_greatest_element(array_1));
                System.out.println("Greatest element: " + new GreatestElement().get_greatest_element(array_1));

                System.out.println("Position smallest element: " + new SmallestElement().get_pos_smallest_element(array_1));
                System.out.println("Smallest element: " + new SmallestElement().get_smallest_element(array_1));

                System.out.println("Array without last element:" + Arrays.toString(new Cut().last_element(array_1)));
                System.out.println("Array without first element:" + Arrays.toString(new Cut().first_element(array_1)));
                System.out.println("Array without element on position " + n + ": " +  Arrays.toString(new Cut().n_element(array_1, n)));

                //System.out.println(Arrays.toString(new Cut().n_element(array_1, 1)));
                System.out.println("Median: "+new Median().median(array_1));

                System.out.println("Median without sorting algorithm: " + new Median().median_nosort(array_1));
            }
        });
    }
}

