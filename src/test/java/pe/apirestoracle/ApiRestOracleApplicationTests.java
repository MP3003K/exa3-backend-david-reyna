package pe.apirestoracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.examen.dao.AccesosDao;
import pe.examen.dao.UsuarioDao;

@SpringBootTest
class ApiRestOracleApplicationTests {
@Autowired
AccesosDao pdao;
@Autowired
UsuarioDao pdao2;
@Autowired
PasswordEncoder passwordEncoder;
@Test
void contextLoads() {
	//System.out.println(passwordEncoder.encode("1234"));
	System.out.println(pdao2.validarUsuario("dreyna"));
}		
}
