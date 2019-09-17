import javax.swing.*;

public class Main {

    public static void main(String[] args) {



        String name,ClassName,SnackAsString;
        int snack;


        name = JOptionPane.showInputDialog(null,"Please enter your Name: ");

        ClassName = JOptionPane.showInputDialog(null,"Please enter your class name: ");

        SnackAsString = JOptionPane.showInputDialog(null,"Please enter how many snacks you want: ");
        snack = Integer.parseInt(SnackAsString);


        JOptionPane.showMessageDialog(null,"Name: " + name + "\nClass: " + ClassName +"\nSnack: " + SnackAsString
                ,"Results",JOptionPane.INFORMATION_MESSAGE);
    }
}
