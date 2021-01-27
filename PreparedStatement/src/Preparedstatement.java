import java.sql.*;

public class TestSQL {
    public static void main(String[] args){
        OpenSQL S1 = new OpenSQL();

        S1.update("aaa","bbb", "박범수",26);
        S1.select("SELECT * FROM member_info");
        try{
            while(S1.rs.next()){
                System.out.println(S1.rs.getString("id")+S1.rs.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        S1.close();
    }
}
