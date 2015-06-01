package com.bignerdranch.android.criminalintent;

import org.json.JSONException;
import org.json.JSONObject;

public class NewPhoto {
	
	private static final String JSON_FILENAME = "filename";
	
	private String mFilename;
	
	//create a photo representing an existing file on the disk
	public NewPhoto(String filename){
		mFilename = filename;
	}
	
	public NewPhoto(JSONObject json) throws JSONException{
		mFilename = json.getString(JSON_FILENAME);
	}
	
	public JSONObject toJSON() throws JSONException {
		JSONObject json = new JSONObject();
		json.put(JSON_FILENAME, mFilename);
		return json;
	}
	
	public String getFilename(){
		return mFilename;
	}

}
