package exercise1;

import javax.swing.JFrame;

public class StudentInformation {

    public static void main(String[] args) {

        // object displaying frame
        StudentInformationFrame studentInformationFrame = new StudentInformationFrame();
        studentInformationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setting frame visibility
        studentInformationFrame.setVisible(true);
        // Setting frame size
        studentInformationFrame.setSize(900, 400);
        // Setting frame display = center
        studentInformationFrame.setLocationRelativeTo(null);

    }

}
