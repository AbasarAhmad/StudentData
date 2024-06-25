package com.Sheikh.JPAdemo;

import jakarta.persistence.*;

@Entity
public class Card {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int cardNo;

   @Column(nullable = false,unique = true)  // yani ab dob null nhi ho sakta and Unique bhi hoga
   private String dob;

   @Enumerated(EnumType.STRING) // ye mysql ko batata hai ki ye enum data type hai and iske sath Varchar jaise treat kro
           //  kiyo ki mysql ke pass enum naam ka koi datatype nhi hai
   private Status status;       // ye ek enum ko define karne ka tarika
   //Status status=Status.ACTIVATED       // ismai bydefalt  status ACTIVATED show hogi


   @OneToOne // pahla One Card class ke liye hai and second One User Class ke liye hai
   @JoinColumn
   User user;


   public Card() // defalt Constructor
   {

   }
   public Card(int cardNo, String dob, Status status) { // perimetrize Constructor
      this.cardNo = cardNo;
      this.dob = dob;
      this.status = status;
   }

   public int getCardNo() {
      return cardNo;
   }

   public void setCardNo(int cardNo) {
      this.cardNo = cardNo;
   }

   public String getDob() {
      return dob;
   }

   public void setDob(String dob) {
      this.dob = dob;
   }

   public Status getStatus() {
      return status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }
}
