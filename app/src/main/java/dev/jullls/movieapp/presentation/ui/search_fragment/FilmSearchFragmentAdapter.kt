package dev.jullls.movieapp.presentation.ui.search_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.jullls.movieapp.R
import dev.jullls.movieapp.databinding.ItemFilmBinding
import dev.jullls.movieapp.domain.model.Film

class FilmSearchFragmentAdapter :
    ListAdapter<Film, FilmSearchFragmentAdapter.FilmViewHolder>(FilmDiffCallback()) {

    class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemFilmBinding.bind(view)

        fun bind(film: Film) {
            with(binding) {
                film.getPosterUrl()?.let { url ->
                    Glide.with(ivItemPoster.context)
                        .load(url)
                        .placeholder(R.drawable.poster_placeholder)
                        .into(ivItemPoster)
                }

                tvItemName.text = film.name ?: "Название неизвестно"
                tvItemYear.text = film.year ?: "Год неизвестен"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_film, parent, false
        )
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class FilmDiffCallback : DiffUtil.ItemCallback<Film>() {
    override fun areItemsTheSame(oldItem: Film, newItem: Film): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Film, newItem: Film): Boolean {
        return oldItem == newItem
    }
}