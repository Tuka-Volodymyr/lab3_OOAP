package org.example;

import java.util.List;

class ApartmentBuilding implements House {
  private double area;             // Площа будинку
  private int floors;              // Кількість поверхів
  private String address;          // Адреса будинку
  private List<String> owners;     // Список власників квартир

  public ApartmentBuilding(double area, int floors, String address, List<String> owners) {
    this.area = area;
    this.floors = floors;
    this.address = address;
    this.owners = owners;
  }

  @Override
  public void printInfo() {
    System.out.println("Багатоквартирний будинок:");
    System.out.println("Площа: " + area + " кв.м.");
    System.out.println("Поверхів: " + floors);
    System.out.println("Адреса: " + address);
    System.out.println("Власники квартир: " + String.join(", ", owners));
  }

  @Override
  public House clone() {
    try {
      // Створюємо копію об'єкта, включаючи глибоке копіювання списку власників
      ApartmentBuilding copy = (ApartmentBuilding) super.clone();
      copy.owners = List.copyOf(this.owners); // Копіюємо список власників
      return copy;
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

  public void setOwners(List<String> owners) {
    this.owners = owners;
  }
}
