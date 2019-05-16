package ltd.kaizo.realestatemanager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.RC_PICTURE_ITEM_DETAIL
import ltd.kaizo.realestatemanager.utils.RC_PICTURE_LISTENER_FAVORITE
import ltd.kaizo.realestatemanager.utils.RC_PICTURE_LISTENER_REMOVE
import ltd.kaizo.realestatemanager.utils.RC_PICTURE_LISTENER_VIEW
import timber.log.Timber

class PictureListAdapter(
    private val pictureList: List<EstatePhoto>,
    private val sourceId:Int,
    private val clickListener: (List<EstatePhoto>,Int, Int) -> Unit
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

        with(holder) {
            cardView.setOnClickListener { clickListener(pictureList, position,RC_PICTURE_LISTENER_VIEW) }
            nameItem.text = picture.name
            Picasso.get().load(picture.uri).into(pictureItem)
            if (sourceId == RC_PICTURE_ITEM_DETAIL) {
                heartBtn.visibility = View.INVISIBLE
                removeBtn.visibility = View.INVISIBLE
            } else {
                heartBtn.setOnClickListener { clickListener (pictureList,position, RC_PICTURE_LISTENER_FAVORITE) }
                removeBtn.setOnClickListener { clickListener (pictureList,position, RC_PICTURE_LISTENER_REMOVE) }

                when (picture.mainPicture) {
                    true -> heartBtn.setBackgroundResource(R.drawable.ic_heart_full_blue)
                    false -> heartBtn.setBackgroundResource(R.drawable.ic_heart_empty_blue)
                }
            }
        }
    }

    class PictureListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById<CardView>(R.id.picture_list_cardview)!!
        val pictureItem = itemView.findViewById<ImageView>(R.id.picture_item_list_photo)!!
        val nameItem = itemView.findViewById<TextView>(R.id.picture_item_list_name_textview)!!
        val heartBtn = itemView.findViewById<ImageButton>(R.id.picture_item_favorite_button)!!
        val removeBtn = itemView.findViewById<ImageButton>(R.id.picture_item_remove_button)!!
    }

}
