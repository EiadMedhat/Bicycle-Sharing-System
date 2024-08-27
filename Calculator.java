import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// Define a class named calculator that implements the ActionListener interface
class calculator implements ActionListener {
    // Declare instance variables
    private JFrame f = new JFrame(); // JFrame to hold the calculator
    private JPanel p1 = new JPanel(); // Panel for buttons
    private JPanel p2 = new JPanel(); // Panel for text field and exit button
    private JButton one = new JButton("1"); // Button for digit 1
    private JButton two = new JButton("2"); // Button for digit 2
    private JButton three = new JButton("3"); // Button for digit 3
    private JButton plus = new JButton("+"); // Button for addition
    private JButton four = new JButton("4"); // Button for digit 4
    private JButton five = new JButton("5"); // Button for digit 5
    private JButton six = new JButton("6"); // Button for digit 6
    private JButton minus = new JButton("-"); // Button for subtraction
    private JButton seven = new JButton("7"); // Button for digit 7
    private JButton eight = new JButton("8"); // Button for digit 8
    private JButton nine = new JButton("9"); // Button for digit 9
    private JButton mul = new JButton("*"); // Button for multiplication
    private JButton zero = new JButton("0"); // Button for digit 0
    private JButton AC = new JButton("AC"); // Button to clear the text field
    private JButton equal = new JButton("="); // Button to calculate result
    private JButton div = new JButton("/"); // Button for division
    private JButton exit = new JButton("Exit"); // Button to exit the program
    private JTextField text = new JTextField(); // Text field to display input and result

    // Constructor for the calculator class
    public calculator() {
        // Set up the JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        f.setSize(400, 400); // Set size of the window
        f.setLocation(400, 400); // Set location of the window on the screen
        f.setVisible(true); // Make the window visible
        f.setTitle("calculator"); // Set title of the window

        // Set the layout for the panels
        p1.setLayout(new GridLayout(4, 4, 3, 3)); // Set grid layout for the button panel
        p2.setLayout(new BorderLayout()); // Set border layout for the text field and exit button panel

        // Disable focus for buttons
        // This prevents buttons from being focused when the user presses the Tab key
        one.setFocusable(false);
        two.setFocusable(false);
        three.setFocusable(false);
        plus.setFocusable(false);
        four.setFocusable(false);
        five.setFocusable(false);
        six.setFocusable(false);
        minus.setFocusable(false);
        seven.setFocusable(false);
        eight.setFocusable(false);
        nine.setFocusable(false);
        mul.setFocusable(false);
        zero.setFocusable(false);
        AC.setFocusable(false);
        equal.setFocusable(false);
        div.setFocusable(false);
        exit.setFocusable(false);

        // Set text field properties
        text.setBackground(Color.BLACK); // Set background color of the text field to black
        text.setSelectionColor(Color.WHITE); // Set selection background color of the text field to white
        text.setSelectedTextColor(Color.BLACK); // Set selection text color of the text field to black
        text.setForeground(Color.PINK); // Set text color of the text field to pink
        text.setEditable(false); // Make the text field non-editable

        // Set button colors
        exit.setBackground(Color.BLACK); // Set background color of the exit button to black
        exit.setForeground(Color.GREEN); // Set text color of the exit button to green

        // Add buttons to panel p1
        p1.add(one);
        p1.add(two);
        p1.add(three);
        p1.add(plus);
        p1.add(four);
        p1.add(five);
        p1.add(six);
        p1.add(minus);
        p1.add(seven);
        p1.add(eight);
        p1.add(nine);
        p1.add(mul);
        p1.add(zero);
        p1.add(AC);
        p1.add(equal);
        p1.add(div);

        // Add exit button to panel p2
        p2.add(exit, BorderLayout.EAST); // Add the exit button to the right side of the panel
        p2.add(text); // Add the text field to the panel

        // Add panels to the frame
        f.add(p1); // Add the button panel to the frame
        f.add(p2, BorderLayout.NORTH); // Add the text field and exit button panel to the top of the frame

        // Add action listeners to buttons
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        plus.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        minus.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        mul.addActionListener(this);
        zero.addActionListener(this);
        AC.addActionListener(this);
        equal.addActionListener(this);
        div.addActionListener(this);
        exit.addActionListener(this);
    }

    // Method to handle button click events
public void actionPerformed(ActionEvent e) {
    // Code to be executed when buttons are clicked
    // This method will handle the actions performed by each button
        String s;
        if(e.getSource() == one)
        {
            s = text.getText();
            text.setText(s+"1");
        }
        if(e.getSource() == two)
        {
            s = text.getText();
            text.setText(s+"2");
        }
        if(e.getSource() == three)
        {
            s = text.getText();
            text.setText(s+"3");
        }
        if(e.getSource() == plus)
        {
            s = text.getText();
            text.setText(s+"+");
        }
        if(e.getSource() == four)
        {
            s = text.getText();
            text.setText(s+"4");
        }
        if(e.getSource() == five)
        {
            s = text.getText();
            text.setText(s+"5");
        }
        if(e.getSource() == six)
        {
            s = text.getText();
            text.setText(s+"6");
        }
        if(e.getSource() == minus)
        {
            s = text.getText();
            text.setText(s+"-");
        }
        if(e.getSource() == seven)
        {
            s = text.getText();
            text.setText(s+"7");
        }
        if(e.getSource() == eight)
        {
            s = text.getText();
            text.setText(s+"8");
        }
        if(e.getSource() == nine)
        {
            s = text.getText();
            text.setText(s+"9");
        }
        if(e.getSource() == mul)
        {
            s = text.getText();
            text.setText(s+"*");
        }
        if(e.getSource() == zero)
        {
            s = text.getText();
            text.setText(s+"0");
        }
        if(e.getSource() == AC)
        {
            text.setText("");
            s = text.getText();
        }
        if(e.getSource() == equal)
        {
            String mo = "";
            String num;
            s = text.getText();
            int l = s.length();
            int x,y;
            x = y = 0;
            int i = 0;
            while(i < l)
            {
                num = String.valueOf(s.charAt(i));
                if(!num.equals("+") && !num.equals("-") && !num.equals("*") && !num.equals("/"))
                {
                    num = String.valueOf(s.charAt(i));
                    x *= 10;
                    x += Integer.parseInt(num);
                    i++;
                }
                else if(i == 0 && s.charAt(0) == '-')
                {
                    i++;
                    num = String.valueOf(s.charAt(i));
                    x *= 10;
                    x += Integer.parseInt(num);
                    x *=-1;
                    i++;
                }
                else
                {
                    mo = num;
                    i++;
                    num = String.valueOf(s.charAt(i));
                    while(!num.equals("+") && !num.equals("-") && !num.equals("*") && !num.equals("/"))
                    {
                        y *= 10;
                        y += Integer.parseInt(num);
                        i++;
                        if(i < l)
                            num = String.valueOf(s.charAt(i));
                        else
                            break;
                    }
                    switch (mo) 
                    {
                        case "+":
                            x += y;
                            y = 0;
                            break;
                        case "-":
                            x -= y;
                            y = 0;
                            break;
                        case "*":
                            x *= y;
                            y = 0;
                            break;
                        case "/":
                            x /= y;
                            y = 0;
                            break;
                    }
                }
            }
            text.setText(String.valueOf(x));
        }
        if(e.getSource() == div)
        {
            s = text.getText();
            text.setText(s+"/");
        }
        if(e.getSource() == exit)
        {
            System.exit(0);
        }
    }
}

// Main class
public class click {
    public static void main(String[] args) {
        // Create an instance of the calculator class
        calculator h = new calculator();
    }
}