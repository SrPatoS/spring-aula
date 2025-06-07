package br.ufra.edu.aulanotasweb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface INotas extends JpaRepository<Nota, Long> {

}
