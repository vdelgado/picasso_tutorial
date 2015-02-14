package com.example.picasso.touchbox.picassoexample.Project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.picasso.touchbox.picassoexample.Project.Entity.EntityAlbum;
import com.example.picasso.touchbox.picassoexample.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by VinnY on 14/02/2015.
 */
public class HomeListAdapter extends BaseAdapter {

    private Context mContext;
    private List<EntityAlbum> mEntityAlbums;
    private LayoutInflater layoutInflater;

    public HomeListAdapter(Context context,List<EntityAlbum> entityAlbumList){
        mContext = context;
        mEntityAlbums = entityAlbumList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mEntityAlbums.size();
    }

    @Override
    public Object getItem(int position) {
        return mEntityAlbums.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mEntityAlbums.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= layoutInflater.inflate(R.layout.item_list_music, null);
        ViewHolder viewHolder = new ViewHolder(mContext,convertView);
        EntityAlbum entityAlbum = mEntityAlbums.get(position);
        Picasso.with(mContext).load(entityAlbum.getLinkAlbumCover()).into(viewHolder.imageViewCover);
        viewHolder.textViewName.setText(entityAlbum.getName());
        viewHolder.textViewAlbumName.setText(entityAlbum.getArtistAlbum());
        return convertView;
    }

    public class ViewHolder{
        private TextView textViewName;
        private ImageView imageViewCover;
        private TextView textViewAlbumName;

        public ViewHolder(Context context,View view){
            textViewName = (TextView) view.findViewById(R.id.text_view_artist_name);
            textViewAlbumName = (TextView) view.findViewById(R.id.text_view_album_name);
            imageViewCover = (ImageView) view.findViewById(R.id.image_view_album_cover);
        }
    }
}
