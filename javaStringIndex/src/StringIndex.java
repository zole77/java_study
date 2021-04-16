public class StringIndex {
    public static void main(String []args){
        String str = "노해로 31, 소독완료";
        int target_index = str.indexOf("소독완료");
        str = str.replace(str.substring(target_index), "");
        System.out.println(str);
    }
}
