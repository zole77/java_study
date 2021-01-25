import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args){
        try{
            FileWriter output = new FileWriter("C:/Users/qjatn_000/IdeaProjects/File_inout/output.txt");
            for(int i = 0; i < 11; i++){
                String data = i + "번째 줄입니다.\r\n";
                output.write(data);
            }
            output.close();

            FileWriter output2 = new FileWriter("C:/Users/qjatn_000/IdeaProjects/File_inout/output.txt",true);
            for(int i = 11; i < 21; i++){
                String data = i + "번째 줄입니다.\r\n";
                output2.write(data);
            }
            output2.close();
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/qjatn_000/IdeaProjects/File_inout/output.txt"));
            while(true){
                String line = br.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
            br.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
