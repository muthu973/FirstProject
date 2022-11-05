
public class Mobile {
	private String brand;
	private float price;
	private String os;
	private String color;
	private int netWeight;
	private App app;
	private Battery battery;

	public Mobile(String brand, float price, String os, String color, int netWeight, App app, Battery battery) {
		this.brand = brand;
		this.price = price;
		this.os = os;
		this.color = color;
		this.netWeight = netWeight;
		this.app = app;
		this.battery = battery;
	}

	public Mobile() {

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOs() {
		return this.os;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}

	public int getNetWeight() {
		return this.netWeight;
	}

	public void setApp(App app) {
		this.app = app;
	}

	public App getApp() {
		return this.app;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Battery getBattery() {
		return this.battery;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BRAND=" + this.brand + ", PRICE=" + this.price + ", OS=" + this.os + ", COLOR=" + this.color
				+ ", Net Weight=" + this.netWeight + ", APP NAME=" + this.getApp().getName() + ", APP VERSION="
				+ this.getApp().getVersion() + ", APP SIZE=" + this.getApp().getSize() + ", BATTERY WARRANTY="
				+ this.getBattery().getWarranty() + ", BATTERY CAPACITY=" + this.getBattery().getCapacity()
				+ ", BATTERY LIFE TIME=" + this.getBattery().getLifeTime();
	}

}

class App {
	private String name;
	private double version;
	private String size;

	public App(String name, double version, String size) {
		this.name = name;
		this.version = version;
		this.size = size;
	}

	public App() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public double getVersion() {
		return this.version;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "APP NAME=" + this.name + ", APP VERSION=" + this.version + ", APP SIZE=" + this.size;
	}
}

class Battery {
	private String warranty;
	private int capacity;
	private String lifeTime;

	public Battery(String warranty, int capacity, String lifeTime) {
		this.warranty = warranty;
		this.capacity = capacity;
		this.lifeTime = lifeTime;
	}

	public Battery() {

	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getWarranty() {
		return this.warranty;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setLifeTime(String lifeTime) {
		this.lifeTime = lifeTime;
	}

	public String getLifeTime() {
		return this.lifeTime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BATTERY WARRANTY=" + this.warranty + ", BATTERY CAPACITY=" + this.capacity + ", BATTERY LIFE TIME="
				+ this.lifeTime;
	}
}
