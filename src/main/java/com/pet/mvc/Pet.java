package com.pet.mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Pet {
    @NotBlank(message = "Animal data entered incorrectly")
    @Size(min = 2 , max= 30 , message =
            "The name of the animal must be at least 2 characters")
    private String pets;
    @NotBlank(message =
            "The name of the Animal was entered incorrectly")
    @Size(min = 2 , max= 30 , message =
            "The name of the animal must be at least 2 characters")
    private String petName;
    @Min(value = 3,message =
            "the animal must not be younger than 3 years old")
    private int age;
    @NotBlank(message = "Specify the gender of the animal")
    private String sexOfTheAnimal;
    private String city;
    @NotBlank(message = "The mail data was entered incorrectly")
    @Email(message = "Isn't email")
    private String emailOfTheOwner;
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10}$",message = "Pleas use pattern +7-XXX-XXX-XX-XX" )
    private String phoneNumberOfTheOwner;
    private String[] award;
    private Map<String, String> cities = new HashMap<>();
//
//    {
//        cities.put("Moskow", "MSK");
//        cities.put("SPB", "SPB");
//    }


    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexOfTheAnimal() {
        return sexOfTheAnimal;
    }

    public void setSexOfTheAnimal(String sexOfTheAnimal) {
        this.sexOfTheAnimal = sexOfTheAnimal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailOfTheOwner() {
        return emailOfTheOwner;
    }

    public void setEmailOfTheOwner(String emailOfTheOwner) {
        this.emailOfTheOwner = emailOfTheOwner;
    }

    public String getPhoneNumberOfTheOwner() {
        return phoneNumberOfTheOwner;
    }

    public void setPhoneNumberOfTheOwner(String phoneNumberOfTheOwner) {
        this.phoneNumberOfTheOwner = phoneNumberOfTheOwner;
    }

    public String[] getAward() {
        return award;
    }

    public void setAward(String[] award) {
        this.award = award;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void setCities(Map<String, String> cities) {
        this.cities = cities;
    }
}
