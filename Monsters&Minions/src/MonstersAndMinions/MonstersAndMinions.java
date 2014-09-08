package MonstersAndMinions;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.openal.AL;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;


public class MonstersAndMinions
{
	private final int SCREEN_WIDTH = 1280; //1280 
		public int getScreenWidth() {return SCREEN_WIDTH;}
	private final int SCREEN_HEIGHT = 720; //720
		public int getScreenHeight() {return SCREEN_HEIGHT;}
	
	private MonstersAndMinions()
	{
		try
		{
			//Init Display
			Display.setDisplayMode(new DisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT));
			Display.setTitle("SUPER MECHZ 10000");
			Display.create();
			//Init OpenAL
			AL.create();
		}
		catch(Exception e){}
		
		//Init OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, SCREEN_WIDTH, SCREEN_HEIGHT, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
	}
}
