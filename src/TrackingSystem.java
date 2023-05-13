import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrackingSystem {

    private List<Package> packages;
    private int nPackage;


    public TrackingSystem() {
        packages = new ArrayList<>();
        nPackage = 0;
    }

    public int getnPackage() {
        return nPackage;
    }

    //as
    public List<Package> getPackages() {
        return packages;
    }

    public void addPackage(Package pkg) {
        packages.add(pkg);
    }

    public boolean removePackage(String trackingNumber) {
        for (int i = 0; i < packages.size(); i++) {
            if (packages.get(i).getTrackingNumber().equals(trackingNumber)) {
                packages.remove(i);
                return true;
            }
        }
        return false;
    }

    public Package searchByRecipientAddress(String recipientAddress) {
        for (int i = 0; i < packages.size(); i++) {
            if (packages.get(i).getRecipientAddress().equals(recipientAddress)) {
                return packages.get(i);
            }
        }
        return null;
    }

    public Package searchByTrackingNumber(String trackingNumber) {
        int left = 0, right = packages.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = packages.get(mid).getTrackingNumber().compareTo(trackingNumber);
            if (cmp == 0) {
                return packages.get(mid);
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public List<Package> searchByCity(String city) {
        List<Package> result = new ArrayList<>();
        for (int i = 0; i < packages.size(); i++) {
            if (packages.get(i).getRecipientAddress().getCity().equals(city)) {
                result.add(packages.get(i));
            }
        }
        return result;
    }
    public List<Package> searbystate(String state) {
        List<Package> result = new ArrayList<>();
        for (int i = 0; i < packages.size(); i++) {
            if (packages.get(i).getRecipientAddress().getState().equals(state)) {
                result.add(packages.get(i));
            }
        }
        return result;
    }
    public List<Package> searchByZipCode(String zipCode) {
        List<Package> result = new ArrayList<>();
        for (int i = 0; i < packages.size(); i++) {
            if (packages.get(i).getRecipientAddress().getZipcode().equals(zipCode)) {
                result.add(packages.get(i));
            }
        }
        return result;
    }
}
