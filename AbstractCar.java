package abstractcar;

// Lớp trừu tượng chung cho Car
abstract class Car {
    protected String licensePlate;
    protected String owner;
    protected String vehicleId;

    public Car(String licensePlate, String owner, String vehicleId) {
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.vehicleId = vehicleId;
    }

    // Các phương thức chung
    public abstract void showInfo();
}

// Góc nhìn Registration
class RegistrationView extends Car {
    private String taxDueDate;

    public RegistrationView(String licensePlate, String owner, String vehicleId, String taxDueDate) {
        super(licensePlate, owner, vehicleId);
        this.taxDueDate = taxDueDate;
    }

    @Override
    public void showInfo() {
        System.out.println("=== Registration Info ===");
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner: " + owner);
        System.out.println("Tax due date: " + taxDueDate);
    }
}

// Góc nhìn Owner
class OwnerView extends Car {
    private String serviceHistory;
    private double mileage;

    public OwnerView(String licensePlate, String owner, String vehicleId, String serviceHistory, double mileage) {
        super(licensePlate, owner, vehicleId);
        this.serviceHistory = serviceHistory;
        this.mileage = mileage;
    }

    @Override
    public void showInfo() {
        System.out.println("=== Owner Info ===");
        System.out.println("Car description: " + vehicleId + " - " + licensePlate);
        System.out.println("Service History: " + serviceHistory);
        System.out.println("Mileage: " + mileage + " km");
    }
}

// Góc nhìn Garage
class GarageView extends Car {
    private String workDescription;
    private double billingInfo;

    public GarageView(String licensePlate, String owner, String vehicleId, String workDescription, double billingInfo) {
        super(licensePlate, owner, vehicleId);
        this.workDescription = workDescription;
        this.billingInfo = billingInfo;
    }

    @Override
    public void showInfo() {
        System.out.println("=== Garage Info ===");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Work Description: " + workDescription);
        System.out.println("Billing Info: $" + billingInfo);
        System.out.println("Owner: " + owner);
    }
}

// Demo
public class AbstractCar {
    public static void main(String[] args) {
        Car regCar = new RegistrationView("29A-12345", "Nguyen Van A", "CAR123", "2025-12-31");
        Car ownerCar = new OwnerView("29A-12345", "Nguyen Van A", "CAR123", "Oil change, Tire check", 50000);
        Car garageCar = new GarageView("29A-12345", "Nguyen Van A", "CAR123", "Brake repair", 250.5);

        regCar.showInfo();
        System.out.println();
        ownerCar.showInfo();
        System.out.println();
        garageCar.showInfo();
    }
}
