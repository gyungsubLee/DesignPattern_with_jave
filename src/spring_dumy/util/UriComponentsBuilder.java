package spring_dumy.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class UriComponentsBuilder implements UriBuilder {
    private String scheme;
    private String host;
    private String path;
    private final Map<String, String> pathVariables = new HashMap<>();
    private final Map<String, String> queryParams = new LinkedHashMap<>();

    private UriComponentsBuilder() {}

    public static UriComponentsBuilder newInstance() {
        return new UriComponentsBuilder();
    }

    @Override
    public UriBuilder scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    @Override
    public UriBuilder host(String host) {
        this.host = host;
        return this;
    }

    @Override
    public UriBuilder path(String path) {
        this.path = path.trim().replaceAll("\\s+", "/");;
        return this;
    }
    @Override
    public UriBuilder pathVariable(String name, Object value) {
        pathVariables.put(name, value.toString());
        return this;
    }

    @Override
    public UriBuilder queryParam(String name, Object value) {
        queryParams.put(name, value.toString());
        return this;
    }

    @Override
    public String toUriString() {
        // 1. path 변수 치환
        String resolvedPath = path;
        for (Map.Entry<String, String> entry : pathVariables.entrySet()) {
            resolvedPath = resolvedPath.replace("{" + entry.getKey() + "}", entry.getValue());
        }

        String queryString = "";
        if (!queryParams.isEmpty()) {
            queryString = queryParams.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + entry.getValue())
                    .collect(Collectors.joining("&", "?", ""));
        }

        return scheme + "://" + host + resolvedPath + queryString;
    }

    public UriComponents build() {
        return new UriComponents(scheme, host, path);
    }
}
