package ch06;
class Car {
    String color;
    String gearType;
    int door;
    
    Car() {}
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "White";
        c1.gearType = "auto";
        c1.door = 4;
        
        Car c2 = new Car("Black", "auto", 2);
        
    }

}
