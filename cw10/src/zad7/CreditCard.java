package zad7;

import java.time.LocalDate;

public class CreditCard implements Cloneable{
    String cardNumber;
    String holderName;
    LocalDate expiryDate;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CreditCard(String cardNumber, String holderName, LocalDate expiryDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return getCardNumber() + " " + getHolderName() + " " + getExpiryDate();
    }

    @Override
    public CreditCard clone() {
        try {
            CreditCard clone = (CreditCard) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
