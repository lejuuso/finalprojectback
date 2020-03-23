package academy.fi.finalproject;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class HelpWanted {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "helpwanted_helpwanted_id_seq")
    @SequenceGenerator(name = "helpwanted_helpwanted_id_seq",sequenceName = "helpwanted_helpwanted_id_seq",allocationSize = 1)
    @Column(unique = true, nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String headline;
    private String name;
    private Integer postcode;
    private String email;
    private String description;
    private Boolean groceries;
    private Boolean childCare;
    private Boolean dogOut;
    private Boolean outdoorCompany;
    private Boolean takingOutTrash;
    private Boolean other;

    public HelpWanted(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getGroceries() {
        return groceries;
    }

    public void setGroceries(Boolean groceries) {
        this.groceries = groceries;
    }

    public Boolean getChildCare() {
        return childCare;
    }

    public void setChildCare(Boolean childCare) {
        this.childCare = childCare;
    }

    public Boolean getDogOut() {
        return dogOut;
    }

    public void setDogOut(Boolean dogOut) {
        this.dogOut = dogOut;
    }

    public Boolean getOutdoorCompany() {
        return outdoorCompany;
    }

    public void setOutdoorCompany(Boolean outdoorCompany) {
        this.outdoorCompany = outdoorCompany;
    }

    public Boolean getTakingOutTrash() {
        return takingOutTrash;
    }

    public void setTakingOutTrash(Boolean takingOutTrash) {
        this.takingOutTrash = takingOutTrash;
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }
}
