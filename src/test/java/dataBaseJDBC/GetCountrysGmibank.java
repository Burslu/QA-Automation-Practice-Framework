package dataBaseJDBC;



import java.sql.*;

public class GetCountrysGmibank {


    public final static String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";

    protected final static String user = "techprodb_user";

    final static String password = "Techpro_@126";
    public static void main(String[] args) throws SQLException {


        Connection con = DriverManager.getConnection(url,user,password);
        Statement st = con.createStatement();

        String query = "Select * From tp_country Where id = 173114";

        ResultSet resultSet = st.executeQuery(query);

        while (resultSet.next())
        {
            System.out.println(resultSet.getString(1) + "   " + resultSet.getString(2));
        }

    }
}
