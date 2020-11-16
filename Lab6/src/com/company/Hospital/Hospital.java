package com.company.Hospital;

import com.company.Person;
import com.company.Util.Address;
import com.company.Util.Phone;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Person> persons;
    public ArrayList<Department> departments;

    public String name;
    public Phone phone;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
