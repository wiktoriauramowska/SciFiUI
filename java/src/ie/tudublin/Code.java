package ie.tudublin;

import processing.data.TableRow;

public class Code{
    
    public String code;


	public Code(TableRow row) {
        code = row.getString("code");
	}

}