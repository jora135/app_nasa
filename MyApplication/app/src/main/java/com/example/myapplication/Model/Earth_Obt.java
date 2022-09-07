package com.example.myapplication.Model;

import java.util.Date;

public class Earth_Obt {
    public Date date;
    public String id;
    public String resource;
    public String service_version;
    public String url;

    public Earth_Obt(Date date, String id, String resource, String service_version, String url) {
        this.date = date;
        this.id = id;
        this.resource = resource;
        this.service_version = service_version;
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getService_version() {
        return service_version;
    }

    public void setService_version(String service_version) {
        this.service_version = service_version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Earth_Obt{" +
                "date=" + date +
                ", id='" + id + '\'' +
                ", resource='" + resource + '\'' +
                ", service_version='" + service_version + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
