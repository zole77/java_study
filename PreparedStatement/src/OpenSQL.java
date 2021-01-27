import java.sql.*;

public class OpenSQL {
    Connection conn = null;
    PreparedStatement pstmt = null;

    String sql = "INSERT INTO member_info(id, password, name, age)" + "VALUES(?,?,?,?)";
    java.sql.Statement stmt;
    java.sql.ResultSet rs;
    PreparedStatement ps = null;

    OpenSQL(){
        connect();
    }

    void connect() {
        String dbinfo = "jdbc:mysql://localhost:3307/Member";
        String dbid = "root";
        String dbps = "135156";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = java.sql.DriverManager.getConnection(dbinfo, dbid, dbps);
            this.pstmt = this.conn.prepareStatement(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    void update(String id, String password, String name, int age){
        try{
            this.pstmt.setString(1, id);
            this.pstmt.setString(2, password);
            this.pstmt.setString(3, name);
            this.pstmt.setInt(4, age);

            int count = this.pstmt.executeUpdate();
            if(count > 0){
                System.out.println("성공");
            }else{
                System.out.println("실패");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void select(String dbSelect){
        try{
            ps = conn.prepareStatement(dbSelect, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            this.rs = ps.executeQuery();
            this.rs.beforeFirst();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void close(){
        try{
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
