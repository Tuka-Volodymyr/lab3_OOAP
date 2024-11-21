package org.example;

class Cottage implements House {
  private double area;
  private int floors;
  private String address;
  private String owner;  // Власник котеджу

  public Cottage(double area, int floors, String address, String owner) {
    this.area = area;
    this.floors = floors;
    this.address = address;
    this.owner = owner;
  }

  @Override
  public void printInfo() {
    System.out.println("Котедж:");
    System.out.println("Площа: " + area + " кв.м.");
    System.out.println("Поверхів: " + floors);
    System.out.println("Адреса: " + address);
    System.out.println("Власник: " + owner);
  }

  @Override
  public House clone() {
    try {
      return (Cottage) super.clone(); // Створюємо копію котеджу
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }

  // Геттери та сеттери для редагування полів
  public void setArea(double area) {
    this.area = area;
  }

  public void setFloors(int floors) {
    this.floors = floors;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
}

