import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PersonalInfoForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Personal information Form");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7,2,5,5));

        JLabel labeltitle = new JLabel("personal information",JLabel.CENTER);
        labeltitle.setFont(new Font("Arial",Font.BOLD,14));

        JLabel labelFirstname = new JLabel("First name");
        JTextField textFirstName = new JTextField();

        JLabel labelLastname = new JLabel("Last name");
        JTextField textLastName = new JTextField();

        JLabel labelAddress = new JLabel("Address");
        JTextField textAddress = new JTextField();

        JLabel labelMobile = new JLabel("Mobile No");
        JTextField textMobile = new JTextField();


        JLabel labelGender = new JLabel("Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup gendeGroup = new ButtonGroup();
        gendeGroup.add(male);
        gendeGroup.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);


        JLabel labelInterests = new JLabel("Your Interest");
        JCheckBox computer = new JCheckBox("computer");
        JCheckBox sports = new JCheckBox("sports");
        JCheckBox music = new JCheckBox("music");

        JPanel  interestpanel = new JPanel();
        interestpanel.add(computer);
        interestpanel.add(sports);
        interestpanel.add(music);

        JButton submit = new JButton("submit");
        JButton reset = new JButton("reset");

        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textFirstName.setText("");
                textLastName.setText("");
                textAddress.setText("");
                textMobile.setText("");
                gendeGroup.clearSelection();
                computer.setSelected(false);
                sports.setSelected(false);
                music.setSelected(false);
            }
        });

        frame.add(labeltitle);
        frame.add(labelFirstname);
        frame.add(labelLastname);
        frame.add(labelAddress);
        frame.add(labelMobile);
        frame.add(labelGender);
        frame.add(genderPanel);
        frame.add(labelInterests);
        frame.add(interestpanel);
        frame.add(submit);
        frame.add(reset);

        frame.setVisible(true);
    }
}
