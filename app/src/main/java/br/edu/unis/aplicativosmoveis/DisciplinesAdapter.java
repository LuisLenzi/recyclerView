package br.edu.unis.aplicativosmoveis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DisciplinesAdapter extends RecyclerView.Adapter<DisciplinesAdapter.ViewHolder> {

    private List<Discipline> disciplines;

    public DisciplinesAdapter(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @NonNull
    @Override
    public DisciplinesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
            .from(parent.getContext())
            .inflate(R.layout.disciplines_itens, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Discipline discipline = this.disciplines.get(position);
        holder.bind(discipline);
    }

    @Override
    public int getItemCount() {
        return this.disciplines.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Discipline discipline) {
            TextView txtName = itemView.findViewById(R.id.txt_disciplines_name);
            TextView txtCourse = itemView.findViewById(R.id.txt_disciplines_course);
            TextView txtStage = itemView.findViewById(R.id.txt_disciplines_stage);
            LinearLayout linearLayout = itemView.findViewById(R.id.linear_disciplines_item);

            txtName.setText(discipline.getName());
            txtCourse.setText(discipline.getCourse());
            txtStage.setText(discipline.getStage());
            linearLayout.setBackgroundResource(discipline.getBackgroundColor());
        }
    }
}
