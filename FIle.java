import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thời điểm thứ nhất
        System.out.println("Nhập thời điểm thứ nhất (dd/mm/yyyy hh:mm):");
        String time1Input = scanner.nextLine();
        LocalDateTime dateTime1 = parseDateTime(time1Input);

        // Nhập thời điểm thứ hai
        System.out.println("Nhập thời điểm thứ hai (dd/mm/yyyy hh:mm):");
        String time2Input = scanner.nextLine();
        LocalDateTime dateTime2 = parseDateTime(time2Input);

        // Tính toán khoảng thời gian giữa hai thời điểm
        Duration duration = Duration.between(dateTime1, dateTime2);
        long minutes = duration.toMinutes();

        // In ra khoảng thời gian giữa hai thời điểm
        System.out.println("Khoảng thời gian: " + minutes + " phút");

        // Đóng Scanner
        scanner.close();
    }

    private static LocalDateTime parseDateTime(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.parse(input, formatter);
    }
}