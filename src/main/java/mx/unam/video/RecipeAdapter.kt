package mx.unam.video

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

import mx.unam.R

class RecipeAdapter(
    context: Context,
    private val list: ArrayList<Modelo>
) : BaseAdapter() {

    private var inflater: LayoutInflater =
        LayoutInflater.from(context)

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        val view =
            inflater.inflate(
                R.layout.list_item_row,
                parent,
                false
            )

        val file: TextView =
            view.findViewById(R.id.title)

        val image: ImageView =
            view.findViewById(R.id.image_pel)

        file.text = list[position].nameFile
        image.setImageResource(list[position].nameImage)

        return view
    }
}