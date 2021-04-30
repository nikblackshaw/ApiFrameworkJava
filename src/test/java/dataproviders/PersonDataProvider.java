package dataproviders;

import org.testng.annotations.DataProvider;

public class PersonDataProvider {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Person A", "Address Line One", "Address Line Two", "Address County Line", "AB123CD"},
                {"Person B", "Address Line One", "Address Line Two", "Address County Line", "AC124CD"},
                {"Person C", "Address Line One", "Address Line Two", "Address County Line", "AD125CD"},
        };
    }

    public String[][] dataProviderMethodList() {

        String[][] a = {
            {"Person A", "Address Line One", "Address Line Two", "Address County Line", "AB123CD"},
            {"Person B", "Address Line One", "Address Line Two", "Address County Line", "AC124CD"},
            {"Person C", "Address Line One", "Address Line Two", "Address County Line", "AD125CD"},
        };

        return a;
    }
}
