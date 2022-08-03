import java.util.Base64;

public class Encoder implements IEncoder {
    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    @Override
    public String encode(String message) {
        return this.iEncoder.encode(message);
    }
}