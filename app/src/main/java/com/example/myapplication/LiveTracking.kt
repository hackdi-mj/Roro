package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.TrackingLiveBinding
import com.google.android.material.bottomsheet.BottomSheetDialog



class LiveTracking : Fragment(){
    private var _binding: TrackingLiveBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = TrackingLiveBinding.inflate(inflater, container, false)
        return binding.root

    }
      override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

          binding.buttonDone.setOnClickListener { view->
              findNavController().navigate(R.id.action_LiveTracking_to_ConfirmPayment)
          }

        binding.BtnTracking.setOnClickListener {view->
            val dialog = BottomSheetDialog(this.requireContext())
            val view = layoutInflater.inflate(R.layout.dialog_bottom_sheet,null)
            dialog.setContentView(view)
            dialog.show()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}