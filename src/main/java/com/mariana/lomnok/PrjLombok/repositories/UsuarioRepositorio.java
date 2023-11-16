package com.mariana.lomnok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.lomnok.PrjLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}