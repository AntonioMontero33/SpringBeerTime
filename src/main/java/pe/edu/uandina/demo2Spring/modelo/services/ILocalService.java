package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Local;

import java.util.List;

public interface ILocalService {
    public List<Local> findAll();
    public Local findById(Long id);
    public Local save(Local local);
    public void delete(Long id);
}
