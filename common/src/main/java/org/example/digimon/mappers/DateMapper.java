package org.example.digimon.mappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateMapper {

    default LocalDate toLocalDate(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        return LocalDate.parse(date, dateTimeFormatter);
    }

}
