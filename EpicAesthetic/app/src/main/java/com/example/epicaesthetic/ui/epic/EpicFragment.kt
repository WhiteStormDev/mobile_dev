package com.example.epicaesthetic.ui.epic

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.epicaesthetic.R

class EpicFragment : Fragment() {

    companion object {
        fun newInstance() = EpicFragment()
    }

    private lateinit var viewModel: EpicViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_epic, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EpicViewModel::class.java)
        // TODO: Use the ViewModel
    }

}