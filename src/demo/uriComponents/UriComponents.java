package demo.uriComponents;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UriComponents {
    private final String scheme;
    private final String host;
    private final String path;

    // 생성자
    public UriComponents(String scheme, String host, String path) {
        this.scheme = scheme;
        this.host = host;
        this.path = path;
    }

    public String encode() {
        try {
            String encodedPath = URLEncoder.encode(path, StandardCharsets.UTF_8.toString());
            encodedPath = encodedPath.replace("+", "%20").replaceAll("%2F", "/");

            return scheme + "://" + host + "/" + encodedPath;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding failed", e);
        }
    }

    @Override
    public String toString() {
        return encode();
    }
}