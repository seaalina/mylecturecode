package lv.alina.figure;

public class Rectangle {
private float length=1.0f;
private float width=1.0f;

public Rectangle(){
this.length =12.0f;
this.width=15.0f;

}

public Rectangle(float length, float width){
	this.length = length;
	this.width = width;
}

public Rectangle(float width) {
	this.length = 2.2f; //sheit var buut jebkurs skaitlis, jo veertiiba tiks njemta no augshas (rinda 8-9)
	this.width = width;
	
}

public float getLength() {
	return length;
}

public void setLength(float length) {
	this.length = length;
}

public float getWidth() {
	return width;
}

public void setWidth(float width) {
	this.width = width;
}
public String toString (){
return "Length: "+this.length+" width: "+width;
}
}
