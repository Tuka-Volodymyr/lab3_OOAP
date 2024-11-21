package org.example;

// Інтерфейс для будинків, що підтримує прототипне копіювання
interface House extends Cloneable {
  void printInfo();           // Метод для виведення інформації про будинок
  House clone();              // Метод для копіювання будинку (прототип)
}