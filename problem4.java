import java.util.Calendar;
import java.util.GregorianCalendar;

class agageeofperson {

    public static void main(String[] args) {

        int date = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        Calendar dob = new GregorianCalendar(year, month, date);

        Calendar current = Calendar.getInstance();

        int cur_year = current.get(Calendar.YEAR);
        int dob_year = dob.get(Calendar.YEAR);

        int cur_month = current.get(Calendar.MONTH);
        int dob_month = dob.get(Calendar.MONTH);

        int cur_date = current.get(Calendar.DATE);
        int dob_date = dob.get(Calendar.DATE);

        int years = cur_year - dob_year;

        if (dob_month > cur_month)
            years--;
        else if (dob_month == cur_month && dob_date < cur_date) {
            years--;
        }

        System.out.println("You are " + years + " years old");
    }
}