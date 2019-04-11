package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.utils.RC_POI_ADD_ITEM

class PoiListAdapter(
    private val poiList: MutableList<String>,
    private var poiStringArray: Array<String>,
    private val sourceId: Int,
    private val clickListener: (String) -> Unit
) : RecyclerView.Adapter<PoiListAdapter.PoiListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoiListViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_poi_list, parent, false)
        return PoiListViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return if (sourceId == RC_POI_ADD_ITEM) {
            poiStringArray.size
        } else {
            poiList.size
        }
    }

    override fun onBindViewHolder(holder: PoiListViewHolder, position: Int) {
        if (sourceId == RC_POI_ADD_ITEM) {
            updateDataForPoiDialogFragment(position, holder)
        } else {
            updateUiForDetailFragment(position, holder)
        }
    }

    private fun updateDataForPoiDialogFragment(position: Int, holder: PoiListViewHolder) {
        val poi = poiStringArray[position]
        with(holder) {
            cardView.setOnClickListener { clickListener(poi) }
            nameItem.text = poi
            pictureItem.setImageResource(getDrawableFromName(poi))
            if (poiList.contains(poi))   pictureItem.alpha = 1f else   pictureItem.alpha = 0.5f

        }
    }

    private fun updateUiForDetailFragment(position: Int, holder: PoiListViewHolder) {
        val poi = poiList[position]
        for (poiString in poiStringArray) {
            if (poi == poiString) {
                with(holder) {
                    cardView.setOnClickListener { clickListener(poi) }
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

    /****************************
     *******   VIEWHOLDER   ******
     *****************************/

    class PoiListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.poi_list_cardview)!!
        val pictureItem = itemView.findViewById<ImageView>(R.id.poi_item_imageview)!!
        val nameItem = itemView.findViewById<TextView>(R.id.poi_item_name_textview)!!
    }

}
