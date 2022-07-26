package com.apolisrises.navigationgraphdemo.ui.employee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.apolisrises.navigationgraphdemo.R
import com.apolisrises.navigationgraphdemo.databinding.FragmentAddEmployeeBinding

class EmployeeFragment: Fragment() {
    lateinit var binding: FragmentAddEmployeeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddEmployeeBinding.inflate(inflater, container, false)
        val department = arguments?.getString("department") ?: "NA"
        binding.etDepartment.setText(department)
        return binding.root
    }
}