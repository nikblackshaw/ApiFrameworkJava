package builders;

import com.fasterxml.jackson.core.JsonProcessingException;
import dtos.addressDto;
import dtos.personNoConstructorDto;

import java.util.Arrays;

public class PersonBuilder {

    public personNoConstructorDto Build(String personName,
                                        String addressLineOne,
                                        String addressLineTwo,
                                        String AddressCounty,
                                        String AddressPostCode) throws JsonProcessingException {

        personNoConstructorDto px = new personNoConstructorDto();

        px.setName(personName);
        addressDto myh = new addressDto(
                addressLineOne,
                addressLineTwo,
                AddressCounty,
                AddressPostCode
        );
        px.setHomeaddresses(Arrays.asList(myh));
        px.setWorkaddresses(Arrays.asList(myh));

        return px;
    }
}
