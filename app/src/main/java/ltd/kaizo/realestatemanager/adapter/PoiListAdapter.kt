package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ltd.kaizo.realestatemanager.R

class PoiListAdapter(private val poiList: List<String>,  private val sourceId:Int
    ):RecyclerView.Adapter<PoiListAdapter.PoiListViewHolder>() {

private lateinit var poiStringArray:Array<String>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoiListViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_poi_list, parent, false)
        poiStringArray = parent.context.resources.getStringArray(R.array.typeArray)
        return PoiListViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return poiList.size
    }

    override fun onBindViewHolder(holder: PoiListViewHolder, position: Int) {
        val poi = poiList[position]
        for (poiString in poiStringArray) {
            if (poi == poiString) {
                with(holder) {
                    nameItem.text = poi
                    pictureItem.setImageResource(getDrawableFromName(poi))

                }
            }
        }

    }

    private fun getDrawableFromName(poi: String): Int {
        return when (poi) {
            poiStringArray[0] -> R.drawable.outline_school_black_48
            poiStringArray[1] -> R.drawable.outline_local_hospital_black_48
            poiStringArray[2] -> R.drawable.outline_restaurant_black_48
            poiStringArray[3] -> R.drawable.outline_shopping_cart_black_48
            poiStringArray[4] -> R.drawable.outline_attach_money_black_48
            poiStringArray[5] -> R.drawable.outline_fitness_center_black_48
            else -> R.drawable.ic_cross_24dp_white
        }
    }

    class PoiListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.poi_list_cardview)!!
        val pictureItem = itemView.findViewById<ImageView>(R.id.poi_item_imageview)!!
        val nameItem = itemView.findViewById<TextView>(R.id.poi_item_name_textview)!!
    }

}
