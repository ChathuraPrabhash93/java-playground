package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateTimePlayground {
	private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE; // 2023-01-01
	private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

	public static void main(String[] args) {
		// convert Date only string into LocalDateTime (with the time of midnight at the start of the day ie. '00:00')
		String dateStr = "2023-01-01";
		LocalDateTime localDateTime = LocalDateTime.of(LocalDate.parse(dateStr), LocalTime.MIN);

		// convert timestamp to LocalDateTime
		long timestamp = 1499070300000L;
		LocalDateTime fromTimestamp = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), TimeZone.getDefault().toZoneId());
		String fromTimestampStr = fromTimestamp.format(dateFormatter);
		System.out.println("timestamp to LocalDateTime: " + fromTimestampStr);

		// add days to the LocalDateTime and format to a string (this formatter returns date part only ex: `2023-01-01`)
		String date = localDateTime.plusDays(1).toLocalDate().format(dateFormatter);
		System.out.println("Date: " + date);

		// format LocalDateTime to a string (this formatter returns time in hours and minutes only ex: `08:30`)
		String time = localDateTime.toLocalTime().format(timeFormatter);
		System.out.println("Time: " + time);
	}

}
