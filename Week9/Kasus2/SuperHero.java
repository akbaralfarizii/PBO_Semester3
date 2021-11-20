/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author akbar
 */
import java.util.ArrayList;
import java.util.List;

public abstract class SuperHero{
    int powerLevel;
    String name;
    List<Power> powerList;
	
    public SuperHero(int powerLevel,String name) {
    	this.powerLevel = powerLevel;
    	this.name = name;
	this.powerList = new ArrayList<Power>();
    }
    
    public int getPowerLevel(){
	return powerLevel;
    }

    public String getName(){
    	return name;
    }
	
    public void addPower(Power power){
	powerList.add(power);
    }
	
    public void identity(){
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAAME IS " + this.getName());
    }
	
    public void showPowers() {
        System.out.println("TIME TO SHOW YOU MY POWERS");
	for (Power temp : powerList) {
            temp.doPower();
	}
    };
}