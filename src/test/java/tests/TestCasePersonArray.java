package tests;

import builders.PersonBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataproviders.PersonDataProvider;
import dtos.peopleDto;
import dtos.personNoConstructorDto;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCasePersonArray {
    private peopleDto pp = new peopleDto();
    private PersonDataProvider dp = new PersonDataProvider();
    private List<personNoConstructorDto> finalPerson = new ArrayList<>();
    private int iCount = 1;
    private String myJson;

    @Test(dataProvider = "data-provider",dataProviderClass = PersonDataProvider.class)
    public void personArrayTest(String personName,
                           String addressLineOne,
                           String addressLineTwo,
                           String AddressCounty,
                           String AddressPostCode) throws JsonProcessingException {

        personNoConstructorDto pOne = new personNoConstructorDto();
        PersonBuilder pb = new PersonBuilder();

        finalPerson.add(pb.Build(personName,addressLineOne,addressLineTwo,AddressCounty,AddressPostCode));

        if(iCount >= dp.dataProviderMethodList().length) {
            pp.setPeople(finalPerson);
            ObjectMapper mapper = new ObjectMapper();
            myJson = mapper.writeValueAsString(pp);
        }

        iCount++;
    }

}
