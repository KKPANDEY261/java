import java.awt.*;

public class Awtintro {
   
    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");

        Label l = new Label("Enter Name:");
        l.setBounds(50, 50, 100, 30);

        TextField tf = new TextField();
        tf.setBounds(160, 50, 150, 30);

        Button b = new Button("Submit");
        b.setBounds(120, 100, 80, 30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(400, 200);
        f.setLayout(null);  // No layout manager
        f.setVisible(true);

       
    }
}


