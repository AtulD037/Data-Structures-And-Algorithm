package A_Java_Interview_Programs;

import java.net.MalformedURLException;
import java.net.URL;

public class URLAndIPAdress {
    public static void main(String[] args) {
        try {
            System.out.println(new URL("https://app.hubspot.com/").equals(new URL("https://104.19.155.83")));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
