/**
 * The basic class syntax.
 */

public class BasicClass {

    //These are the class fields/properties
    private int field1 = 100;
    private String field2;
    private boolean field3;

    public BasicClass() {
        // This is a basic constructor.
        // This is where the default values for the fields are set
        field1 = 0;
        field2 = "";
        field3 = false;
    }

    public BasicClass(int field1){
        // This is an alternate constructor;
        this.field1 = field1;
        this.field2 = "";
        this.field3 = false;
    }
    public BasicClass(int field1, String field2){
        // This is an alternate constructor;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = false;
    }
    public BasicClass(int field1, String field2, boolean field3){
        // This is an alternate constructor;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;

    }

    public void doSomething(){
        // This is a public method that does not return anything
        int a = 214, b = 791;
        field1 = a + b;
    }

    private int doSomethingAndReturnSomething() {
        // This is a private method that returns an integer.
        return 1;
    }

    //      Getters and Setters
    public void setField1(int field1Value){
        this.field1 = field1Value;
    }

    public int getField1(){
        return field1;
    }
}


/**
 * Inheritance. Use "extends".
 */
public class Bicycle {

    public byte gear;
    public float speed;

    public Bicycle(byte startGear, float startSpeed) {
        // bicycle constructor
        gear = startGear;
        speed = startSpeed;
    }

    public void speedUp(float increment) {
        //bicycle method
        speed += increment;
    }

}

public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;

    public MountainBike(int startHeight, byte startSpeed, int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}

/*
 *          What MountainBike class looks like
 *
 *          Since MountainBike extends Bicycle: it is a Bicycle + the fields and methods created in the MountainBike class
 *
 */

public class MountainBike{

    public byte gear;           //Bicycle
    public float speed;         //Bicycle
    public int seatHeight;      //MountainBike


    public MountainBike(int startHeight, int startSpeed, byte startGear) {
        gear = startGear;
        speed = startSpeed;
        seatHeight = startHeight;
    }


    // Bicycle Method
    public void speedUp(float increment) {
        //bicycle method
        speed += increment;
    }

    // MountainBike method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

}