package ltd.kaizo.realestatemanager.controller.ui.add


import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_add_picture_dialog.*

import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.databinding.FragmentAddPictureDialogBinding
import timber.log.Timber

class AddPictureDialogFragment : DialogFragment(), View.OnClickListener {
    private lateinit var binding: FragmentAddPictureDialogBinding
    private lateinit var parent: EstateActivity
    private lateinit var estateViewModel: EstateViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       this.configureDesign()
        return inflater.inflate(R.layout.fragment_add_picture_dialog, container, false)
    }

    private fun configureDesign() {
     dialog?.setTitle(getString(R.string.add_picture))

    }
    private fun configureViewModel() {
        parent = activity as EstateActivity
        estateViewModel = parent.estateViewModel
        binding.lifecycleOwner = this
        binding.estateViewModel = estateViewModel

    }

    override fun onClick(view: View?) {
        Timber.i("view = $view")
        when (view) {
            picture_pick_dialog_camera_btn -> Timber.i("click ! ")
            picture_name_dialog_cancel_button-> dialog?.dismiss()
        }
    }
}
