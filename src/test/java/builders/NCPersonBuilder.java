package builders;

import NCDTOS.NCAddressDTO;
import NCDTOS.NCPersonDTO;
import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.Arrays;

public class NCPersonBuilder {

    public NCPersonDTO Build(String personName,
                                        String addressLineOne,
                                        String addressLineTwo,
                                        String AddressCounty,
                                        String AddressPostCode) throws JsonProcessingException {

        NCPersonDTO px = new NCPersonDTO();

        px.setName(personName);

        NCAddressDTO myh = new NCAddressDTO();
        myh.setAddressLine1(addressLineOne);
        myh.setAddressline2(addressLineTwo);
        myh.setCounty(AddressCounty);
        myh.setPostcode(AddressPostCode);

        px.setHomeaddresses(Arrays.asList(myh));
        px.setWorkaddresses(Arrays.asList(myh));

        return px;
    }
}
