package ir.dunijet.autismate.group1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.dunijet.autismate.databinding.Group1FragmentNameSelectionBinding

class NameSelectionFragment : Fragment() {
    private lateinit var binding: Group1FragmentNameSelectionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Group1FragmentNameSelectionBinding.inflate(layoutInflater)
        return binding.root
    }
}