package com.example.hearthstonedeckbuilder;

import java.util.List;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

public class CardsListAdapter implements ListAdapter{

	private List<Card> cardsList;
	private Context context;
	private OnClickListener itemClickListener;
	
	public CardsListAdapter (Context context, List<Card> cardslist, OnClickListener onclick)
	{
		this.context=context;
		this.cardsList=cardsList;
		this.itemClickListener=onclick;
	}
	
	@Override
	public int getCount() {
		
		return this.cardsList.size();
	}

	@Override
	public Object getItem(int position) {

		return this.cardsList.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemViewType(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressLint("NewApi")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView==null)
			convertView = LayoutInflater.from(this.context).inflate(R.layout.card_layout, parent, false);
		
		Card card = (Card) this.getItem(position);
		
		TextView manaView = (TextView) convertView.findViewById(R.id.manaCost);
		manaView.setText(card.getName());
		TextView nameView = (TextView) convertView.findViewById(R.id.cardName);
		nameView.setText(card.getName());
		@SuppressWarnings("deprecation")
		Drawable drawable = this.context.getResources().getDrawable(this.context.getResources().getIdentifier(card.getDrawableId(),"drawable",this.context.getPackageName()));
		nameView.setBackground(drawable);
		TextView amountView = (TextView) convertView.findViewById(R.id.cardNumber);
		amountView.setText(card.getName());
		
		return convertView;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		
		if (this.cardsList.size()==0)
				return true;
		return false;
	}

	@Override
	public void registerDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
