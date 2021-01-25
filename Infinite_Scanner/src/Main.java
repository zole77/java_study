import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// EOF 를 입력하면 끝내는 프로그램

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = "";
            while(line.equals("EOF") != true ){
                line = br.readLine();
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
