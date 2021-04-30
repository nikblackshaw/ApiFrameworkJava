package dtos;

import java.util.List;

public class personNoConstructorDto {

    private String name;
    public List<addressDto> homeaddresses;
    public List<addressDto> workaddresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<addressDto> getHomeaddresses() {
        return homeaddresses;
    }

    public void setHomeaddresses(List<addressDto> homeaddresses) {
        this.homeaddresses = homeaddresses;
    }

    public List<addressDto> getWorkaddresses() {
        return workaddresses;
    }

    public void setWorkaddresses(List<addressDto> workaddresses) {
        this.workaddresses = workaddresses;
    }

}
