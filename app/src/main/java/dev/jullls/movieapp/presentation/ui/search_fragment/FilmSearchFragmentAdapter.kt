package dev.jullls.movieapp.presentation.ui.search_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.movieapp.R
import dev.jullls.movieapp.databinding.ItemFilmBinding
import dev.jullls.movieapp.domain.model.Film

class FilmSearchFragmentAdapter(private val filmList: List<Film>) :
    RecyclerView.Adapter<FilmSearchFragmentAdapter.FilmViewHolder>() {

    class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemFilmBinding.bind(view)

        fun bind(film: Film) {
            with(binding) {
                ivItemPoster.setImageResource(film.image)
                tvItemName.text = film.name
                tvItemYear.text = film.year
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_film, parent, false
        )
        return FilmViewHolder(view)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val actor = filmList[position]
        holder.bind(actor)
    }
}
