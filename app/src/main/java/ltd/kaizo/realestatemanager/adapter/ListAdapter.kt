package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.model.Estate

class ListAdapter(
    private val estateList: List<Estate>,
    private val clickListener: (Estate) -> Unit) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>(){

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
        holder.cardView.setOnClickListener{clickListener(estate)}
        with(holder) {
            type.text = estate.type
            location.text = estate.address
            price.text = estate.price.toString()
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.list_cardview)!!
        val picture = itemView.findViewById<ImageView>(R.id.item_profile_picture)!!
        val type = itemView.findViewById<TextView>(R.id.item_type_textview)!!
        val location = itemView.findViewById<TextView>(R.id.item_location_textview)!!
        val price = itemView.findViewById<TextView>(R.id.item_price_textview)!!
    }
//    interface EstateListListener {
//        fun onEstateSelected(estate: Estate)
//    }
//    override fun onClick(view: View?) {
//        when (view?.id) {
//            R.id.list_cardview -> listener?.onEstateSelected(estateList[view.id])
//        }
//    }
}
