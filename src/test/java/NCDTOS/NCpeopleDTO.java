package NCDTOS;

import dtos.personNoConstructorDto;

import java.util.List;

public class NCpeopleDTO {
    List<NCPersonDTO> people;

    public List<NCPersonDTO> getPeople() {
        return people;
    }

    public void setPeople(List<NCPersonDTO> people) {
        this.people = people;
    }
}
