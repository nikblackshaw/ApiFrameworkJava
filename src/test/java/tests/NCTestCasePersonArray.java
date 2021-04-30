package tests;

import NCDTOS.NCPersonDTO;
import NCDTOS.NCpeopleDTO;
import builders.NCPersonBuilder;
import builders.PersonBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataproviders.PersonDataProvider;
import dtos.peopleDto;
import dtos.personNoConstructorDto;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NCTestCasePersonArray {

    private PersonDataProvider dp = new PersonDataProvider();
    private NCpeopleDTO pp = new NCpeopleDTO();
    private List<NCPersonDTO> finalPerson = new ArrayList<>();
    private int iCount = 1;
    private String myJson;

    @Test(dataProvider = "data-provider",dataProviderClass = PersonDataProvider.class)
    public void personArrayTest(String personName,
                           String addressLineOne,
                           String addressLineTwo,
                           String AddressCounty,
                           String AddressPostCode) throws JsonProcessingException {

        //NCPersonDTO pOne = new NCPersonDTO();
        NCPersonBuilder pb = new NCPersonBuilder();

        finalPerson.add(pb.Build(personName,addressLineOne,addressLineTwo,AddressCounty,AddressPostCode));

        if(iCount >= dp.dataProviderMethodList().length) {
            pp.setPeople(finalPerson);
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            //Serialize to json
            myJson = mapper.writeValueAsString(pp);

            //De-serialize to object
            NCpeopleDTO car = mapper.readValue(myJson, NCpeopleDTO.class);

            System.out.println("");
        }

        iCount++;
    }

}
