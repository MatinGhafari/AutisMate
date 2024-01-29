package ir.dunijet.autismate.group4.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.dunijet.autismate.databinding.Group4FragmentDetailsItemHomeBinding

class DetailItemHomeFragment :Fragment() {
    private lateinit var binding: Group4FragmentDetailsItemHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Group4FragmentDetailsItemHomeBinding.inflate(layoutInflater)
        return binding.root
    }
}