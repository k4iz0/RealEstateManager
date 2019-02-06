package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.model.Estate

class ListAdapter(
    private val estateList: List<Estate>,
    private val listener: estateListListener) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>(), View.OnClickListener {

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

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val picture = itemView.findViewById<ImageView>(R.id.item_profile_picture)
        val type = itemView.findViewById<TextView>(R.id.item_type_textview)
        val location = itemView.findViewById<TextView>(R.id.item_location_textview)
        val price = itemView.findViewById<TextView>(R.id.item_price_textview)
    }
    interface estateListListener {
        fun onEstateSelected(estate: Estate)
    }
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.list_cardview -> listener.onEstateSelected(view.tag as Estate)
        }
    }
}
