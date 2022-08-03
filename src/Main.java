import java.lang.reflect.GenericDeclaration;

public class Main {
    public static void main(String[] args) {

        String url = "www.naver.com";
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);
        System.out.println("result = " + result);
                
    }
}