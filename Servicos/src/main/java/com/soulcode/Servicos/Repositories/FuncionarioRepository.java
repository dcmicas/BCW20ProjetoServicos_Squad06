package com.soulcode.Servicos.Repositories;

import com.soulcode.Servicos.Models.Cargo;
import com.soulcode.Servicos.Models.Chamado;
import com.soulcode.Servicos.Models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    Optional<Funcionario> findByEmail(String email);

    @Query(value = "SELECT * FROM funcionario WHERE foto is null",nativeQuery = true )
    List<Object> funcionarioSemFoto();


    List<Funcionario> findByCargo(Optional<Cargo> cargo);

    @Query(value = "SELECT funcionario.*\n" +
            "FROM funcionario\n" +
            "LEFT JOIN chamado ON chamado.id_funcionario = funcionario.id_funcionario\n" +
            "WHERE chamado.id_funcionario IS NULL",nativeQuery = true )
    List<Funcionario> findFuncSemChamado();

    @Query(value = "SELECT COUNT(funcionario.id_cargo) as QUANTIDADE, cargo.nome\n" +
            "FROM funcionario \n" +
            "LEFT JOIN cargo\n" +
            "\tON funcionario.id_cargo = cargo.id_cargo\n" +
            "GROUP BY funcionario.id_cargo", nativeQuery = true)
    List<Object> FuncionariosQtdPeloCargo();

}
