package ro.jademy.contactlist.model;

import java.util.List;
import java.util.Map;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    private Map<String, PhoneNumber> phoneNumbers;
    private Address address;

    private String jobTitle;
    private Company company;

    private boolean isFavorite;
}
