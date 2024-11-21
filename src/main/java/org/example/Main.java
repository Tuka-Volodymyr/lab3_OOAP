package org.example;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Створюємо багатоквартирний будинок
    ApartmentBuilding apartment = new ApartmentBuilding(1000.0, 5, "Вулиця Незалежності, 12", Arrays.asList("Олена", "Іван", "Петро"));

    // Створюємо котедж
    Cottage cottage = new Cottage(250.0, 2, "Вулиця Садова, 7", "Сергій");

    // Створюємо реєстр будинків
    HouseRegistry registry = new HouseRegistry();

    // Додаємо будинки до реєстру
    registry.addHouse(apartment);
    registry.addHouse(cottage);

    // Виводимо всі будинки
    System.out.println("Всі будинки в реєстрі:");
    registry.printAllHouses();

    // Клонування будинку
    System.out.println("Клонуємо котедж...");
    registry.cloneHouse(1);

    // Виводимо всі будинки після клонування
    System.out.println("Всі будинки після клонування:");
    registry.printAllHouses();

    // Редагування інформації про котедж
    House clonedCottage = registry.getHouse(2);
    if (clonedCottage instanceof Cottage) {
      ((Cottage) clonedCottage).setAddress("Вулиця Лісова, 9");
    }

    // Виводимо будинки після редагування
    System.out.println("Всі будинки після редагування:");
    registry.printAllHouses();
  }
}
