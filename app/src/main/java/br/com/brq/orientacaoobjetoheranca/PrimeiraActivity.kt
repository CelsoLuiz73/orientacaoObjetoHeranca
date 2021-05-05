package br.com.brq.orientacaoobjetoheranca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.brq.orientacaoobjetoheranca.oo_animal.Animal
import br.com.brq.orientacaoobjetoheranca.oo_animal.Cachorro
import br.com.brq.orientacaoobjetoheranca.oo_animal.Cavalo
import br.com.brq.orientacaoobjetoheranca.oo_animal.Gato
import br.com.brq.orientacaoobjetoheranca.oo_cor.Amarelo
import br.com.brq.orientacaoobjetoheranca.oo_cor.Azul
import br.com.brq.orientacaoobjetoheranca.oo_cor.Cor
import br.com.brq.orientacaoobjetoheranca.oo_pessoa.Homem
import br.com.brq.orientacaoobjetoheranca.oo_pessoa.Mulher
import br.com.brq.orientacaoobjetoheranca.oo_pessoa.Pessoa
import kotlin.time.measureTimedValue

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)

        val corAmarela = Amarelo (nome = "Amarelo Claro")
        val corAzul = Azul (nome = "Azul Escuro")

        pintar(corAmarela)
        pintar(corAzul)


        val cachorro = Cachorro("Billy")
        val gatoMalahado = Gato("Mingal")
        val gatoBranco = Gato("Nina")
        val cavalo = Cavalo("Pé-de-Pano")

        tomarBanho(cachorro)
        tomarBanho(gatoMalahado)
        tomarBanho(gatoBranco)
        tomarBanho(cavalo)

        val homem = Homem("Carlos", "99456-8765")
        val mulher = Mulher("Maria", "98765-9054")

        cadastrar(homem)
        cadastrar(mulher)

    }

    fun pintar(cor: Cor){
        println("Estou pintando um objeto com a cor: ${cor.nome}")
    }

    fun tomarBanho (animal: Animal){
        println("Dando banho no(a) meu pet, o nome dele(a) é  ${animal.nome}")
    }

    fun cadastrar (pessoa: Pessoa){
        println("A pessoa cadastrada é: ${pessoa.nome} telefone: ${pessoa.telefone}")
    }
}