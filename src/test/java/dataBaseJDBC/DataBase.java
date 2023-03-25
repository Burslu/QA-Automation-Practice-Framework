package dataBaseJDBC;


import java.sql.*;

public class DataBase {
    public final static String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";
    protected final static String user = "techprodb_user";
     final static String password = "Techpro_@126";


    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        String query = "Select * From tp_country";//select query dql sql in java donusturulmus hali .
        ResultSet r1 = statement.executeQuery(query);

//        while(resultSet.next())
//        {
//            System.out.print(resultSet.getString("id")+ " ");
//            System.out.println(resultSet.getString("name"));
//        }

        while(r1.next()) {
            System.out.println(r1.getString(1) + " - " + r1.getString(2));
        }




//        1.Example: Insert 104 and Huavei into my_companies table
//		String q1 = "INSERT INTO tp_country VALUES(25000, 'ahmetferda')";
//		int r2 = statement.executeUpdate(q1);
//
//		System.out.println(r2 + " row inserted");

        String q2 = "Select * From tp_country" +
                " Where id = 25000";
        ResultSet r2 = statement.executeQuery(q2);

        while (r2.next()){
            System.out.println(r2.getString(1) + "        " + r2.getString(2));
        }
        r1.close();
        connection.close();
        statement.close();







    }
}
