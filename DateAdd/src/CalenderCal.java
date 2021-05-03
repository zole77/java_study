import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalenderCal {
    public static void main(String args[]) throws ParseException {

        String Msg = "2021년04월01일";
        String end = "2021년05월05일";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년MM월dd일");

        Calendar cal = Calendar.getInstance();

        Date modifyDate;
        Date UserDB_Date;
        String modify;
        try {

            Date FirstDate = simpleDateFormat.parse(Msg);
            Date endDate = simpleDateFormat.parse(end);

            cal.setTime(FirstDate);
            cal.add(Calendar.DATE, 5);

            UserDB_Date = simpleDateFormat.parse(simpleDateFormat.format(cal.getTime()));
            System.out.println("유저 데이터베이스 날짜: " + UserDB_Date);


            Date d = UserDB_Date;
            if(d.after(FirstDate) && d.before(endDate)){
                System.out.println("in between");
            }else{
                System.out.println("not in between");
            }


            int compare = FirstDate.compareTo(endDate);
            if( compare > 0 ){
                System.out.println("FirstDate > endDate");
            }else if( compare < 0 ){
                System.out.println("FirstDate < endDate");
            }else{
                System.out.println("FirstDate == endDate");
            }


            int compare1 = FirstDate.compareTo(UserDB_Date);
            if( compare > 0){ // 시작날짜가 UserDB 에 저장된 날짜보다 크면 계산하지않음

            }else if( compare < 0){ // 시작날짜가 UserDB 에 저장된 날짜보다 작으면 그 다음 term 만큼을 더한 값도 봐야해

            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
