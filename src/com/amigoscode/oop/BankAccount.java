package com.amigoscode.oop;

import java.math.BigDecimal;

// Example Of Encapsulation

public class BankAccount {
    private String name;
    private BigDecimal balance;
    private boolean hasOverDraft;

    public BigDecimal withdraw(BigDecimal amount){
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0){
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;
    }
}
