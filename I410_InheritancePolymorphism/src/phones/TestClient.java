package phones;

import java.util.Random;

/**
 * The TestClient class is used to demonstrate the functionality of various phone types.
 * It creates instances of RotaryPhone, PushButtonPhone, and SmartPhone, and shows
 * how to interact with them by printing their details, simulating plug-in and plug-out
 * actions, and performing phone-specific operations like calling, browsing, and taking pictures.
 */
public class TestClient {

    /**
     * The entry point of the application. It initializes phone objects with different specifications,
     * demonstrates their functionalities, and displays their states.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Dimension instances for different phone models
        Dimension Model_500D = new Dimension(143, 208, 119);
        Dimension Cortelco_2500D = new Dimension(178, 228, 127);
        Dimension Pixel_3 = new Dimension(138.4, 68.2, 7.9);
        Dimension iphone_8 = new Dimension(138.4, 67.3, 7.3);

        // Define Voltage settings for different phones
        Voltage voltage110 = Voltage.V110;
        Voltage voltage220 = Voltage.DUAL;

        // Instantiate various phone models
        RotaryPhone Model_500 = new RotaryPhone("Model 500", Model_500D, voltage110);
        PushButtonPhone Cortelco_2500 = new PushButtonPhone("Coterlco 2500", Cortelco_2500D, voltage220);
        SmartPhone Pixel3 = new SmartPhone("Pixel13", Pixel_3, 128);
        SmartPhone iphone8 = new SmartPhone("iphone 8", iphone_8, 64);

        // Display the details of each phone
        System.out.println("Various Phones: ");
        System.out.println(Model_500.toString());
        System.out.println(Cortelco_2500.toString());
        System.out.println(Pixel3.toString());
        System.out.println(iphone8.toString());
        System.out.println();

        // Simulate plug-in and plug-out actions
        Model_500.PlugIn();
        Cortelco_2500.PlugIn();
        Random random = new Random();
        int choice = random.nextInt(2);

        if (choice == 0) {
            Model_500.unPlug();
        } else {
            Cortelco_2500.unPlug();
        }

        // Create an array to hold different phone objects
        Phone[] phone = {Model_500, Cortelco_2500, Pixel3, iphone8};
        System.out.println("Array Elements");

        // Iterate through the array, demonstrate and display functionalities
        for (Phone phoneObj : phone) {
            System.out.println(phoneObj.toString());
            long phoneNumber = 8019574111L;
            String callResult = phoneObj.Call(phoneNumber);
            System.out.println(callResult);

            if (phoneObj instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) phoneObj;
                System.out.println(smartPhone.browse());
                System.out.println(smartPhone.takePicture());
            }
            System.out.println();
        }
    }
}
