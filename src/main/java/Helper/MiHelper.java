package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MiHelper {
    public MiHelper() {
    }
    public static void cargarAlumnos(String nombre, String grupo) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into alumnos values (?, ?, ?)");
            pst.setString(1, "0");
            pst.setString(2, nombre);
            pst.setString(3, grupo);
            pst.executeUpdate();
            System.out.println("Usuario cargado a la base de datos.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void consultarAlumnos() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from alumnos" );
            ResultSet rs = pst.executeQuery();
            System.out.println("Consulta realizada.");
            mostrarResultado(rs);
            pst.executeQuery();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarResultado(ResultSet rs) {
        try {
            while (rs.next()) {
                System.out.println("Alumno: "+rs.getString(2) + "\nGrupo: " + rs.getString(3)+"\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
