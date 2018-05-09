package forms;


import java.util.Date;

/**
 * Created by Kotryna on 01/04/2018.
 */
public class DateReportForm {

    public Date from;

    public Date to;

    public DateReportForm() {
    }
    DateReportForm(Date from, Date to) {
        this.from = from;
        this.to = to;
    }
}
