import java.util.*;

class Vehicle {
    private static int nextVehicleNumber = 100001;

    private int vehicleNumber;
    private String companyName;
    private double price;

    public Vehicle(String companyName, double price) {
        this.vehicleNumber = nextVehicleNumber++;
        this.companyName = companyName;
        this.price = price;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    public LightMotorVehicle(String companyName, double price, double mileage) {
        super(companyName, price);
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacityInTons;

    public HeavyMotorVehicle(String companyName, double price, double capacityInTons) {
        super(companyName, price);
        this.capacityInTons = capacityInTons;
    }

    public double getCapacityInTons() {
        return capacityInTons;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter type of vehicle (L for LightMotorVehicle, H for HeavyMotorVehicle): ");
            char type = scanner.next().charAt(0);

            System.out.print("Enter company name: ");
            String companyName = scanner.next();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            if (type == 'L') {
                System.out.print("Enter mileage: ");
                double mileage = scanner.nextDouble();
                vehicles.add(new LightMotorVehicle(companyName, price, mileage));
            } else if (type == 'H') {
                System.out.print("Enter capacity in tons: ");
                double capacity = scanner.nextDouble();
                vehicles.add(new HeavyMotorVehicle(companyName, price, capacity));
            } else {
                System.out.println("Invalid vehicle type.");
                i--;
            }
        }

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Company Name: " + vehicle.getCompanyName());
            System.out.println("Price: " + vehicle.getPrice());
            
            if (vehicle instanceof LightMotorVehicle) {
                LightMotorVehicle lightVehicle = (LightMotorVehicle) vehicle;
                System.out.println("Mileage: " + lightVehicle.getMileage());
            } else if (vehicle instanceof HeavyMotorVehicle) {
                HeavyMotorVehicle heavyVehicle = (HeavyMotorVehicle) vehicle;
                System.out.println("Capacity in Tons: " + heavyVehicle.getCapacityInTons());
            }

            System.out.println();
        }
    }
}
