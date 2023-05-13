import java.time.LocalDate;

public class Package {
    private static int nextTrackingNumber = 1;
    private Address senderAddress;
    private Address recipientAddress;
    private String trackingNumber;
    private LocalDate estimatedDelivaryDate;

    public Package(Address senderAddress, Address recipientAddress, String trackingNumber, int y, int m, int d) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.trackingNumber = trackingNumber;
        this.estimatedDelivaryDate = LocalDate.of(y, m, d);
    }

    public String generateTrackingNumber(){
        String formateNumber = String.format("%03d", nextTrackingNumber);
        nextTrackingNumber++;
        return "AS" + formateNumber;
    }

    public Address getSenderAddress() {
        return senderAddress;
    }

    public Address getRecipientAddress() {
        return recipientAddress;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public LocalDate getEstimatedDelivaryDate() {
        return estimatedDelivaryDate;
    }

    public void setRecipientAddress(Address recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setEstimatedDelivaryDate(LocalDate estimatedDelivaryDate) {
        this.estimatedDelivaryDate = estimatedDelivaryDate;
    }
}
