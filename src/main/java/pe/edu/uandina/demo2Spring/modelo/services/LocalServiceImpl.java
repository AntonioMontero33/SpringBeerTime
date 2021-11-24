package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Local;
import pe.edu.uandina.demo2Spring.modelo.dao.ILocalDao;

import java.util.List;


@Service
public class LocalServiceImpl implements ILocalService{
    @Autowired
    private ILocalDao localDao;
    @Override
    @Transactional(readOnly = true)
    public List<Local> findAll() {
        return (List<Local>) localDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Local findById(Long id) {
        return localDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Local save(Local local) {
        return localDao.save(local);
    }

    @Override
    public void delete(Long id) {
        localDao.deleteById(id);
    }
}
