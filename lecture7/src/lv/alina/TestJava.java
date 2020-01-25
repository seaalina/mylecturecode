package lv.alina;

import lv.alina.geometricfigures.Circle;
import lv.alina.player.FootballPlayer;

public class TestJava {

	
	public static void main(String[] args) {
	FootballPlayer player = new FootballPlayer("Messi", "Forward",7, true,184,83); //konstruktors
Circle figure = new Circle();

System.out.println(figure.getColor()+" "+figure.getRadius());
	
	
System.out.println(player.getName());
System.out.println(player.getPosition());
System.out.println(player.getShirtNumber());
System.out.println(player.isBuild());
System.out.println(player.getHeight());
System.out.println(player.getWeight());


player.setShirtNumber(10); //veertiibas setup
System.out.println("*************");
System.out.println(player.getName());
System.out.println(player.getPosition());
System.out.println(player.getShirtNumber());
System.out.println(player.isBuild());
System.out.println(player.getHeight());
System.out.println(player.getWeight());
	}

}
