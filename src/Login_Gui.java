import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class Login_Gui

{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("WEATHER REPORT");
        JPanel panel = new JPanel(null);

        panel.setBackground(Color.CYAN);
    /// sdaksdhlkasdlkasjdkl
        JLabel state =  new JLabel("Enter State");
        JTextField stateField =  new JTextField(20);

        JLabel city =  new JLabel("Enter City");
        JTextField cityfield =  new JTextField(20);

        JButton button =  new JButton("SUBMIT");
        
        JLabel result = new JLabel("RESULT");
        JTextField resultfield = new JTextField(20);
        
        
        state.setBounds(20,20,80,25);
        stateField.setBounds(100,20,160,25);


        city.setBounds(20,50,80,25);
        cityfield.setBounds(100,50,160,25);



        result.setBounds(20,130,80,25);
        resultfield.setBounds(100,130,160,25);

        button.setBounds(120,100,100,25);

        panel.add(state);
        panel.add(stateField);
        panel.add(city);
        panel.add(cityfield);
        panel.add(result);
        panel.add(resultfield);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300,200);
        frame.setVisible(true);

    }
}
