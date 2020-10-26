package ru.job4j.oop;

import java.util.Date;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date created;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        License license = (License) object;
        return owner.equals(license.owner) &&
                model.equals(license.model) &&
                code.equals(license.code) &&
                created.equals(license.created);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), owner, model, code, created);
    }
}

