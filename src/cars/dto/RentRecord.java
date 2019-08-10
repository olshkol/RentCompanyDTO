package cars.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class RentRecord implements Serializable {
    private String regNumber;
    private long licenseId;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private int rentDays;
    private int damages;
    private int tankPercent;
    private double cost;

    public RentRecord() {
    }

    public RentRecord(String regNumber, long licenseId, LocalDate rentDate, int rentDays) {
        this.regNumber = regNumber;
        this.licenseId = licenseId;
        this.rentDate = rentDate;
        this.rentDays = rentDays;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(long licenseId) {
        this.licenseId = licenseId;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public int getDamages() {
        return damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }

    public int getTankPercent() {
        return tankPercent;
    }

    public void setTankPercent(int tankPercent) {
        this.tankPercent = tankPercent;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RentRecord)) return false;

        RentRecord that = (RentRecord) o;

        if (licenseId != that.licenseId) return false;
        if (regNumber != null ? !regNumber.equals(that.regNumber) : that.regNumber != null) return false;
        return rentDate != null ? rentDate.equals(that.rentDate) : that.rentDate == null;
    }

    @Override
    public int hashCode() {
        int result = regNumber != null ? regNumber.hashCode() : 0;
        result = 31 * result + (int) (licenseId ^ (licenseId >>> 32));
        result = 31 * result + (rentDate != null ? rentDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RentRecord{" +
                "regNumber='" + regNumber + '\'' +
                ", licenseId=" + licenseId +
                ", rentDate=" + rentDate +
                '}';
    }
}
