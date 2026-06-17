package com.example.appcondominio
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReservaAdpater (private  val reservas : List<String>) : RecyclerView.Adapter<ReservaAdpater.ReservaViewHolder>(){

    class ReservaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.textViewlistareserva)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        p1: Int
    ): ReservaAdpater.ReservaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_reserva, parent, false)
        return ReservaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReservaAdpater.ReservaViewHolder, position: Int) {
        val reserva = reservas[position]
        holder.titulo.text = reserva

    }

    override fun getItemCount(): Int {
        return reservas.size
    }
}