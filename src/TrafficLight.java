import javax.swing.*;

public class TrafficLight {
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 700);
        frame.setTitle("Die Ampel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectangleComponent component = new RectangleComponent();
        frame.add(component);

        frame.setVisible(true);
    }


}
