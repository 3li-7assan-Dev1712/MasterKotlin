package app.netlify.dev_ali_hassan.masterkotlin.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.netlify.dev_ali_hassan.masterkotlin.R

class AffirmationAdapter(private val affirmationList: List<Affirmation>): RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder> (){

    inner class AffirmationViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.affirmation_item_view, parent, false)
        return AffirmationViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {
        val affirmation = affirmationList[position]
        affirmation.apply {

        }
    }

    override fun getItemCount(): Int {
        return affirmationList.size
    }
}