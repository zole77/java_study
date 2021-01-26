import java.sql.*;

public class TestMySQL {
    public static void main(String[] args){

        Connection conn;
        System.out.print("User Table 접속 : ");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class 클래스의 forName()함수를 이용해서 해당 클래스를 메모리로 로드 하는 것입니다.
            // URL, ID, password를 입력하여 데이터베이스에 접속합니다.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/opentutorials","root","135156");
            // 접속결과를 출력합니다.
            if (conn != null){System.out.println("성공");} else{System.out.println("실패");}

            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs;

            PreparedStatement ps = null;
            ps = conn.prepareStatement("SELECT * FROM topic", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            for(int n = 1; n <= 2; n++){
                rs = ps.executeQuery();
                while(rs.next()){
                    System.out.println(
                            rs.getString("id") +
                            rs.getString("title")
                    +       rs. getString("description"));
                } // while
                rs.beforeFirst();
                System.out.println("---------------------");
            }// for

            conn.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
