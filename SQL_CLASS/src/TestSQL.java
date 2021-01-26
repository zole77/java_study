import java.sql.*;

public class TestSQL {
    public static void main(String[] args){
        OpenSQL S1 = new OpenSQL();

        S1.update("INSERT INTO topic(title,description,created,author,profile) VALUES('IMWIN', 'this DB and JAVA ...', NOW(),'Beomsu','Mercedes')");
        S1.select("SELECT * FROM topic");
        try{
            while(S1.rs.next()){
                System.out.println(S1.rs.getString("id")+S1.rs.getString("title"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        S1.close();
    }
}
