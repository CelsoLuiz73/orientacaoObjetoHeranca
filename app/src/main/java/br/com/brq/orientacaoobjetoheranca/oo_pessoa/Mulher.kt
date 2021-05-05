package br.com.brq.orientacaoobjetoheranca.oo_pessoa

class Mulher(
        open override val nome: String,
        open override val telefone: String
) : Pessoa(nome, telefone) {
}