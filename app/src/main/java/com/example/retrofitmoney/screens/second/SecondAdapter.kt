package com.example.retrofitmoney.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmoney.R
import com.example.retrofitmoney.model.beznal.BeznalItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    var listSecond = emptyList<BeznalItem>()

    class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondAdapter.SecondViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondAdapter.SecondViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    override fun onBindViewHolder(holder: SecondAdapter.SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].ccy
        holder.itemView.item_buy.text = listSecond[position].buy
        holder.itemView.item_sale.text = listSecond[position].sale
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<BeznalItem>) {
        listSecond = list
        notifyDataSetChanged()
    }
}