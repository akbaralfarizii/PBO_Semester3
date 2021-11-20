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
public class FlyingDutchMan extends SuperHero {

    public FlyingDutchMan(int powerLevel, String name) {
	super(powerLevel, name);
	Power laser = new LaserEye();
	Power flying = new Flying();
	addPower(flying);
	addPower(laser);
    }

    @Override
    public void identity() {
        // TODO Auto-generated method stub
	System.out.printf("It's %s, the FlyingDutchMan! It has the power level of %d\n",this.name,this.powerLevel);
	super.identity();
    }	
}
