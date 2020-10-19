/**
 *
 * @author Alex
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;

public class Validaciones {

    static String dir, nombre, email_i, email_e, n_ctrl, cp, telf, telm, fecha, edad;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Validaciones.val_direccion(dir);
        Validaciones.val_cp(cp);
        Validaciones.val_edad(edad);
        Validaciones.val_numC(n_ctrl);
        Validaciones.val_fecha(fecha);
        Validaciones.val_telefonoF(telf);
        Validaciones.val_telefonoM(telm);
        Validaciones.val_email(email_i);
        Validaciones.val_email2(email_e);
        Validaciones.val_nombre(nombre);

    }

    public static boolean val_email(String email_i) {
        email_i = JOptionPane.showInputDialog("Ingrese su correo Institucional:", "Ejemplo: l171190025@milpaalta2.tecnm.mx");
        Pattern pattern = Pattern.compile("^[l]{1}([0-9]{9}+)@milpaalta2.tecnm.mx$");

        Matcher mather = pattern.matcher(email_i);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Correo valido");
            System.out.println("Email institucional: " + email_i + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Correo no valido!!! \nSigue el ejemplo", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Email institucional: " + email_i + " Valido: false");
        }
        return mather.find();
    }

    public static boolean val_nombre(String nombre) {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre y apellido:", "Ejemplo: Alejandro Pozos Rivera");
        Pattern pattern = Pattern.compile("^([A-Z]{1}[a-z]+[ ]?){1,3}$");

        Matcher mather = pattern.matcher(nombre);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Nombre valido");
            System.out.println("Nombre: " + nombre + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no valido!!! \nSigue el ejemplo", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Nombre: " + nombre + " Valido: false");
        }
        return false;
    }

    public static boolean val_direccion(String dir) {
        dir = JOptionPane.showInputDialog("Ingrese su dirección: \n Calle #, colonia, municipio, estado", "San Antonio 09, Tecomitl, Milpa Alta, CDMX");
        Pattern pattern = Pattern.compile("^([A-Z]{1}[a-z]+[ ]?){1,3}[a-z0-9]+{3}?[,][ ]([A-Z]{1}[a-z]+[ ]?){1,3}[,][ ]([A-Z]{1}[a-z]+[ ]?){1,3}[,][ ]([A-Za-z]+[ ]?){1,4}$");

        Matcher mather = pattern.matcher(dir);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Dirección valida");
            System.out.println("Dirección: " + dir + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Dirección no valida!! \nSigue el ejemplo", "Ok!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Dirección: " + dir + " Valido: false");
        }
        return false;
    }

    public static boolean val_cp(String cp) {
        cp = JOptionPane.showInputDialog("Ingrese su codigo postal:", "Ejemplo: 56623");
        Pattern pattern = Pattern.compile("^[0-9]+{5}$");

        Matcher mather = pattern.matcher(cp);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Codigo postal valido");
            System.out.println("Codigo postal: " + cp + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Codigo postal no valido!!! \n Deben de ser 5 digitos", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Codigo postal: " + cp + " Valido: false");
        }
        return false;
    }

    public static boolean val_telefonoF(String telf) {
        telf = JOptionPane.showInputDialog("Ingrese su numero telefonico fijo:", "Ejemplo: 5512345678");
        Pattern pattern = Pattern.compile("^[5]{2}[0-9]{8}$");

        Matcher mather = pattern.matcher(telf);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Telefono valido");
            System.out.println("Telefono: " + telf + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Telefono no valido!!! \n Deben iniciar con 55 y 8 dititos más", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Telefono: " + telf + " Valido: false");
        }
        return false;
    }

    public static boolean val_telefonoM(String telm) {
        telm = JOptionPane.showInputDialog("Ingrese su numero telefonico movil:", "Ejemplo: 525612345678");
        Pattern pattern = Pattern.compile("^[5][2][0-9]{10}$");

        Matcher mather = pattern.matcher(telm);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Telefono valido");
            System.out.println("Telefono: " + telm + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Telefono no valido!!! \n Deben iniciar con lada 52 y 10 dititos más", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Telefono: " + telm + " Valido: false");
        }
        return false;
    }

    public static boolean val_edad(String telm) {
        edad = JOptionPane.showInputDialog("Ingrese su Edad:", "Ejemplo: 24");
        Pattern pattern = Pattern.compile("^[0-9]{1,2}$");

        Matcher mather = pattern.matcher(edad);

        if (mather.find() == true) {
            int edad2 = Integer.parseInt(edad);
            if (edad2 > 0 && edad2 <= 99) {
                JOptionPane.showMessageDialog(null, "Edad valida");
                System.out.println("Edad: " + edad + " Valido: true");
            } else {
                JOptionPane.showMessageDialog(null, "Edad no valida!!! \n Debe ser mayor a 0 y menor a 100", "Error!!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Edad: " + telm + " Valido: false");
        }

        return false;
    }

    public static boolean val_numC(String n_ctrl) {
        n_ctrl = JOptionPane.showInputDialog("Ingrese su numero de control:", "Ejemplo: 171190025");
        Pattern pattern = Pattern.compile("^[0-9]{9}$");

        Matcher mather = pattern.matcher(n_ctrl);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Numero de control valido");
            System.out.println("Numero de control: " + n_ctrl + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Numero de control no valido!!! \n Deben ser 9 dititos", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Numero de control: " + n_ctrl + " Valido: false");
        }
        return false;
    }

    public static boolean val_fecha(String fecha) {
        fecha = JOptionPane.showInputDialog("Ingrese la feha: \nEjemplo: YYYY-MM-DD", "2020-10-19");
        Pattern pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

        Matcher mather = pattern.matcher(fecha);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Fecha valida");
            System.out.println("Fecha: " + fecha + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Fecha no valida!!! \n Sigue el ejemplo", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Fecha: " + fecha + " Valido: false");
        }
        return false;
    }

    public static boolean val_email2(String email_e) {
        email_e = JOptionPane.showInputDialog("Ingrese otro correo: ", "Ejemplo:ejemplo@ejemplo.com");
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.([a-zA-Z]{2,4})+$");

        Matcher mather = pattern.matcher(email_e);

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(null, "Correo valido");
            System.out.println("Correo: " + email_e + " Valido: true");
        } else {
            JOptionPane.showMessageDialog(null, "Correo no valido!!! \n Sigue el ejemplo", "Error!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Correo: " + email_e + " Valido: false");
        }
        return false;
    }

}
