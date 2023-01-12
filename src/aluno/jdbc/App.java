package aluno.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        try {
            AlunoDAO dao = new AlunoDAO();
            Connection con = dao.getConnection();
            System.out.println("Conectou");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
