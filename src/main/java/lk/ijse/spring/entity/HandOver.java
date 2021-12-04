package lk.ijse.spring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class HandOver {

    @Id
    private String hoid;
    private Date Date;
    private String Calculation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fpid", referencedColumnName = "fid")
    private FinalPayment finalPayment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dmgid", referencedColumnName = "Id")
    private RepairAndDamage repairAndDamage;

    public HandOver() {
    }

    public HandOver(String hoid, java.util.Date date, String calculation, FinalPayment finalPayment, RepairAndDamage repairAndDamage) {
        this.hoid = hoid;
        Date = date;
        Calculation = calculation;
        this.finalPayment = finalPayment;
        this.repairAndDamage = repairAndDamage;
    }

    @Override
    public String toString() {
        return "HandOver{" +
                "hoid='" + hoid + '\'' +
                ", Date=" + Date +
                ", Calculation='" + Calculation + '\'' +
                ", finalPayment=" + finalPayment +
                ", repairAndDamage=" + repairAndDamage +
                '}';
    }

    public String getHoid() {
        return hoid;
    }

    public void setHoid(String hoid) {
        this.hoid = hoid;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getCalculation() {
        return Calculation;
    }

    public void setCalculation(String calculation) {
        Calculation = calculation;
    }

    public FinalPayment getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(FinalPayment finalPayment) {
        this.finalPayment = finalPayment;
    }

    public RepairAndDamage getRepairAndDamage() {
        return repairAndDamage;
    }

    public void setRepairAndDamage(RepairAndDamage repairAndDamage) {
        this.repairAndDamage = repairAndDamage;
    }
}
