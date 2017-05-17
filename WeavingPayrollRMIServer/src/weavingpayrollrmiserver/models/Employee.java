package weavingpayrollrmiserver.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Employee implements Serializable {

    private String id;
    private String firstName;
    private String middleName; /// <<--- 
    private String lastName;
    private LocalDate birthday;
    private LocalDate hireDate;
    private String address;
    private String phoneNumber;
    private ArrayList<Double> hours = new ArrayList<>();
    private String password;
    private boolean clockedIn;

    private boolean active;

    private Position position;

    private double monthlyPay;
    private double dailyRate;
    private double hoursWorked;

    private double hourlyRate;
    private double sssContribution;
    private double philhealthContribution;
    private double pagIbigContribution;
    private double incomeTax;
    private int daysWorked;

    private List<DailyTimeCard> timeCards = new ArrayList<>();
    private DailyTimeCard currentTimeCard;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public static double getDailyRate(Position pos) {
        switch (pos) {
            case ADMIN:
                return 1000;
            case MAINTENANCE:
                return 285;
            case TAILOR:
                return 300;
            case MANAGER:
                return 800;
            case SUPERVISOR:
                return 400;
        }
        return 0;

    }

    public Employee() {
        this.active = true;
        this.password = "password";
        this.pagIbigContribution = 100.00;
        this.philhealthContribution = 250.00;
    }

    public Employee(String id, String firstName, String lastName) {
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getTotalDeduction() {
        return sssContribution + pagIbigContribution
                + philhealthContribution;
    }

    public double getNetPay() {
        return (getDailyRate() * daysWorked) - (getTotalDeduction());
    }

    public double getDailyRate() {
        return getDailyRate(this.position);
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public DailyTimeCard getCurrentTimeCard() {
        return currentTimeCard;
    }

    public void setCurrentTimeCard(DailyTimeCard currentTimeCard) {
        this.currentTimeCard = currentTimeCard;
    }

    public ArrayList<Double> getHours() {
        return hours;
    }

    public void setHours(ArrayList<Double> hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public List<DailyTimeCard> getTimeCards() {
        return timeCards;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public double getSssContribution() {
        return sssContribution;
    }

    public void setSssContribution(double sssContribution) {
        this.sssContribution = sssContribution;
    }

    public double getPhilhealthContribution() {
        return philhealthContribution;
    }

    public void setPhilhealthContribution(double philhealthContribution) {
        this.philhealthContribution = philhealthContribution;
    }

    public double getPagIbigContribution() {
        return pagIbigContribution;
    }

    public void setPagIbigContribution(double pagIbigContribution) {
        this.pagIbigContribution = pagIbigContribution;
    }

    public boolean isClockedIn() {
        return clockedIn;
    }

    public void setClockedIn(boolean clockedIn) {
        this.clockedIn = clockedIn;
    }

    public boolean timeIn() {
        if (!isClockedIn() && currentTimeCard == null) {
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            currentTimeCard = new DailyTimeCard(currentDate, currentTime);
            clockedIn = true;
            return true;

        } else {
            return false; // invalid clocking in
        }
    }

    public boolean timeOut() {
        try {
            if (!isClockedIn() && currentTimeCard != null) {
                // invalid clocking in
                return false;
            } else {
                // TODO
                currentTimeCard.setEndTime(LocalTime.now());
                clockedIn = false;
                currentTimeCard = null;
                timeCards.add(currentTimeCard);
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", birthday=" + birthday + ", hireDate=" + hireDate + ", address=" + address + ", hours=" + hours + ", password=" + password + ", clockedIn=" + clockedIn + ", timeCards=" + timeCards + ", currentTimeCard=" + currentTimeCard + ", monthlyPay=" + monthlyPay + ", hourlyRate=" + hourlyRate + ", phoneNumber=" + phoneNumber + ", position=" + position + ", sssContribution=" + sssContribution + ", philhealthContribution=" + philhealthContribution + ", pagIbigContribution=" + pagIbigContribution + ", incomeTax=" + incomeTax + '}';
    }

}
