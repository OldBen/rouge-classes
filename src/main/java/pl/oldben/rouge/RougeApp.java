package pl.oldben.rouge;


import org.newdawn.slick.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RougeApp extends BasicGame {
	private static final Logger LOGGER = LoggerFactory.getLogger(RougeApp.class);

	RougeApp(String gamename) {
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawString("Hello Slick", 50, 50);
	}

	public static void main(String[] args) {
		try {
			AppGameContainer appgc = new AppGameContainer(new RougeApp("Simple Slick Game"));
			appgc.setDisplayMode(640, 480, false);
			appgc.start();

		} catch (SlickException ex) {
			LOGGER.error("Cannot start application", ex);

		}
	}
}
