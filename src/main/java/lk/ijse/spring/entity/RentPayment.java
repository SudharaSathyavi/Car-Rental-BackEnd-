package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RentPayment {
   @Id
   private String PID;
   private String date;
   private String payment;

   @OneToOne(mappedBy = "rentPayment")
   private Rent rent;

   public RentPayment(String PID, String date, String payment, Rent rent) {
      this.PID = PID;
      this.date = date;
      this.payment = payment;
      this.rent = rent;
   }

   @Override
   public String toString() {
      return "RentPayment{" +
              "PID='" + PID + '\'' +
              ", date='" + date + '\'' +
              ", payment='" + payment + '\'' +
              ", rent=" + rent +
              '}';
   }

   public String getPID() {
      return PID;
   }

   public void setPID(String PID) {
      this.PID = PID;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public String getPayment() {
      return payment;
   }

   public void setPayment(String payment) {
      this.payment = payment;
   }

   public Rent getRent() {
      return rent;
   }

   public void setRent(Rent rent) {
      this.rent = rent;
   }

   public RentPayment() {
   }
}
