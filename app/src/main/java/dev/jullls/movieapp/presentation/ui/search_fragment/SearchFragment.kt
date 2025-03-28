package dev.jullls.movieapp.presentation.ui.search_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import dev.jullls.movieapp.R
import dev.jullls.movieapp.databinding.FragmentSearchBinding
import dev.jullls.movieapp.presentation.ui.vm.FilmsViewModel

class SearchFragment : Fragment(R.layout.fragment_search) {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FilmsViewModel by viewModels()
    private lateinit var adapter: FilmSearchFragmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setupObservers()
        viewModel.loadTop250()
    }

    private fun setupObservers() {
        viewModel.films.observe(viewLifecycleOwner) { films ->
            films?.let {
                adapter.submitList(it)
            }
        }
    }

    private fun setupUI() {
        setupRecyclerFilmsSearch()
    }

    private fun setupRecyclerFilmsSearch() {
        with(binding) {
            rvFilms.setHasFixedSize(true)
            rvFilms.layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = FilmSearchFragmentAdapter()
            rvFilms.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}