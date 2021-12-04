package lk.ijse.spring.dto;

import java.util.Date;


public class HandOverDTO {
    private String hoid;
    private Date Date;
    private String Calculation;

    private FinalPaymentDTO finalPaymentDTO;
    private RepairAndDamageDTO repairAndDamageDTO;

    public HandOverDTO() {
    }

    public HandOverDTO(String hoid, java.util.Date date, String calculation, FinalPaymentDTO finalPaymentDTO, RepairAndDamageDTO repairAndDamageDTO) {
        this.hoid = hoid;
        Date = date;
        Calculation = calculation;
        this.finalPaymentDTO = finalPaymentDTO;
        this.repairAndDamageDTO = repairAndDamageDTO;
    }

    @Override
    public String toString() {
        return "HandOverDTO{" +
                "hoid='" + hoid + '\'' +
                ", Date=" + Date +
                ", Calculation='" + Calculation + '\'' +
                ", finalPaymentDTO=" + finalPaymentDTO +
                ", repairAndDamageDTO=" + repairAndDamageDTO +
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

    public FinalPaymentDTO getFinalPaymentDTO() {
        return finalPaymentDTO;
    }

    public void setFinalPaymentDTO(FinalPaymentDTO finalPaymentDTO) {
        this.finalPaymentDTO = finalPaymentDTO;
    }

    public RepairAndDamageDTO getRepairAndDamageDTO() {
        return repairAndDamageDTO;
    }

    public void setRepairAndDamageDTO(RepairAndDamageDTO repairAndDamageDTO) {
        this.repairAndDamageDTO = repairAndDamageDTO;
    }
}
