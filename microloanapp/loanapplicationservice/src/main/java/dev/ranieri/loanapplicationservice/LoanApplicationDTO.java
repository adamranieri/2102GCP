package dev.ranieri.loanapplicationservice;

// Data transfer object.
// a class used to send or recieve data
// a DTO is different from an entity in that they are not saved or persisted
public class LoanApplicationDTO {

    private int ssId;
    private int amountRequested;
    private int creditScore;
    private String reason;

    public LoanApplicationDTO() {
    }

    public int getSsId() {
        return ssId;
    }

    public void setSsId(int ssId) {
        this.ssId = ssId;
    }

    public int getAmountRequested() {
        return amountRequested;
    }

    public void setAmountRequested(int amountRequested) {
        this.amountRequested = amountRequested;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
