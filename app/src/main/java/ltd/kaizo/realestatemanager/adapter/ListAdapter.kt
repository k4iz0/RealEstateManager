package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.model.Estate

class ListAdapter(private val estateList: List<Estate>) : RecyclerView.Adapter<ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ListViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return estateList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val estate = estateList[position]
        with(holder) {
            type.text = estate.type
            location.text = estate.address
            price.text = estate.price.toString()
        }
    }
}