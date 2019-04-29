package ie.tudublin;

import processing.data.TableRow;

public class Title{
    
    public String title;


	public Title(TableRow row) {
        title = row.getString("greeting");
	}

}