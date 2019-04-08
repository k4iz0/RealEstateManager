package ltd.kaizo.realestatemanager.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import ltd.kaizo.realestatemanager.R

class CustomInfoWindowAdapter(context: Context) : GoogleMap.InfoWindowAdapter {

    private val window: View = LayoutInflater.from(context).inflate(R.layout.custom_info_window, null)

    private fun rendowWindowText(marker: Marker, view: View) {
        val snippet = marker.snippet
        val tvSnippet = view.findViewById(R.id.custom_info_snippet) as TextView

        if (snippet != "") {
            tvSnippet.text = snippet
        }
    }

    override fun getInfoWindow(marker: Marker): View {
        rendowWindowText(marker, window)
        return window
    }

    override fun getInfoContents(marker: Marker): View {
        rendowWindowText(marker, window)
        return window
    }
}