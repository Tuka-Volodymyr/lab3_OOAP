package org.example;

import java.util.ArrayList;
import java.util.List;

class HouseRegistry {
  private List<House> houses = new ArrayList<>();

  // Додаємо будинок до контейнера
  public void addHouse(House house) {
    houses.add(house);
  }

  // Перегляд всіх будинків
  public void printAllHouses() {
    for (House house : houses) {
      house.printInfo();
      System.out.println("-------------------");
    }
  }

  // Редагування будинку за індексом
  public House getHouse(int index) {
    if (index >= 0 && index < houses.size()) {
      return houses.get(index);
    }
    return null;
  }

  // Клонування будинку
  public void cloneHouse(int index) {
    if (index >= 0 && index < houses.size()) {
      House clonedHouse = houses.get(index).clone();
      houses.add(clonedHouse);
      System.out.println("Будинок було скопійовано!");
    }
  }
}

