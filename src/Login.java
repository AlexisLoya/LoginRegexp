import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Login {

    public static boolean checkEmail(String email){
        String characters = "@utez.edu.mx$";
        Pattern pattern = Pattern.compile(characters);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static boolean checkPassword(String password){
        String characters = "[0-9]|[A-Z]";
        Pattern pattern = Pattern.compile(characters);
        Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.find());
        return matcher.find();
    }

    public static void main(String[] args) {
        String email="", password = "";
        boolean check= true;
        do{
            try{
                email = JOptionPane.showInputDialog("Ingrese tu correo institucional");
                password = JOptionPane.showInputDialog("Ingrese tu contraseña");
                if (checkEmail(email)){
                    JOptionPane.showMessageDialog(null, "Inicio correcto de sesión","Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Inténtalo nuevamente","Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocurrió un error\nIntentalo más tarde","Mensaje", JOptionPane.ERROR_MESSAGE);
                check=false;
            }
        }while (check!=false);

    }

}
