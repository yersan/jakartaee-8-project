package org.wildfly;

import java.io.Serializable;

public class Product implements Serializable {
    private String type;
    private String size;
    private String greetingType;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGreetingType() {
        return greetingType;
    }

    public void setGreetingType(String greetingType) {
        this.greetingType = greetingType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("type='").append(type).append('\'');
        sb.append(", size='").append(size).append('\'');
        sb.append(", greetingType='").append(greetingType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
