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
public class ManRay extends SuperHero {

    public ManRay(int powerLevel, String name) {
        super(powerLevel, name);
	Power fly = new Flying();
	Power strength =new Strength();
	addPower(fly);
	addPower(strength);
    }

    @Override
    public void identity() {
        // TODO Auto-generated method stub
	System.out.printf("It's %s, the ManRay! It has the power level of %d\n",this.name,this.powerLevel);
	super.identity();
    }
}