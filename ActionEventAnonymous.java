package lab1;
import javax.swing.*;
import java.awt.event.*;


public class ActionEventAnonymous {
    
    public void createUI(){
       JFrame frame = new JFrame("ACtion Event");
       JButton button = new JButton();
       button.setText("click");
       button.setBounds(50, 50, 100, 50);
       JLabel label = new JLabel("hello");
       label.setBounds(50, 120, 100, 50);
       frame.add(label);
       
       
       button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          label.setText("hi");  
        }
       }
       frame.add(button);
       
       frame.setSize(500, 500);
        frame.setLayout(null);
       frame.setVisible(true);
    }
    
}
