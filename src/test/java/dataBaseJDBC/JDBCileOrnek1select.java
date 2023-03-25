package dataBaseJDBC;



import java.sql.*;

public class JDBCileOrnek1select {

    private final static String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";
    private final static String user = "techprodb_user";
    private final static String password = "Techpro_@126";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url,user,password);

        Statement statement = connection.createStatement();
        String query = "Select * From tp_customer Where id = 154824 ";

        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            resultSet.getString(1);
        }

    }

}
