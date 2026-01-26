package regex;
public class IPValidation {
    public static void main(String[] args) {

        String[] ips = {"192.168.1.1", "256.100.1.1"};

        String regex =
            "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}"
          + "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";

        for (String ip : ips) {
            System.out.println(ip + " → " + ip.matches(regex));
        }
    }
}
