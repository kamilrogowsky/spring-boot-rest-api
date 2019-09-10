package com.restapi.springbootrestapi.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "Vehicles")
@EntityListeners(AuditingEntityListener.class)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(name = "body_type")
    private String bodyType;

    private int horsepower;

    @Column(name = "year_of_production")
    private int productionYear;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
