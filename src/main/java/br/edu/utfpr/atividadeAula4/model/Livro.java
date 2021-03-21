package br.edu.utfpr.atividadeAula4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O campo 'Título' deve ser preenchido")
    @NotNull(message = "O campo 'Título' deve ser preenchido")
    @Column(length = 100)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "editora_id", referencedColumnName = "id")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Autor autor;

    @NotNull(message = "O campo 'Ano' deve ser preenchido")
    @Column
    private Integer ano;

    @NotEmpty(message = "O campo 'ISBN' deve ser preenchido")
    @NotNull(message = "O campo 'ISBN' deve ser preenchido")
    @Column
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private Cidade cidade;

    @NotNull(message = "O campo 'Valor' deve ser preenchido")
    @Column
    private Double valor;


}
