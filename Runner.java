public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");

        // 1. Create a new rectangle object
//        Rectangle rectangle = <INSTANTIATE A NEW RECTANGLE OBJECT HERE>
            Rectangle rectangle = new Rectangle(5,6);


        // 2. Calculate the rectangle's area and store it in a variable
//        int area = <CALL YOUR METHOD HERE>;

        int area = rectangle.calculateArea(5,6);

//        System.out.println("The rectangle has an area of " + area);
        System.out.println("The rectangle has an area of " + area + "cm");


        // 3. Check if your rectangle is actually a square
//        boolean isRectangle = <CALL YOUR METHOD HERE>
        boolean isSquare = rectangle.isSquare(5,5);
        //        System.out.println("Object is a square (true/false): " + isRectangle);
        System.out.println("Is the object a square? " + isSquare);

    }

    public static void computerDemo(){
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object
//        Computer computer = <INSTANTIATE A NEW COMPUTER OBJECT HERE>
        Computer computer = new Computer(256, null);
        Computer anotherComputer = new Computer(512, null);

        // 2. Use a getter to find out how much storage the computer has
//        int currentStorage = <CALL YOUR METHOD HERE>;

        int currentStorage = computer.getCurrentStorage();
        int secondCurrentStorage = anotherComputer.getCurrentStorage();

        //        System.out.println("Computer has " + currentStorage + "GB storage");
        System.out.println("The current storage is: " +currentStorage + "GB.");
        System.out.println("The current storage is: " +secondCurrentStorage + "GB.");


        // 3. Add more storage to the computer
//        <CALL YOUR METHOD HERE>;
        // We use the getter again to check that the amount of storage has been updated
//        int newStorage = computer.getStorage(); is the totalStorage
        int totalStorage = computer.additionalStorage(currentStorage,256);
        int anotherTotalStorage = anotherComputer.additionalStorage(secondCurrentStorage,256);

//        System.out.println("Computer now has " + newStorage + "GB storage");
        System.out.println("Computer now has "+ totalStorage + "GB.");
        System.out.println("Computer now has "+ anotherTotalStorage + "GB.");

        // 4. Use a setter to update the computer's printer property
//
        computer.setModelName("HP");
//        anotherComputer.setModelName("Canon");

        // Write a getter and use it below to check that the setter worked
//        String currentPrinter = <GETTER>;

        String modelName = computer.getModelName();
        String secondModelName = anotherComputer.getModelName();

        //        System.out.println("Computer currently has a " + currentPrinter + " printer connected.");
        System.out.println(" Computer has a " + modelName + " printer connected." );
//        System.out.println(" Computer has a " + secondModelName + " printer connected." );

        // 5. Write a method to print a message.
        System.out.println(computer.printMessage(modelName));
        System.out.println(anotherComputer.printMessage(secondModelName));

    }

    public static void shoppingTrolleyDemo(){
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");

        // 1. Create a new shopping trolley
//        ShoppingTrolley trolley = <INSTANTIATE A NEW SHOPPINGTROLLEY OBJECT HERE>;

        // 2. Add an item to the trolley
//        <CALL YOUR METHOD HERE>;

        // 3. Count items in the trolley
//        int itemCount = <CALL YOUR METHOD HERE>;
//        System.out.println("The trolley contains " + itemCount + " items.");

        // 4. Check if an item is in the trolley
//        boolean itemInTrolley = <CALL YOUR METHOD HERE>;
//        System.out.println("Object is a square (true/false): " + itemInTrolley);
    }


}
