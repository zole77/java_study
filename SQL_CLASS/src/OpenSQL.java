import java.sql.*;

public class OpenSQL {
    java.sql.Connection conn;
    java.sql.Statement stmt;
    java.sql.ResultSet rs;
    PreparedStatement ps = null;

    OpenSQL(){
        connect();
    }

    void connect() {
        String dbinfo = "jdbc:mysql://localhost:3307/opentutorials";
        String dbid = "root";
        String dbps = "135156";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = java.sql.DriverManager.getConnection(dbinfo, dbid, dbps);
            this.stmt = this.conn.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    void update(String dbCommend){
        try{
            this.stmt.executeUpdate(dbCommend);
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
