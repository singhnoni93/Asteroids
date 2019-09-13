package com.mycompany.a2.GameCommands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class DeAccelerate extends Command{
	private GameWorld gw;
	
	public DeAccelerate(GameWorld gw) {
		super("DeAccelerate"); // command name
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.de_accelerate(); // call adding asteroid function from gameworld.java
	}
	
}