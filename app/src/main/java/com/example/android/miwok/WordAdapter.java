package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TEFFAL AMINE on 12/06/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorRessourceId;
    private  int mAudioRessourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorRessourceId) {
        super(context, 0, words);
        mColorRessourceId=colorRessourceId;
    }

    public WordAdapter(Context context, ArrayList<Word> words, int colorRessourceId, int audioRessourceId) {
        super(context, 0, words);
        mColorRessourceId=colorRessourceId;
        mAudioRessourceId=audioRessourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        nameTextView.setText(currentWord.getMiwokTranslation());
        //nameTextView.setBackgroundColor(mColorRessourceId);

        nameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //nameTextView.setBackgroundColor(mColorRessourceId);

        nameTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.miwok_image);
        imageView.setBackgroundColor(mColorRessourceId);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageRessourceID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }



        //listItemView.setBackgroundColor(mColorRessourceId);
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorRessourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }

    public int getmAudioRessourceId() {
        return mAudioRessourceId;
    }
}
