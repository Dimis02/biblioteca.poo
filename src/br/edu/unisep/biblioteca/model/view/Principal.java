package br.edu.unisep.biblioteca.view;

import br.edu.unisep.biblioteca.model.model.Autor;
import br.edu.unisep.biblioteca.model.model.Emprestimo;
import br.edu.unisep.biblioteca.model.model.Livro;
import br.edu.unisep.biblioteca.model.model.Usuario;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setId(1);
        livro.setTitulo("As aventuras de PI");
        livro.setAutor("Demitre Andrejov");
        livro.setEditora("Tim Squyres");
        livro.setGenero("Aventura");
        livro.setDataPublicacao("28/09/2012");

        Autor autor = new Autor();

        autor.setId(1);
        autor.setNome("Demitre Andrejov");
        autor.setIdade(" 18 Anos");
        autor.setLivros(" As aventuras de PI | As Altas Montanhas de Portugal ");

        Usuario usuario = new Usuario();

        usuario.setId(1);
        usuario.setNome("Ariel ");
        usuario.setEmail(" ariel@gmail.com");
        usuario.setCpf(" 707.070.707-07");
        usuario.setTelefone(" (46) 666-333");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setIdEmprestimo(1);
        emprestimo.setNomeEmprestimo("Ariel");
        emprestimo.setDataEmprestimo("27/09/2024");
        emprestimo.setHoraEmprestimo("17:07");
        emprestimo.setDiaRetornoEmprestimo("20/10/2024");
        emprestimo.setDescEmprestimo("As aventuras de PI");

        JOptionPane.showMessageDialog(null, emprestimo + livro.toString() + autor.toString() + emprestimo.toString());

    }
}


