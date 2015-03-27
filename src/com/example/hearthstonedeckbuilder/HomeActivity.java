package com.example.hearthstonedeckbuilder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}
	
	public void deckCreationOnClickListener(View v)
	{
		Button button = (Button)findViewById(R.id.deckCreationButton);
		
		Intent intent = new Intent(this, ClassChoosingActivity.class);
		startActivity(intent);
	}
	
	public void cardsCollectionOnClickListener(View v)
	{
		Intent intent = new Intent(this, CardsCollectionActivity.class);
		startActivity(intent);
	}
	
	public void myDecksOnClickListener(View v)
	{
		Intent intent = new Intent(this, MyDecksActivity.class);
		startActivity(intent);
	}
}
