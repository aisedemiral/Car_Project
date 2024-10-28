//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setColor("Gümüş");
        car1.setModel("Renoult Megane");
        car1.setDoors(3);
        car1.setEngine(1.6);

        System.out.println("Arabanın Rengi:" + car1.getColor());
        System.out.println("Arabanın Modeli:" + car1.getModel());
        System.out.println("Arabanın Motor Hacmi :" + car1.getEngine());
        System.out.println("Arabanın Kapı Sayısı:" + car1.getDoors());
        car1.start();
        car1.stop();
    }
    }