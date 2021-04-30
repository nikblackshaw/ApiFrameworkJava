package NCDTOS;

import dtos.addressDto;

import java.util.List;

public class NCPersonDTO {
    private String name;
    public List<NCAddressDTO> homeaddresses;
    public List<NCAddressDTO> workaddresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NCAddressDTO> getHomeaddresses() {return homeaddresses;}

    public void setHomeaddresses(List<NCAddressDTO> homeaddresses) {
        this.homeaddresses = homeaddresses;
    }

    public List<NCAddressDTO> getWorkaddresses() {
        return workaddresses;
    }

    public void setWorkaddresses(List<NCAddressDTO> workaddresses) {
        this.workaddresses = workaddresses;
    }

}
