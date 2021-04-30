package dtos;

import java.util.List;

public class personDtoConstructor {
    public personDtoConstructor(String name, List<addressDto> homeaddresses, List<addressDto> workaddresses){
        this.name = name;
        this.homeaddresses = homeaddresses;
        this.workaddresses = workaddresses;
    }
    private String name;
    public List<addressDto> homeaddresses;
    public List<addressDto> workaddresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<addressDto> getHomeaddress() {
        return homeaddresses;
    }

    public void setHomeaddress(List<addressDto> homeaddresses) {
        this.homeaddresses = homeaddresses;
    }

    public List<addressDto> getWorkaddresses() {
        return workaddresses;
    }

    public void setWorkaddresses(List<addressDto> workaddresses) {
        this.workaddresses = workaddresses;
    }


}
