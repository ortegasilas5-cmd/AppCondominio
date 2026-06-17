package com.example.appcondominio
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MuralAdpater (private  val comunicados : List<String>) : RecyclerView.Adapter<MuralAdpater.MuralViewHolder>(){

    class MuralViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.textViewlistareserva)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        p1: Int
    ): MuralAdpater.MuralViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mural, parent, false)
        return MuralViewHolder(view)
    }

    override fun onBindViewHolder(holder: MuralAdpater.MuralViewHolder, position: Int) {
        val comunica = comunicados[position]
        holder.titulo.text = comunica

    }

    override fun getItemCount(): Int {
        return comunicados.size
    }
}