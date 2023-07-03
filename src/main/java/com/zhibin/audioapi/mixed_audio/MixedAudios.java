package com.zhibin.audioapi.mixed_audio;

import java.io.FileInputStream;
import java.time.LocalDate;

public class MixedAudios {
    private int id;
    private String producerName;
    private LocalDate date;
    private FileInputStream data;

    @Override
    public String toString() {
        return "MixedAudios{" +
                "id=" + id +
                ", producerName='" + producerName + '\'' +
                ", date=" + date +
                ", data=" + data +
                '}';
    }

    public MixedAudios(String producerName, LocalDate date, FileInputStream data) {
        this.producerName = producerName;
        this.date = date;
        this.data = data;
    }

    public MixedAudios(int id, String producerName, LocalDate date, FileInputStream data) {
        this.id = id;
        this.producerName = producerName;
        this.date = date;
        this.data = data;
    }

    public MixedAudios(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setData(FileInputStream data) {
        this.data = data;
    }

    public String getProducerName() {
        return producerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public FileInputStream getData() {
        return data;
    }

}
