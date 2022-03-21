package com.generation.todothabata.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.todothabata.R
import com.generation.todothabata.model.Tarefa

    class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){

        private var listTarefas = emptyList<Tarefa>()

        class TarefaViewHolder (view: View) : RecyclerView.ViewHolder(view){

            val textNome = view.findViewById<TextView>(R.id.nome)
            val textDescricao = view.findViewById<TextView>(R.id.descrição)
            val textResponsavel = view.findViewById<TextView>(R.id.responsável)
            val textData = view.findViewById<TextView>(R.id.data)
            val switchCardAtivo = view.findViewById<Switch>(R.id.switch1)
            val textCategoria = view.findViewById<TextView>(R.id.categoria)
            val buttonDeletar = view.findViewById<Button>(R.id.botaodeletar)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {

            val layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.card_layout_tarefa, parent, false)

            return TarefaViewHolder(layout)
        }

        //Onde vamos processar todos os dados da lista
        override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {

            val tarefa = listTarefas[position]

            holder.textNome.text = tarefa.nome
            holder.textDescricao.text = tarefa.descricão
            holder.textResponsavel.text = tarefa.responsavel
            holder.textData.text = tarefa.data
            holder.switchCardAtivo.isChecked = tarefa.status
            holder.textCategoria.text = tarefa.categoria

        }

        override fun getItemCount(): Int {
            return listTarefas.size
        }

        fun setLista(lista: List<Tarefa>){
            listTarefas = lista
            notifyDataSetChanged()
        }

    }

