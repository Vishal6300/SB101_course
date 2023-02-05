package vishal_fw20_0280.unit_4.sprint_1.day_3.assignments;

public class Main {

    public static void main(String[] args) {
        String city= "Delhi";
        switch(city){
            case "Mumbai":
                System.out.println("Financial City");
                break;

            case "Delhi":
                System.out.println("Capital of the country");
                break;

            case "Kolkata":
                System.out.println("City of Joy");
                break;

            case "Bengluru":
                System.out.println("Cyber City");
                break;

            default:
                System.out.println("May be other city");
                break;
        }

    }
}
