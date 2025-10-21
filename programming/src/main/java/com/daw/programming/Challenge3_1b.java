package com.daw.programming;
import javax.swing.*;
import java.util.Arrays;
/**
 *
 * @author Alumnado
 */
public class Challenge3_1b {
    public static void main(String[] args) {
        JPasswordField pf1 = new JPasswordField();
        int res1 = JOptionPane.showConfirmDialog(
                null,
                pf1,
                "Crea tu contrasena",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (res1 != JOptionPane.OK_OPTION) {
            return; 
        }
        char[] passwordUser = pf1.getPassword();

        JPasswordField pf2 = new JPasswordField();
        int res2 = JOptionPane.showConfirmDialog(
                null,
                pf2,
                "Inserte su contrasena para entrar",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );
        if (res2 != JOptionPane.OK_OPTION) {
            Arrays.fill(passwordUser, ' '); 
            return;
        }
        char[] passwordTry = pf2.getPassword();

        if (Arrays.equals(passwordUser, passwordTry)) {
            JOptionPane.showMessageDialog(null, "Correcto, esa es tu contrasena!");
        } else {
            JOptionPane.showMessageDialog(null, "Te has equivocado!");
        }

        Arrays.fill(passwordUser, '\0');
        passwordUser = null;
        Arrays.fill(passwordTry, '\0');
        passwordTry = null;
    }
}
