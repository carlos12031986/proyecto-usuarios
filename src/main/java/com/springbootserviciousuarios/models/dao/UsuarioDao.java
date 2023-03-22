package com.springbootserviciousuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springbootserviciousuarios.models.entity.Usuario;

@RepositoryRestResource(path="users")
public interface UsuarioDao extends CrudRepository<Usuario,Long>{

	public Usuario findByUsername(String username);
}
