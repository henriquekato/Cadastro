package com.example.cadastro

class Formulario(val nome: String, val telefone: String, val email: String, val naListaEmail:
Boolean, val sexo:
String, val cidade: String, val uf: String) {
    override fun toString(): String {
        return StringBuilder()
            .append("Nome: ").append(nome).append("\n")
            .append("Telefone: ").append(telefone).append("\n")
            .append("Email: ").append(email).append("\n")
            .append("Na lista de email: ").append(naListaEmail).append("\n")
            .append("Sexo: ").append(sexo).append("\n")
            .append("Cidade: ").append(cidade).append("\n")
            .append("UF: ").append(uf)
            .toString()
    }
}