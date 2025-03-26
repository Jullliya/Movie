package dev.jullls.movieapp.presentation.ui.search_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import dev.jullls.movieapp.R
import dev.jullls.movieapp.databinding.FragmentSearchBinding
import dev.jullls.movieapp.domain.model.Film

class SearchFragment : Fragment(R.layout.fragment_search) {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    private val filmListSearch = listOf(
        Film(
            1,
            R.drawable.film_1,
            "Experience the Serenity of Japan's Traditional Countryside",
            "Technology"
        ),
        Film(
            2,
            R.drawable.film_1,
            "Discovering the Magic of Paris: A Journey through",
            "Technology"
        ),
        Film(
            3,
            R.drawable.film_1,
            "Experience the Serenity of Japan's Traditional Countryside",
            "Technology"
        ),
        Film(
            4,
            R.drawable.film_1,
            "Discovering the Magic of Paris: A Journey through",
            "Technology"
        ),
        Film(
            5,
            R.drawable.film_1,
            "Experience the Serenity of Japan's Traditional Countryside",
            "Technology"
        ),
        Film(
            6,
            R.drawable.film_1,
            "Discovering the Magic of Paris: A Journey through",
            "Technology"
        ),
        Film(
            7,
            R.drawable.film_1,
            "Experience the Serenity of Japan's Traditional Countryside",
            "Technology"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setupListeners()
    }

    private fun setupListeners() {
//        with(binding) {
//            btnMenuExploreFragmentHome.setOnClickListener {
//                findNavController().navigate(R.id.action_navigation_bookmark_to_navigation_explore)
//            }
//            btnMenuBookmarkFragmentHome.setOnClickListener{
//                findNavController().navigate(R.id.action_navigation_home_to_navigation_bookmark)
//            }
//        }
    }

    private fun setupUI(){
        setupRecyclerFilmsSearch()
    }

    private fun setupRecyclerFilmsSearch(){
        with(binding) {
            rvFilms.setHasFixedSize(true)
            rvFilms.layoutManager =
                GridLayoutManager(requireContext(), 2)
            rvFilms.adapter = FilmSearchFragmentAdapter(filmListSearch)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}