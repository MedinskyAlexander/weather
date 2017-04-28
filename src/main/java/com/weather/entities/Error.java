package com.weather.entities;

/**
 * Created by a.medinsky on 4/28/2017.
 */
public class Error {

    private String type;
    private String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Error{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
