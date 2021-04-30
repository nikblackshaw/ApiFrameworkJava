package tests;

import builders.PersonBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataproviders.PersonDataProvider;
import dtos.personNoConstructorDto;
import org.testng.annotations.Test;

public class TestCaseInstatntiateClass {


    @Test(dataProvider = "data-provider",dataProviderClass = PersonDataProvider.class)
    public void testMethod(String personName,
                           String addressLineOne,
                           String addressLineTwo,
                           String AddressCounty,
                           String AddressPostCode) throws JsonProcessingException {
        personNoConstructorDto pOne = new personNoConstructorDto();
        PersonBuilder pb = new PersonBuilder();
        pOne = pb.Build(personName,addressLineOne,addressLineTwo,AddressCounty,AddressPostCode);
        //Convert object to JSON string
        ObjectMapper mapper = new ObjectMapper();
        String myJson = mapper.writeValueAsString(pOne);
    }
}
