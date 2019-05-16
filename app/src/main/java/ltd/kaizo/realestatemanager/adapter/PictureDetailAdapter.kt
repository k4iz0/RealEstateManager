package ltd.kaizo.realestatemanager.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.model.EstatePhoto

class PictureDetailAdapter(
    private val pictureList: List<EstatePhoto>
) :
    RecyclerView.Adapter<PictureDetailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureDetailViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.picture_detail_item, parent, false)
        return PictureDetailViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return pictureList.size
    }

    override fun onBindViewHolder(holder: PictureDetailViewHolder, position: Int) {
        val picture = pictureList[position]

        with(holder) {
            nameItem.text = picture.name
            Picasso.get().load(picture.uri).into(pictureItem)
        }
    }
}

class PictureDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val pictureItem = itemView.findViewById<ImageView>(R.id.picture_detail_list_photo)!!
    val nameItem = itemView.findViewById<TextView>(R.id.picture_detail_list_name_textview)!!
}


