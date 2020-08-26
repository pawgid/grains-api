package com.spring.grainsAPI.springgrainsapi.model;

import javax.persistence.*;

@Entity
@Table(name = "grain")
public class Grain {

    private String id;
    private String grainName;
    private int grainQuantity;
    private String grainDescription;

    public Grain() {
    }

    public Grain(String id, String grainName, int grainQuantity, String grainDescription) {
        this.id = id;
        this.grainName = grainName;
        this.grainQuantity = grainQuantity;
        this.grainDescription = grainDescription;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "grainid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "grainname", nullable = false)
    public String getGrainName() {
        return grainName;
    }

    public void setGrainName(String grainName) {
        this.grainName = grainName;
    }

    @Column(name = "grainquantity_kg", nullable = false)
    public int getGrainQuantity() {
        return grainQuantity;
    }

    public void setGrainQuantity(int grainQuantity) {
        this.grainQuantity = grainQuantity;
    }

    @Column(name = "graindescription", nullable = false)
    public String getGrainDescription() {
        return grainDescription;
    }

    public void setGrainDescription(String grainDescription) {
        this.grainDescription = grainDescription;
    }

    @Override
    public String toString() {
        return "Grain{" +
                "id=" + id +
                ", grainName='" + grainName + '\'' +
                ", grainQuantity=" + grainQuantity +
                ", grainDescription='" + grainDescription + '\'' +
                '}';
    }
}
