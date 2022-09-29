package ni.edu.uca.recarga

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.recarga.databinding.ItemListBinding
import java.util.ArrayList

class RecargaAdapter(val arrayList: ArrayList<Recarga>): RecyclerView.Adapter<RecargaAdapter.RecargaHolder>() {
    inner class RecargaHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun load(recarga: Recarga) {
            this.binding.tvNumber.text = recarga.number
            this.binding.tvMonto.text = recarga.monto.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecargaHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecargaHolder(binding)
    }

    override fun onBindViewHolder(holder: RecargaHolder, position: Int) {
        holder.load(this.arrayList[position])
    }

    override fun getItemCount(): Int {
        return this.arrayList.size
    }
}