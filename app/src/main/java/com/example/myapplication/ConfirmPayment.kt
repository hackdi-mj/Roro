package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.PaymentConfirmBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ConfirmPayment : Fragment() {

    private var _binding: PaymentConfirmBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = PaymentConfirmBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_ConfirmPayment_to_PaymentMethod)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}