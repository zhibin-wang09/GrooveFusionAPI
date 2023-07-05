package com.zhibin.audioapi.mixed_audio;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // map this object to a table in database
@Table(name = "mixed_audios")
public class MixedAudios {
    @Id
    @SequenceGenerator(
            name = "audio_sequence",
            sequenceName = "audioSequence",
            allocationSize= 1
    )
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "audio_sequence"
    )
    @Column(name = "id")
    private long id;
    @Column(name ="producer_name")
    private String producerName;
    @Column(name = "produced_date")
    private LocalDate date;
    @Column(name = "audios")
    private byte[] data;

    @Override
    public String toString() {
        return "MixedAudios{" +
                "id=" + id +
                ", producerName='" + producerName + '\'' +
                ", date=" + date +
                ", data=" + formatData() +
                '}';
    }

    private String formatData(){
        if(data == null) return null;
        StringBuilder s = new StringBuilder();
        for(byte b : data){
            s.append(String.format("%02X ", b)); // format to hexadecimal
        }
        return s.toString();
    }

    public MixedAudios(String producerName, LocalDate date, byte[] data) {
        this.producerName = producerName;
        this.date = date;
        this.data = data;
    }

    public MixedAudios(int id, String producerName, LocalDate date, byte[] data) {
        this.id = id;
        this.producerName = producerName;
        this.date = date;
        this.data = data;
    }

    public MixedAudios(String producerName, byte[] data) {
        this.producerName = producerName;
        this.data = data;
        this.date = LocalDate.now();
    }

    protected MixedAudios(){}

    public long getId() {
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

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getProducerName() {
        return producerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public byte[] getData() {
        return data;
    }

}
