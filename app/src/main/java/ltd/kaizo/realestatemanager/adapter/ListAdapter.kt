package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_fragment.view.*
import ltd.kaizo.realestatemanager.R

class ListAdapter(): RecyclerView.Adapter<ListViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewholder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent,false)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ListViewholder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}