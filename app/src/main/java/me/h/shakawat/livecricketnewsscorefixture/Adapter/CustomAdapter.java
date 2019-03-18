package me.h.shakawat.livecricketnewsscorefixture.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import me.h.shakawat.livecricketnewsscorefixture.R;

public class CustomAdapter extends BaseExpandableListAdapter {


    private Context context;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;

    public CustomAdapter(Context context, List<String> listDataHeader,
                         HashMap<String, List<String>> listDataChild) {
        this.context = context;
        this.listDataHeader = listDataHeader;
        this.listDataChild = listDataChild;
    }

    @Override
    public int getGroupCount() {
        return listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listDataChild.get(listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }


    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String headerTxt = (String) getGroup(groupPosition);
        if (convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.group_layout,null);
        }
        TextView textView = convertView.findViewById(R.id.groupTxtId);
        textView.setText(headerTxt);
        return convertView;
    }


    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                             View convertView, ViewGroup parent) {

        String childText = (String) getChild(groupPosition,childPosition);

        if (convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_layout,null);
        }

        TextView textView = convertView.findViewById(R.id.childTxtId);
        textView.setText(childText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

