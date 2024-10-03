package login.service;

import java.sql.SQLException;

import login.bean.Usuario;
import login.repository.UsuarioRepository;

public class UsuarioService {
	
	public boolean existeUsuario (Usuario usuario) throws SQLException
	{
		boolean existe = false;
			
			UsuarioRepository usuarioRepository = new UsuarioRepository();
			existe = usuarioRepository.existeUsuario(usuario);
		
		return existe;
	}
	
	public void insertarUsuario(Usuario usuario) throws SQLException {
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		usuarioRepository.insertarUsuario(usuario);
	}

}