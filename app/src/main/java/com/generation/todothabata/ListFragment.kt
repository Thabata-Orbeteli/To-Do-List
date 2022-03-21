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

       val view = return inflater.inflate(R.layout.fragment_list, container, false)


    val listTarefas = mutableListOf(
        Tarefa(
            "Estudar",
            "Iniciar na parte da noite",
            "Thábata",
            "2022-21-03",
            true,
            "Dia a Dia"
        ),
        Tarefa(
            "Passear com a Lunna",
            "Duas vezes por dia",
            "Thábata",
            "2022-21-03",
            false,
            "Dia a Dia"
        ),
        Tarefa(
            "Comprar chocolate",
            "Cacau Show",
            "Thábata",
            "2022-21-03",
            false,
            "Compras"
        )
    )

        val recyclerTarefa = view.findViewbyId<RecyclerView>(R.id.recyclerTarefa)

        val adapter = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        recyclerTarefa.adapter = adapter

        recyclerTarefa.setHasFixedSize(true)

        adapter.setLista(listTarefas)

        return view
}

}













