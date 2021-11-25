package com.example.springdatajpa_example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class Employee {
    @Id
    @Column(name = "IDNV", nullable = false)
    private String id;

    @Column(name = "Hoten")
    private String name;

    @Column(name = "IDPB")
    private String IDPB;

    @Column(name = "DiaChi")
    private String address;

    public Employee(String id, String name, String IDPB, String address) {
        this.id = id;
        this.name = name;
        this.IDPB = IDPB;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", IDPB='" + IDPB + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDPB() {
        return IDPB;
    }

    public void setIDPB(String IDPB) {
        this.IDPB = IDPB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
