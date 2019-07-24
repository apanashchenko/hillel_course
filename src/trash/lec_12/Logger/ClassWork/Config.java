package trash.lec_12.Logger.ClassWork;

public class Config {
    private String url;

    class UrlBuilder {
        public String buildUrl(String schema, String host, String port, String path) {
            return String.format("%s:%s:%s/%s", schema, host, port, path);
        }

        public String buildUrl(String schema, String host, String path) {
            return String.format("%s:%s/%s", schema, host, path);
        }

    }
}




