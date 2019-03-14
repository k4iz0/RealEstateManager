package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.model.Photo
import timber.log.Timber

class PictureListAdapter(
    private val pictureList: List<Photo>,
    private val clickListener: (Photo) -> Unit
) :
    RecyclerView.Adapter<PictureListAdapter.PictureListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureListViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.picture_item_list, parent, false)
        return PictureListViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return pictureList.size
    }

    override fun onBindViewHolder(holder: PictureListViewHolder, position: Int) {
        val picture = pictureList[position]
        holder.cardView.setOnClickListener { clickListener(picture) }
        with(holder) {
            nameItem.text = picture.name
            Timber.i("name = ${picture.name} et uri = ${picture.uri}")
            Picasso.get().load(picture.uri).into(pictureItem)
        }
    }

    class PictureListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.picture_list_cardview)!!
        val pictureItem = itemView.findViewById<ImageView>(R.id.picture_item_list_photo)!!
        val nameItem = itemView.findViewById<TextView>(R.id.picture_item_list_name_textview)!!
    }

}
