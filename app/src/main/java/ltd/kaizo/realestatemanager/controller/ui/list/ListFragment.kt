package ltd.kaizo.realestatemanager.controller.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.list_fragment.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.ListAdapter
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.model.Estate

class ListFragment : Fragment() {

    companion object {
        fun newInstance() = ListFragment()
    }

    private lateinit var listViewModel: ListViewModel
    private lateinit var adapter: ListAdapter
    private lateinit var estateList: MutableList<Estate>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModelFactory = Injection.provideViewModelFactory(context!!)
        listViewModel = ViewModelProviders.of(this,viewModelFactory).get(ListViewModel::class.java)
        this.configureRecycleView()
        listViewModel.estateList.observe(viewLifecycleOwner, Observer { list ->
            updateList(list)
        })
    }

    private fun configureRecycleView() {
        estateList = mutableListOf()
        adapter = ListAdapter(estateList)
        list_fragment_recycle_view.layoutManager = LinearLayoutManager(context)
        list_fragment_recycle_view.adapter = adapter

    }


    private fun updateList(list: List<Estate>) {
        estateList.clear()
        estateList.addAll(list)
        adapter.notifyDataSetChanged()
    }

}
