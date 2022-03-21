package com.generation.todothabata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.todothabata.adapter.TarefaAdapter
import com.generation.todothabata.model.Tarefa


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val listTarefas = mutableListOf(
            Tarefa(
                "Estudar",
                "Programação",
                "Thábata",
                "2022-21-03",
                true,
                "Dia a Dia"
            ),
            Tarefa(
                "Passear com a Lunna",
                "30 minutos",
                "Thábata",
                "2022-21-03",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Jogar o Lixo",
                "Terça Feira",
                "Thábata",
                "2022-21-03",
                true,
                "Limpeza"
            )
        )

        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        val adapterTarefa = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        recyclerTarefa.adapter = adapterTarefa

        recyclerTarefa.setHasFixedSize(true)

        adapterTarefa.setLista(listTarefas)

        return view
    }



}















