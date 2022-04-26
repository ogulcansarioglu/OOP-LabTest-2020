package ie.tudublin;

import processing.core.PApplet;

import java.util.ArrayList;
import ie.tudublin.task;
import processing.data.Table;
import processing.data.TableRow;




public class Gantt extends PApplet
{	
	ArrayList<task> tasks = new ArrayList<task>();
	

	
	public void settings()
	{
		size(800, 900);
	}

	public void loadTasks()
	{
		Table table = loadTable("tasks.csv", "header");
		for(TableRow r: table.rows()) 
	
		{

			task ts = new task(r);
			tasks.add(ts);
		}
	}

	public void printTasks()
	{
		for(task t: tasks) {
			System.out.println(t);
		}
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
	
		
	}
}
