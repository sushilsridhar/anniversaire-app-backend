package helpers;

import java.time.LocalDate;
import java.time.Period;

public class Analytics {

    public static Integer calculateAge(LocalDate dob) {

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(dob, currentDate);

        return period.getYears();
    }
}
