import java.util.Date;

public class Transaction {
    private double amount;
    private Date timestamp;
    private String memo;
    private Account in_Account;
    public Transaction(double amount, Account in_Account){
        this.amount=amount;
        this.in_Account=in_Account;
        this.timestamp=new Date();
        this.memo="";
    }
    public Transaction(double amount,String memo, Account in_Account){
        this(amount,in_Account);
        this.memo=memo;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getSummaryLine() {
        if(this.amount>=0){
            return String.format("%s: $%0.02f: %s", this.timestamp.toString(), this.amount, this.memo);
        }else {
            return String.format("%s: $(%0.02f): %s", this.timestamp.toString(), this.amount, this.memo);
        }
    }
}
