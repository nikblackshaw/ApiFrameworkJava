package NCDTOS;

public class NCAddressDTO {
    private String addressLine1;
    private String addressline2;
    private String county;
    private String postcode;

    public String getAddressLine1 () {
        return addressLine1;
    }

    public void setAddressLine1 (String addressLine1){
        this.addressLine1 = addressLine1;
    }

    public String getAddressline2 () {
        return addressline2;
    }

    public void setAddressline2 (String addressline2){
        this.addressline2 = addressline2;
    }

    public String getCounty () {
        return county;
    }

    public void setCounty (String county){
        this.county = county;
    }

    public String getPostcode () {
        return postcode;
    }

    public void setPostcode (String postcode){
        this.postcode = postcode;
    }
}
