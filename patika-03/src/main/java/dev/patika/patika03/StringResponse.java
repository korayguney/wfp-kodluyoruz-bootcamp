package dev.patika.patika03;

import javax.xml.bind.annotation.XmlRootElement;

public class StringResponse {
    private String name;

    public StringResponse(String name) {
        this.name = name;
    }

    public StringResponse(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
