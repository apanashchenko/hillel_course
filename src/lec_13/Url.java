package lec_13;

import lec_13.Factories.EnvFactory;

public class Url {
    private String protocol = "https://";
    private String host;
    private String port = ":8000";
    private String path;
    static String env = new EnvFactory().getEnv();

    static class Builder{
        Url url;

        public Builder() {
            this.url = new Url();
        }

        public Builder withProtocol(String protocol){
            this.url.protocol = protocol + "://";
            return this;
        }

        public Builder withHost(String host){
            String[] part = host.split("\\.");
            this.url.host = part[0] + "-" + env + "." + part[1];
            return  this;
        }

        public Builder withPort(int port){
            this.url.port = ":" + port;
            return  this;
        }

        public Builder withPath(String path){
            this.url.path = "/" + path;
            return this;
        }

        public Url build(){
            return this.url;
        }
    }

    @Override
    public String toString() {
        return protocol + host + port + path;
    }
}
