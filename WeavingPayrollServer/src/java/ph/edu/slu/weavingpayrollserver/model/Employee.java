package ph.edu.slu.weavingpayrollserver.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author chris
 */

public class Employee {

    String id;
    String firstName;
    String middleName; /// <<--- 
    String lastName;
    Calendar birthday;
    Calendar hireDate;
    double monthlyPay;
    double sssContribution;
    double philhealthContribution;
    double pagIbigContribution;
    String password;
    boolean clockedIn;
    List<DailyTimeCard> timeCards = new ArrayList<>();
    DailyTimeCard currentTimeCard;

    public List<DailyTimeCard> getTimeCards() {
        return timeCards;
    }

    private Employee() {
    }

    public Employee(String id, String firstName, String lastName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
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

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Calendar getHireDate() {
        return hireDate;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
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
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", birthday=" + birthday + ", hireDate=" + hireDate + ", monthlyPay=" + monthlyPay + ", sssContribution=" + sssContribution + ", philhealthContribution=" + philhealthContribution + ", pagIbigContribution=" + pagIbigContribution + ", password=" + password + ", clockedIn=" + clockedIn + ", timeCards=" + timeCards + ", currentTimeCard=" + currentTimeCard + '}';
    }

}
