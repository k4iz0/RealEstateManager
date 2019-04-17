package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.utils.Utils.formatNumberFromCurrency

class ListAdapter(
    private val estateList: List<Estate>,
    private val clickListener: (Estate) -> Unit
) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private var lastView:View? = null
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
        holder.cardView.setOnClickListener {
            clickListener(estate)
            lastView?.setBackgroundColor(getColor(it.context,android.R.color.white))

             it.apply {
                        setBackgroundColor(getColor(it.context,R.color.colorAccent))
                 lastView = it

             }



        }
        with(holder) {
            type.text = estate.type
            cardView.setBackgroundColor(getColor(cardView.context,android.R.color.white))
            location.text = estate.city.toUpperCase()
            price.text = formatNumberFromCurrency(estate.price)
//            if (read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_EURO) {
//                price.text = formatNumberToString(estate.price))
//                currencyEuro.visibility = View.VISIBLE
//                currencyDollar.visibility = View.GONE
//            } else {
//                price.text = formatNumberToString(convertEuroToDollar(estate.price))
//                currencyEuro.visibility = View.GONE
//                currencyDollar.visibility = View.VISIBLE
//            }
            if (estate.mainPicture != "") {
                Picasso.get().load(estate.mainPicture).into(picture)
            }
<<<<<<< HEAD
=======
            if (estate.mainPicture != "") {
                Picasso.get().load(estate.mainPicture).into(picture)
            }
>>>>>>> 4467aa526de47bd9335482f60ac9f9a0c2e23717
            if (estate.isSold) {
                soldState.visibility = View.VISIBLE
            } else {
                soldState.visibility = View.INVISIBLE
            }
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.list_cardview)!!
        val picture = itemView.findViewById<ImageView>(R.id.item_profile_picture)!!
        val type = itemView.findViewById<TextView>(R.id.item_type_textview)!!
        val location = itemView.findViewById<TextView>(R.id.item_location_textview)!!
        val price = itemView.findViewById<TextView>(R.id.item_price_textview)!!
        val soldState = itemView.findViewById<TextView>(R.id.picture_item_sold_textview)!!
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
