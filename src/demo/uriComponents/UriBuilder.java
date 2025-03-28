package demo.uriComponents;

public interface UriBuilder {

    UriBuilder scheme(String scheme);

    UriBuilder host(String host);
    UriBuilder path(String path);
    UriBuilder pathVariable(String name, Object value);
    UriBuilder queryParam(String name, Object value);

    UriComponents build();

    String toUriString();


}
