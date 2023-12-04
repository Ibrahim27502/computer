package org.computer;


public class Desktop extends Computer {
	public void desktopSize() {
	System.out.println("desktop size was 13 inches");
	}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.computerModel();
	d.desktopSize();
}
}
