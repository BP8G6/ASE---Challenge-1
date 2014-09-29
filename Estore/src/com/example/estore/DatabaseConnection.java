package com.example.estore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseConnection extends SQLiteOpenHelper {

	public DatabaseConnection(Context context, String name,CursorFactory factory, int version) {
		super(context, name, factory, version);		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(RegisterAdapter.DATABASE_CREATE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w("TaskDBAdapter", "Upgrading from version " +oldVersion + " to " +newVersion + ", which will destroy all old data"); 
		db.execSQL("DROP TABLE IF EXISTS " + "TEMPLATE"); 
		onCreate(db);
		
	}

}
