package domaci_zadaci.z03;

import java.io.IOException;

import domaci_zadaci.z03.menu.MainMenu;

public class Main {

	public static void main(String[] args) throws IOException {
		
		MainMenu mm = new MainMenu(Restoran.novi("Macchiato", "kod Limanskog parka"));
		mm.prikazi();
	}
}
