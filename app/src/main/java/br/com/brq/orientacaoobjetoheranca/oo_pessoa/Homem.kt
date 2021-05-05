package br.com.brq.orientacaoobjetoheranca.oo_pessoa

class Homem (
        open override val nome: String,
        open override val telefone: String
) : Pessoa(nome, telefone){

}