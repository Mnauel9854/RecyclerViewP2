package com.manuelrosado.equipo4recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    private var listAdapter: MutableList<dtProductos> = mutableListOf()
    private lateinit var  recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listAdapter.add(dtProductos("01", "Tortillas, sirven para hacer un taco", "$25 Precio al Menudeo","$15 Precio al Mayoreo",   "https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/Tortillas.jpg?alt=media&token=e089a50a-c9d4-48e2-bb0f-c27d2a7815f4"));
        listAdapter.add(dtProductos("02", "Plumas", "$60 Precio al Menudeo","$55 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/Pluma-bic.png?alt=media&token=1b9f6bbc-dccf-48ab-acc6-4df8218444fa"));
        listAdapter.add(dtProductos("03", "Lapices", "$100 Precio al Menudeo","$70 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/descargar.jpeg?alt=media&token=baa122f5-c4da-4f51-b17f-bece343e5050"));
        listAdapter.add(dtProductos("04", "Colores", "$80 Precio al Menudeo","$75 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/colores.png?alt=media&token=20276db6-2509-45d2-bf9a-72290ceb6e4d"));
        listAdapter.add(dtProductos("05", "Borradores", "$60 Precio al Menudeo","$50 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/colores.png?alt=media&token=20276db6-2509-45d2-bf9a-72290ceb6e4d"));
        listAdapter.add(dtProductos("06", "Cuardernos", "$380 Precio al Menudeo","$270 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/cuadernos.jpeg?alt=media&token=0b700e46-6a85-460f-993d-a9b650bc37d6"));
        listAdapter.add(dtProductos("07", "Carpetas", "$200 Precio al Menudeo","$150 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/carpetas.png?alt=media&token=3f035bcf-091d-4552-9ab7-3d7dbedfc706"));
        listAdapter.add(dtProductos("08", "Paquete de Hojas blancas", "$540 Precio al Menudeo","$350 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/hojas%20blancas.jpeg?alt=media&token=9baa7fad-ae5a-4235-b240-92adf088bb66"));
        listAdapter.add(dtProductos("09", "Paquete de Cubre bocas", "$15 Precio al Menudeo","$50 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/cubrebocas.jpeg?alt=media&token=129329cc-5289-4abe-b8ef-0278b33b269c"));
        listAdapter.add(dtProductos("10", "Peluches", "$650 Precio al Menudeo","$480 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/png-clipart-teddy-bear-graphy-stuffed-animals-cuddly-toys-bear-child-animals-thumbnail.png?alt=media&token=43db2a81-987c-4c82-ad92-8fc7f34ee720"));
        listAdapter.add(dtProductos("11", "Tijeras", "$80 Precio al Menudeo","$75 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/png-transparent-scissors-hair-cutting-shears-scissor-angle-technic-cartoon.png?alt=media&token=ed43e855-480d-4931-84e7-0b911d2b51bc"));
        listAdapter.add(dtProductos("12", "Kilo de jamón de pavo cocido", "$75 Precio al Menudeo","$68 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/jamon.jpeg?alt=media&token=15a35566-c8dd-43c5-b5a7-7445c6052e59"));
        listAdapter.add(dtProductos("13", "Kilo de jamón de pavo americano", "$85 Precio al Menudeo","$78 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/imagnes-3f620.appspot.com/o/images.jpeg?alt=media&token=c213492e-fa62-4eef-bbe5-dae7324a80e7"));
        listAdapter.add(dtProductos("14", "Kilo de chorizo", "$75 Precio al Menudeo","$68 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/leoputo-cb1bd.appspot.com/o/WhatsApp-Image-2022-07-20-at-10.36.14-AM.jpeg?alt=media&token=a44823a0-9ebf-41c4-a231-6439f997bdf9"));
        listAdapter.add(dtProductos("15", "Kilo de longaniza", "$85 Precio al Menudeo","$78 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/leoputo-cb1bd.appspot.com/o/WhatsApp-Image-2022-07-20-at-10.36.14-AM.jpeg?alt=media&token=a44823a0-9ebf-41c4-a231-6439f997bdf9"));
        listAdapter.add(dtProductos("16", "Kilo de arrachera", "$230 Precio al Menudeo","$210 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/leoputo-cb1bd.appspot.com/o/WhatsApp-Image-2022-07-20-at-10.36.14-AM.jpeg?alt=media&token=a44823a0-9ebf-41c4-a231-6439f997bdf9"));
        listAdapter.add(dtProductos("17", "Kilo de chistorra", "$140 Precio al Menudeo","$120 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/leoputo-cb1bd.appspot.com/o/WhatsApp-Image-2022-07-20-at-10.36.14-AM.jpeg?alt=media&token=a44823a0-9ebf-41c4-a231-6439f997bdf9"));
        listAdapter.add(dtProductos("18", "Kilo de chorizo argentino", "$60 Precio al Menudeo","$55 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/leoputo-cb1bd.appspot.com/o/WhatsApp-Image-2022-07-20-at-10.36.14-AM.jpeg?alt=media&token=a44823a0-9ebf-41c4-a231-6439f997bdf9"));
        listAdapter.add(dtProductos("19", "Kilo de bistec de puerco", "$70 Precio al Menudeo","$65 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/leoputo-cb1bd.appspot.com/o/WhatsApp-Image-2022-07-20-at-10.36.14-AM.jpeg?alt=media&token=a44823a0-9ebf-41c4-a231-6439f997bdf9"));
        listAdapter.add(dtProductos("20", "Kilo de salchicha de pavo", "$150 Precio al Menudeo","$135 Precio al Mayoreo","https://firebasestorage.googleapis.com/v0/b/leoputo-cb1bd.appspot.com/o/WhatsApp-Image-2022-07-20-at-10.36.14-AM.jpeg?alt=media&token=a44823a0-9ebf-41c4-a231-6439f997bdf9"));






        var tabla =findViewById<RecyclerView>(R.id.TablaProductos)
        recycler=tabla
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter=ProductosAdapter(this,listAdapter)
    }
}