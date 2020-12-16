package pe.examen.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.examen.dao.ProductoDao;
import pe.examen.entity.Producto;
import pe.examen.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
@Autowired
private ProductoDao productoDao;
	@Override
	public int create(Producto r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}

}
