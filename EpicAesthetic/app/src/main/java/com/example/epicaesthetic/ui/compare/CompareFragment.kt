package com.example.epicaesthetic.ui.compare

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.epicaesthetic.R

class CompareFragment : Fragment() {

    companion object {
        fun newInstance() = CompareFragment()
    }

    private lateinit var viewModel: CompareViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_compare, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CompareViewModel::class.java)
        // TODO: Use the ViewModel
    }

}