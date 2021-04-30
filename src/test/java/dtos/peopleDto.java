package dtos;

import java.util.List;

import static variable.Variables.TEST_DIRECTORY;

public class peopleDto {
    List<personNoConstructorDto> people;
    String h = TEST_DIRECTORY;
    public List<personNoConstructorDto> getPeople() {
        return people;
    }

    public void setPeople(List<personNoConstructorDto> people) {
        this.people = people;
    }

}
