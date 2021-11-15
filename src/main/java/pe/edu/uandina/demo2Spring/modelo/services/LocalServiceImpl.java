package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.Local;
import pe.edu.uandina.demo2Spring.modelo.dao.ILocalDao;

import java.util.List;

public class LocalServiceImpl implements ILocalService{
    @Autowired
    private ILocalDao localDao;
    @Override
    public List<Local> findAll() {
        return (List<Local>) localDao.findAll();
    }
}
