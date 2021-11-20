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
public class AvengedSimulator {
    public static void main (String[] args) {
        SuperHero hero1 = new ManRay (0, "Gennichiro");
        System.out.println("===============================");
	hero1.identity();
	hero1.showPowers();
        System.out.println("===============================");
        SuperHero hero2 = new FlyingDutchMan (255, "Shirai");
        System.out.println("===============================");
	hero2.identity();
	hero2.showPowers();
        System.out.println("===============================");
	SuperHero hero3 = new ManRay (553, "Gyoubu Masataka Oniwa");
        System.out.println("===============================");
	hero3.identity();
	hero3.showPowers();
        System.out.println("===============================");
	SuperHero hero4 = new DirtyBubble (666, "Arnastria");
        System.out.println("===============================");
	hero4.identity();
	hero4.showPowers();
        System.out.println("===============================");
        SuperHero hero5 = new FlyingDutchMan (36556, "Tenari");
        System.out.println("===============================");
	hero5.identity();
	hero5.showPowers();
        System.out.println("===============================");
    }
}