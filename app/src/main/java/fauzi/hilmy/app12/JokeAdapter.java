package fauzi.hilmy.app12;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 26FaUZeE02 on 4/26/18.
 */

public class JokeAdapter extends RecyclerView.Adapter<JokeAdapter.MyViewHolder> {

    private Context context;
    private List<Joke> arrayList;
    private MainActivity mainActivity;

    public JokeAdapter(MainActivity mainActivity, List<Joke> arrayList) {
        this.mainActivity = mainActivity;
        this.arrayList = arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapterr, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Joke joke = arrayList.get(position);
        holder.txtSetup.setText(joke.getSetup());
        holder.txtType.setText("Type: " + joke.getType());
        holder.txtPunchLine.setText(joke.getPunchline());

        holder.btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.loadJson();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtSetup, txtType, txtPunchLine;
        Button btnOther;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtSetup = itemView.findViewById(R.id.txtSetup);
            txtType = itemView.findViewById(R.id.txtType);
            txtPunchLine = itemView.findViewById(R.id.txtPunch);
            btnOther = itemView.findViewById(R.id.btnOther);

        }
    }
}
