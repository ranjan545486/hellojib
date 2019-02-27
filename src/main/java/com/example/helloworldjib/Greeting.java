package com.example.helloworldjib;

public class Greeting {
    private final long id;
    private final String content;

    public String getEnvProperty() {
        return envProperty;
    }

    private final String envProperty;

    public Greeting(long id, String content, String envProperty) {
        this.id = id;
        this.content = content;
        this.envProperty = envProperty;
    }

    public long getId() {
        return id;
    }



    public String getContent() {
        return content;
    }
}
