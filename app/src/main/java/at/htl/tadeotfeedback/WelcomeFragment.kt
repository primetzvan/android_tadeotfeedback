package at.htl.tadeotfeedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import at.htl.tadeotfeedback.databinding.FragmentWelcomeBinding
import kotlinx.android.synthetic.main.fragment_welcome.*

/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val binding: FragmentWelcomeBinding = DataBindingUtil.inflate(
      inflater, R.layout.fragment_welcome, container, false
    )
    binding.button.setOnClickListener { view ->
      view
        .findNavController()
        .navigate(R.id.action_welcomeFragment_to_questionFragment)
    }
    // Inflate the layout for this fragment
    return binding.root
  }
}
