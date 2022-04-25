package com.example.externalpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewallrecyclerstruct.view.*

class vehicleAdapter (val context: Context, var arr:ArrayList<vehicle>)
    : RecyclerView.Adapter<vehicleAdapter.ViewHolder>()

{

    class ViewHolder(var view: View): RecyclerView.ViewHolder(view)
    {
        fun bind(f:vehicle)
        {
            view.txtStructVId.setText(f.v_Id.toString())
            view.txtStructVName.setText(f.v_Name)
            view.txtStructFPrice.setText(f.v_milage.toString())
            view.txtStructFQty.setText(f.v_capacity.toString())

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var inflater=LayoutInflater.from(parent.context)
        var view= inflater.inflate(R.layout.viewallrecyclerstruct,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(arr[position])
        holder.view.imgUpdate.setOnClickListener {
            if(context is ViewAllFruits)
            {
                context.Update(position)
            }
        }
        holder.view.imgDelete.setOnClickListener {
            if(context is ViewAllFruits)
            {
                context.Delete(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return arr.size
    }
}