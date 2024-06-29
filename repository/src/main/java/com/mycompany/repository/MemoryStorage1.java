/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository;

/**
 *
 * @author Asus
 */
public class MemoryStorage1 implements DataStorage {
private String data;
@Override
public void writeData(String data) {
this.data = data;
}
@Override
public String readData() {
return this.data;
}
}
