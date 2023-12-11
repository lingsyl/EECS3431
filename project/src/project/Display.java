package project;
import java.io.FileWriter;

public class Display {
	private int width;
	private int height;
	private String pictureName;
	//PPM export
	public Display() {
	}
	public Display(int width, int height,String pictureName) {
		this.width = width;
        this.height = height;
        this.pictureName = pictureName;
        
        try{
            FileWriter fw = new FileWriter("src/result/"+pictureName);
            fw.write("P3\n" + width + " " + height + "\n255\n");
            int index = 0;
            
            
            
        }catch (Exception e){
            System.out.println("wrong");
        }
	}
	

	
	
	
	
	
}

