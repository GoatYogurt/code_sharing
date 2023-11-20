import org.example.Week10;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class StaticProgramAnalysisTest {
    private static String pathToContent(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader in = new BufferedReader(fileReader);

        StringBuilder fileContent = new StringBuilder();
        String line;
        try {
            while ((line = in.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fileContent.toString();
    }

    @Test
    public void testDatabaseUtils() throws FileNotFoundException {
        assertEquals("[update(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), getInt(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), getString(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), getResultPackage(com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), executeQuery(java.lang.Class<?>,com.nordstrom.common.jdbc.utils.QueryAPI,java.lang.Object), executeQuery(java.lang.Class<?>,java.lang.String,java.lang.String,java.lang.Object), getInt(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object), getString(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object), getResultPackage(com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object), executeStoredProcedure(java.lang.Class<?>,com.nordstrom.common.jdbc.utils.SProcAPI,java.lang.Object), executeStoredProcedure(java.lang.Class<?>,java.lang.String,java.lang.String,com.nordstrom.common.jdbc.Param), executeStatement(java.lang.Class<?>,java.sql.Connection,java.sql.PreparedStatement), getConnection(java.lang.String)]",
                Week10.getAllFunctions(pathToContent("D:\\CODING\\code\\StaticProgramAnalysis\\src\\main\\java\\org\\example\\DatabaseUtils.txt")).toString());
    }

    @Test
    public void testOSInfo() throws FileNotFoundException {
        assertEquals("[getDefault(), osName(), version(), arch()]",
                Week10.getAllFunctions(pathToContent("D:\\CODING\\code\\StaticProgramAnalysis\\src\\main\\java\\org\\example\\OSInfo.txt")).toString());
    }

    @Test
    public void testVolumeInfo() throws FileNotFoundException {
        assertEquals("[getVolumeProps(), getVolumeProps(java.io.InputStream)]",
                Week10.getAllFunctions(pathToContent("D:\\CODING\\code\\StaticProgramAnalysis\\src\\main\\java\\org\\example\\VolumeInfo.txt")).toString());
    }

    @Test
    public void testRandomArrayUtils() throws FileNotFoundException {
        assertEquals("[randomArrayFrom(T[],com.google.common.collect.Range<java.lang.Integer>), randomArrayFrom(java.lang.Iterable<T>,com.google.common.collect.Range<java.lang.Integer>), randomArrayFrom(T[],int), randomArrayFrom(java.lang.Iterable<T>,int), randomArrayFrom(java.util.function.Supplier<T>,com.google.common.collect.Range<java.lang.Integer>), randomArrayFrom(java.util.function.Supplier<T>,int)]",
                Week10.getAllFunctions(pathToContent("D:\\CODING\\code\\StaticProgramAnalysis\\src\\main\\java\\org\\example\\RandomArrayUtils.txt")).toString());
    }

    @Test
    public void testDateUtils() throws FileNotFoundException {
        assertEquals("[isLeapDay(java.time.temporal.TemporalAccessor), atStartOfDay(java.util.Date), atEndOfDay(java.util.Date), dateToLocalDateTime(java.util.Date), localDateTimeToDate(java.time.LocalDateTime)]",
                Week10.getAllFunctions(pathToContent("D:\\CODING\\code\\StaticProgramAnalysis\\src\\main\\java\\org\\example\\DateUtils.txt")).toString());
    }

    @Test
    public void testRandomDateUtils() throws FileNotFoundException {
        assertEquals("[randomZonedDateTime(), randomZonedDateTime(java.time.ZonedDateTime,java.time.ZonedDateTime), randomFutureZonedDateTime(), randomZonedDateTimeAfter(java.time.ZonedDateTime), randomPastZonedDateTime(), randomZonedDateTimeBefore(java.time.ZonedDateTime), randomOffsetDateTime(), randomOffsetDateTime(java.time.OffsetDateTime,java.time.OffsetDateTime), randomFutureOffsetDateTime(), randomOffsetDateTimeAfter(java.time.OffsetDateTime), randomPastOffsetDateTime(), randomOffsetDateTimeBefore(java.time.OffsetDateTime), randomLocalDateTime(), randomLocalDateTime(java.time.LocalDateTime,java.time.LocalDateTime), randomFutureLocalDateTime(), randomLocalDateTimeAfter(java.time.LocalDateTime), randomPastLocalDateTime(), randomLocalDateTimeBefore(java.time.LocalDateTime), randomLocalDate(), randomLocalDate(java.time.LocalDate,java.time.LocalDate), randomFutureLocalDate(), randomLocalDateAfter(java.time.LocalDate), randomPastLocalDate(), randomLocalDateBefore(java.time.LocalDate), randomDate(), randomDate(java.util.Date,java.util.Date), randomFutureDate(), randomDateAfter(java.util.Date), randomPastDate(), randomDateBefore(java.util.Date), randomInstant(), randomInstant(java.time.Instant,java.time.Instant), randomFutureInstant(), randomInstantAfter(java.time.Instant), randomPastInstant(), randomInstantBefore(java.time.Instant), randomLocalTime(), randomLocalTime(java.time.LocalTime,java.time.LocalTime), randomLocalTimeAfter(java.time.LocalTime), randomLocalTimeBefore(java.time.LocalTime), random(java.time.temporal.TemporalField), random(java.time.temporal.TemporalField,long,long), randomAfter(java.time.temporal.TemporalField,long), randomBefore(java.time.temporal.TemporalField,long), randomMonthDay(), randomMonthDay(boolean), randomMonthDay(java.time.MonthDay,java.time.MonthDay), randomMonthDay(java.time.MonthDay,java.time.MonthDay,boolean), randomMonthDayAfter(java.time.MonthDay), randomMonthDayAfter(java.time.MonthDay,boolean), randomMonthDayBefore(java.time.MonthDay), randomMonthDayBefore(java.time.MonthDay,boolean), randomYearMonth(), randomYearMonth(java.time.YearMonth,java.time.YearMonth), randomFutureYearMonth(), randomYearMonthAfter(java.time.YearMonth), randomPastYearMonth(), randomYearMonthBefore(java.time.YearMonth), randomYear(), randomYear(java.time.Year,java.time.Year), randomYear(int,int), randomFutureYear(), randomYearAfter(java.time.Year), randomYearAfter(int), randomPastYear(), randomYearBefore(java.time.Year), randomYearBefore(int), randomFixedUtcClock(), randomFixedClock(), randomZoneId(), randomDayOfWeek(), randomMonth(), randomZoneOffset(), randomPeriod(), randomPositivePeriod(), randomNegativePeriod(), randomDuration(), randomPositiveDuration(), randomNegativeDuration()]",
                Week10.getAllFunctions(pathToContent("D:\\CODING\\code\\StaticProgramAnalysis\\src\\main\\java\\org\\example\\RandomDateUtils.txt")).toString());
    }
}
