package cars.dto;

import java.io.Serializable;

public class Driver implements Serializable {
    private long licenseId;
    private String name;
    private int birthYear;
    private String phone;

    public Driver() {
    }

    public Driver(@RequestParamCustom(value = "licenseId") long licenseId,
                  @RequestParamCustom(value = "name") String name,
                  @RequestParamCustom(value = "birthYear") int birthYear,
                  @RequestParamCustom(value = "phone") String phone) {
        this.licenseId = licenseId;
        this.name = name;
        this.birthYear = birthYear;
        this.phone = phone;
    }

    public long getLicenseId() {
        return licenseId;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "licenseId=" + licenseId +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;

        Driver driver = (Driver) o;

        return licenseId == driver.licenseId;
    }

    @Override
    public int hashCode() {
        return (int) (licenseId ^ (licenseId >>> 32));
    }
}
