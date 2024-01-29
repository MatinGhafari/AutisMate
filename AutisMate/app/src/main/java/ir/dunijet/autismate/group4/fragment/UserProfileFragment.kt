package ir.dunijet.autismate.group4.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.dunijet.autismate.databinding.Group4FragmentUserProfileBinding

class UserProfileFragment :Fragment() {
    private lateinit var binding :Group4FragmentUserProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Group4FragmentUserProfileBinding.inflate(layoutInflater)
        return binding.root
    }
}