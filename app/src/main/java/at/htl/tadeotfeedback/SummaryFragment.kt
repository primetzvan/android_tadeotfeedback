package at.htl.tadeotfeedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import at.htl.tadeotfeedback.databinding.FragmentSummaryBinding
import at.htl.tadeotfeedback.databinding.FragmentWelcomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SummaryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SummaryFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val binding: FragmentSummaryBinding = DataBindingUtil.inflate(
      inflater, R.layout.fragment_summary, container, false
    )
    binding.btnEnd2.setOnClickListener { view ->
      view
        .findNavController()
        .navigate(R.id.action_summaryFragment_to_welcomeFragment)
    }
    // Inflate the layout for this fragment
    return binding.root
  }

}
