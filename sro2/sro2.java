import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Logger {

    private static final String FILE_NAME = "log.txt";

    public static void log(String level, String message) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time = LocalDateTime.now().format(formatter);

            writer.write(time + " [" + level + "] " + message + "\n");

        } catch (IOException e) {
            System.out.println("Қате: " + e.getMessage());
        }
    }
}

public class sro2 {
    public static void main(String[] args) {
        Logger.log("INFO", "Тест");
    }
}