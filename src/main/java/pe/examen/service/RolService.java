package pe.examen.service;

import java.util.List;
import java.util.Map;

import pe.examen.entity.Rol;

public interface RolService {
	int create(Rol r);
	int update(Rol r);
	int update(int id);
	int delete(int id);
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
