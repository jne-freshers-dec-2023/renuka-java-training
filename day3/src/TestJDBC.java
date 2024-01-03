


import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        try {
            //create a connection
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","root");
            Statement stmt=con.createStatement();


            //Insert query
//            String s=" INSERT INTO Employee (first_name, last_name, email, hire_date, salary) VALUES ('John', 'Doe', 'john.doe@example.com', '2023-01-01', 50000.00), ('Jane', 'Smith', 'jane.smith@example.com', '2023-02-15', 60000.50), ('Bob', 'Johnson', 'bob.johnson@example.com', '2023-03-20', 55000.75)";
            //execute insert  query

            String s="select last_name,email,salary from Employee";
           ResultSet rs= stmt.executeQuery(s);

           while (rs.next()){
            String lastName=rs.getString("last_name");
            String E_email=rs.getString("email");
            int sal=rs.getInt("salary");

               System.out.println(lastName+" "+ E_email+" "+sal);
           }

//            System.out.println(rs);






            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
*
*
* */