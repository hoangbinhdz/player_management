import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WritePlayersToFile {
    public static void main(String[] args) {
        List<String> players = Arrays.asList(
            "1, Kylian Mbappe, 25, France, Forward, 200000000, [1, 2], 7, 178, 73",
            "2, Erling Haaland, 23, Norway, Forward, 180000000, [3, 4, 5, 6], 9, 195, 88",
            "3, Kevin De Bruyne, 32, Belgium, Midfielder, 100000000, [7, 8, 9, 10, 6], 17, 181, 68",
            "4, Lionel Messi, 37, Argentina, Forward, 50000000, [11, 2, 12], 10, 170, 72",
            "5, Cristiano Ronaldo, 39, Portugal, Forward, 30000000, [13, 14, 15, 43, 16], 7, 187, 84",
            "6, Neymar Jr., 32, Brazil, Forward, 90000000, [17, 11, 2, 18], 10, 175, 68",
            "7, Robert Lewandowski, 35, Poland, Forward, 50000000, [19, 5, 20, 11], 9, 185, 81",
            "8, Virgil van Dijk, 32, Netherlands, Defender, 80000000, [21, 22, 23, 24], 4, 193, 92",
            "9, Mohamed Salah, 31, Egypt, Forward, 90000000, [25, 26, 8, 27, 28, 24], 11, 175, 71",
            "10, Harry Kane, 30, England, Forward, 100000000, [29, 30, 31, 32, 33, 20], 9, 188, 86",
            "11, Sadio Mane, 32, Senegal, Forward, 60000000, [35, 4, 23, 24, 20, 36], 10, 175, 69",
            "12, Raheem Sterling, 29, England, Forward, 70000000, [24, 6, 8], 7, 170, 69",
            "13, Joshua Kimmich, 29, Germany, Midfielder, 85000000, [37, 20], 6, 177, 73",
            "14, Bruno Fernandes, 29, Portugal, Midfielder, 80000000, [38, 39, 40, 41, 42], 8, 179, 69",
            "15, Paul Pogba, 31, France, Midfielder, 70000000, [42, 43], 6, 191, 84",
            "16, Jan Oblak, 31, Slovenia, Goalkeeper, 70000000, [44, 45, 46, 47], 13, 188, 87",
            "17, Karim Benzema, 36, France, Forward, 25000000, [48, 14, 49], 9, 185, 81",
            "18, Luka Modric, 38, Croatia, Midfielder, 20000000, [50, 51, 14], 10, 172, 66",
            "19, Sergio Ramos, 38, Spain, Defender, 15000000, [52, 14, 53, 52], 4, 184, 82",
            "20, Gianluigi Donnarumma, 25, Italy, Goalkeeper, 80000000, [54, 2], 99, 196, 90"
        );

        String fileName = "players.txt";
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file)) {
            if (file.exists()) {
                System.out.println("File already exists. Overwriting...");
            } else {
                System.out.println("File does not exist. Creating new file...");
                file.createNewFile();
            }
            for (String player : players) {
                writer.write(player + "\n");
            }
            System.out.println("File successfully written!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}