package com.aninfo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private Date date;

    private String type;

    private Double sum;

    @ManyToOne
    private Account account;

    public Transaction(){
    }

    public Transaction(Double sum, Account account) {
        this.sum = sum;
        this.account = account;
        this.date = java.sql.Date.valueOf(LocalDate.now());
    }

    public String getType() {
        return type;
    }

    public void setType(String tipoDeTransaccion) {
        this.type = tipoDeTransaccion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() { return account; }

    public Long getAccountCbu() { return account.getCbu(); }

    public void setAccount(Account account) { this.account = account; }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Long getTransactionId(){ return transactionId; };

    public void setTransactionId(Long transactionId){ this.transactionId = transactionId; }

}
