import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExcepcionTriangulo extends Exception {

    public ExcepcionTriangulo(String message) {
        super(message);
        logException(message);
    }

    private void logException(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            writer.write(formattedDateTime + " - " + message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
    }
}
