package com.example.picasso.touchbox.picassoexample.Project.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.picasso.touchbox.picassoexample.Project.Adapter.HomeListAdapter;
import com.example.picasso.touchbox.picassoexample.Project.Entity.EntityAlbum;
import com.example.picasso.touchbox.picassoexample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VinnY on 14/02/2015.
 */
public class HomeFragment extends Fragment {
    private ListView mListViewHome;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View convertView = inflater.inflate(R.layout.fragment_home,container,false);
        mListViewHome = (ListView) convertView.findViewById(R.id.list_view_home);
        HomeListAdapter adapter = new HomeListAdapter(getActivity(),this.mockData());
        mListViewHome.setAdapter(adapter);
        return convertView;
    }

    //Dados mockados
    public List<EntityAlbum> mockData(){
        List<EntityAlbum> list = new ArrayList<EntityAlbum>();
        for (int intLoop = 0; intLoop < 20; intLoop++){
            EntityAlbum entityAlbum = new EntityAlbum();
            entityAlbum.setArtistAlbum("Linkin Park");
            entityAlbum.setId((long) intLoop);
            entityAlbum.setLinkAlbumCover("http://bulllion.com/wp-content/uploads/2012/07/MUS086.jpg");
            entityAlbum.setName("Hybrid Theory");
            list.add(entityAlbum);
        }
        return list;
    }
}
