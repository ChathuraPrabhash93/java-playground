package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimePlayground {
	private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE; // 2023-01-01
	private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

	public static void main(String[] args) {
		// convert Date only string into LocalDateTime (with the time of midnight at the start of the day ie. '00:00')
		String dateStr = "2023-01-01";
		LocalDateTime localDateTime = LocalDateTime.of(LocalDate.parse(dateStr), LocalTime.MIN);

		// add days to the LocalDateTime and format to a string (this formatter returns date part only ex: `2023-01-01`)
		String date = localDateTime.plusDays(1).toLocalDate().format(dateFormatter);

		// format LocalDateTime to a string (this formatter returns time in hours and minutes only ex: `08:30`)
		String time = localDateTime.toLocalTime().format(timeFormatter);
	}

}
