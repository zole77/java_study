import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardControl {

    String user_id;
    public BoardControl(String user_id) {
        this.user_id = user_id;
    }

    public void Write() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            OpenDB A1 = new OpenDB();
            System.out.print("제목을 입력해주세요: ");
            String title = br.readLine();
            System.out.print("내용을 입력해주세요: ");
            String line = "";
            String plaintext ="";
            while(line.equals("EOF") != true ){
                line = br.readLine();
                plaintext = plaintext.concat(line + "\n");
                System.out.println(plaintext);
            }
            A1.Write(title, plaintext, this.user_id);
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
