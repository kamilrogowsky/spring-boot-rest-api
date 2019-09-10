package com.restapi.springbootrestapi.dto;


public class VehicleDto {

    private Long id;
    private String name;
    private String bodyType;
    private int horsepower;
    private int releaseYear;

    public VehicleDto() {
    }

    public VehicleDto(Long id, String name, String bodyType, int horsepower, int releaseYear) {
        this.id = id;
        this.name = name;
        this.bodyType = bodyType;
        this.horsepower = horsepower;
        this.releaseYear = releaseYear;
    }

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

    public int getReleaseYear() {
        return releaseYear;
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

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}


