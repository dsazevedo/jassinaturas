package sdk.jassinaturas.clients.attributes;


public class PaymentMethod {
    private int code;
    private CreditCard creditCard;
    private String description;

    public int getCode() {
        return code;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public String getDescription() {
        return description;
    }

}