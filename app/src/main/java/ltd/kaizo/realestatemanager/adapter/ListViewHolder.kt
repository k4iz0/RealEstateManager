package ltd.kaizo.realestatemanager.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ltd.kaizo.realestatemanager.R

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val picture = itemView.findViewById<ImageView>(R.id.item_profile_picture)
    val type = itemView.findViewById<TextView>(R.id.item_type_textview)
    val location = itemView.findViewById<TextView>(R.id.item_location_textview)
    val price = itemView.findViewById<TextView>(R.id.item_price_textview)

}