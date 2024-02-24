package com.manuelrosado.equipo4recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductosAdapter (var context: Context, var ListaProducto:MutableList<dtProductos>) :
    RecyclerView.Adapter<ProductosAdapter.vHolder>(){inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    lateinit var txtid: TextView
    init{
        txtid=itemView.findViewById(R.id.txtIDDEPRODUCTO)
    }
    lateinit var txtdescripción: TextView
    init{
        txtdescripción=itemView.findViewById(R.id.txtDESCRIPCION)
    }
    lateinit var txtpreciomenudeo: TextView
    init{
        txtpreciomenudeo=itemView.findViewById(R.id.txtPRECIOMENUDEO)
    }
    lateinit var txtpreciomayoreo: TextView
    init{
        txtpreciomayoreo=itemView.findViewById(R.id.txTPRECIOMAYOREO)
    }
    lateinit var txtimagen: ImageView
    init{
        txtimagen=itemView.findViewById(R.id.imagen)
    }
}

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): ProductosAdapter.vHolder {
        var itemView= LayoutInflater.from(context).inflate(
            R.layout.productos,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaProducto.size
    }

    override fun onBindViewHolder(holder:  ProductosAdapter.vHolder, position: Int) {
        var id =ListaProducto[position]
        holder.txtid.text=id.id
        holder.txtdescripción.text=id.descripcion
        holder.txtpreciomenudeo.text=id.preciopormenudeo
        holder.txtpreciomayoreo.text=id.preciopormayoreo
        Picasso.get().load(id.url).into(holder.txtimagen)
    }
}