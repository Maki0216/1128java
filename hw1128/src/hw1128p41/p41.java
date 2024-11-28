package hw1128p41;

public class p41 {
	public static void main(String[] args) {
		Car car1=new Car(12345,20.5);
		car1.vshow();
		car1.mshow();
	}
}
interface iVehicle{
	void vshow();
}
interface iMaterial{
	void mshow();
}
class Car implements iVehicle ,iMaterial{
	private int num;
	private double gas;
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void vshow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mshow() {
		System.out.println("車子的材料是鐵");
	}
}