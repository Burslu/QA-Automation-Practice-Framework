package dataBaseJDBC;



import java.sql.*;


public class JSCBCreatUser {

    private final static String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";
    private final static String user = "techprodb_user";
    private final static String password = "Techpro_@126";


    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(url,user,password);

        Statement statement = con.createStatement();

        String query = "Insert into tp_customer (id,first_name,last_name,email,middle_initial,phone_number,address,ssn) Values(154824,'zeynep','bistur','birtur@gmail.com','A',054167995,'15Streetnorth','159-68-4444')";
        int x = statement.executeUpdate(query);
        System.out.println(x + " = satir guncellendi");
    }
}
