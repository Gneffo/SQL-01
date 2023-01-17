import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class myJDBC {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "gneffgneff1M");

            Statement statement = connection.createStatement();

            try {
                statement.executeUpdate("create table students(" +
                        "student_id int(10) primary key auto_increment not null," +
                        "last_name varchar(30)," +
                        "first_name varchar(30))");

                System.out.println("Tabella students creata");
            }catch (Exception e){
                e.printStackTrace();
            }


            statement.executeUpdate("insert into students(last_name,first_name)values('Cioffo','Michele')");
            statement.executeUpdate("insert into students(last_name,first_name)values('Setaro','Marco')");
            statement.executeUpdate("insert into students(last_name,first_name)values('Pollina','Alessio')");
            statement.executeUpdate("insert into students(last_name,first_name)values('Di Capri','Peppino')");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
