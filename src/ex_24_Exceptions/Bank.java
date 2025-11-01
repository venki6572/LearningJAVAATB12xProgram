package ex_24_Exceptions;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer addBank(Bank bankname) {

        if (bankname.currency.equalsIgnoreCase("INR")) {
            return bankname.amount + this.amount;
        }
        else
        {
            try {
                throw new Customexception("currency Mismatch, Cant Proceed");
            } catch (Customexception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

  class Customexception extends  Exception {
     Customexception(String msg)   {
         super(msg);
     }
}
