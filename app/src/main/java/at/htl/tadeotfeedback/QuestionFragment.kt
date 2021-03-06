package at.htl.tadeotfeedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import at.htl.tadeotfeedback.databinding.FragmentQuestionBinding
import at.htl.tadeotfeedback.databinding.FragmentWelcomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val binding: FragmentQuestionBinding = DataBindingUtil.inflate(
      inflater, R.layout.fragment_question, container, false
    )
    binding.btnNoAnswer.setOnClickListener { view ->
      view
        .findNavController()
        .navigate(R.id.action_questionFragment_to_noAnswerFragment)
    }
    // Inflate the layout for this fragment
    return binding.root
  }



}
