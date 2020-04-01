package academy.fi.finalproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class District {
    @Id
    @Column(unique = true, nullable = false)
    private String postnumber;
    @Column(unique = true, nullable = false, name = "district_name_fin")
    private String districtNameFin;
    @Column (name = "district_name_swe")
    private String districtNameSwe;
    private String municipality;
    @Column (name = "municipality_number")
    private String municipalityNumber;
    @Column (name = "postal_district_fin")
    private String postalDistrictFin;
    @Column (name = "postal_district_swe")
    private String postalDistrictSwe;
    private String latitude;
    private String longitude;

    public District() {
    }

    public String getPostnumber() {
        return postnumber;
    }

    public void setPostnumber(String postnumber) {
        this.postnumber = postnumber;
    }

    public String getDistrictNameFin() {
        return districtNameFin;
    }

    public void setDistrictNameFin(String districtNameFin) {
        this.districtNameFin = districtNameFin;
    }

    public String getDistrictNameSwe() {
        return districtNameSwe;
    }

    public void setDistrictNameSwe(String districtNameSwe) {
        this.districtNameSwe = districtNameSwe;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipalityFin) {
        this.municipality = municipalityFin;
    }

    public String getMunicipalityNumber() {
        return municipalityNumber;
    }

    public void setMunicipalityNumber(String municipalityNumber) {
        this.municipalityNumber = municipalityNumber;
    }

    public String getPostalDistrictFin() {
        return postalDistrictFin;
    }

    public void setPostalDistrictFin(String postalDistrictFin) {
        this.postalDistrictFin = postalDistrictFin;
    }

    public String getPostalDistrictSwe() {
        return postalDistrictSwe;
    }

    public void setPostalDistrictSwe(String postalDistrictSwe) {
        this.postalDistrictSwe = postalDistrictSwe;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}

