package com.example.lab7_josephchan

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView


class QuestListAdapter(private val mList: ArrayList<Quest>,  private val listener: NavigateToQuestDetailsListener) :
    RecyclerView.Adapter<QuestListAdapter.ViewHolder>() {

    // Holds the views
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        //        val textView: TextView = itemView.findViewById(R.id.textView)
        val button: Button = itemView.findViewById(R.id.button_item_quest)
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_quests, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        mList[position].id?.let {
            holder.button.text = "QUEST ID: $it"
        }
        holder.button.setOnClickListener {
            listener.onNavigateToQuestDetails(mList[position])
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }



}