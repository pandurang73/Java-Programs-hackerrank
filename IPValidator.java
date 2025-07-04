import java.util.regex.*;

public class IPValidator {
    public static void main(String[] args) {
        String[] inputs = {
                "000.12.12.034",
                "121.234.12.12",
                "23.45.12.56",
                "00.12.123.123123.123",
                "122.23",
                "Hello.IP"
        };

        String ipRegex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|0\\d\\d|0\\d|0|[1-9]\\d?)\\.){3}"
                + "(25[0-5]|2[0-4]\\d|1\\d\\d|0\\d\\d|0\\d|0|[1-9]\\d?)$";
        Pattern pattern = Pattern.compile(ipRegex);

        for (String ip : inputs) {
            System.out.println(pattern.matcher(ip).matches());
        }
    }
}
