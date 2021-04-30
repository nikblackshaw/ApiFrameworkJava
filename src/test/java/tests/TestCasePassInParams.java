package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import dataproviders.PersonDataProvider;
import dtos.addressDto;
import dtos.personDtoConstructor;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCasePassInParams {
    private List<personDtoConstructor> newp = new ArrayList<personDtoConstructor>();

    @Test(dataProvider = "data-provider",dataProviderClass = PersonDataProvider.class)
    public void testMethod(String personName,
                           String addressLineOne,
                           String addressLineTwo,
                           String AddressCounty,
                           String AddressPostCode) throws JsonProcessingException {

        addressDto myh = new addressDto(
                addressLineOne,
                addressLineTwo,
                AddressCounty,
                AddressPostCode
            );
            personDtoConstructor mperson = new personDtoConstructor(personName, Arrays.asList(myh), Arrays.asList(myh));

    newp.add(mperson);
    }
}
