/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository;

import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class Main {
public static void main(String[] args) throws SQLException {
// Contoh penggunaan MemoryStorage
DataStorage memoryStorage = (DataStorage) new MemoryStorage();
memoryStorage.writeData("Data stored in memory");
System.out.println("Memory storage: " + memoryStorage.readData());
// Contoh penggunaan FileStorage
DataStorage fileStorage = new FileStorage("data.txt");
fileStorage.writeData("Data stored in file");
System.out.println("File storage: " + fileStorage.readData());
// Contoh penggunaan DatabaseStorage
DataStorage databaseStorage = new DatabaseStorage("database.db");
databaseStorage.writeData("Data stored in database");
System.out.println("Database storage: " + databaseStorage.readData());
}
}
