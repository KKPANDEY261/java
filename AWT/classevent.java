
    import java.awt.*;
import java.awt.event.*;

// This class handles ActionEvent (Button Click)
public class classevent extends Frame implements ActionListener {

    Button b;

    classevent() {
        b = new Button("Click Me");
        b.setBounds(100, 100, 80, 30);

        b.addActionListener(this);  // Registering current class as listener

        add(b);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    // This method will handle the button click event
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    public static void main(String[] args) {
        new classevent();  // Creating object
    }
}


