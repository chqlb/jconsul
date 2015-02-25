package com.loukou.jconsul.client.model.health;

import com.google.gson.annotations.SerializedName;

public class HealthCheck {

    @SerializedName("Node")
    private String node;

    @SerializedName("CheckID")
    private String checkId;

    @SerializedName("Name")
    private String name;

    @SerializedName("Status")
    private String status;

    @SerializedName("Notes")
    private String notes;

    @SerializedName("Output")
    private String output;

    @SerializedName("ServiceID")
    private String serviceId;

    @SerializedName("ServiceName")
    private String serviceName;

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
