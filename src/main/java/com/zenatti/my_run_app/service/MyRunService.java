package com.zenatti.my_run_app.service;

import com.zenatti.my_run_app.entity.Atividade;
import com.zenatti.my_run_app.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MyRunService {

    private AtividadeRepository atividadeRepository;

    public MyRunService(AtividadeRepository atividadeRepository) {
        this.atividadeRepository = atividadeRepository;
    }

    public Atividade get(Long id){
        return atividadeRepository.findById(id).orElse(null);
    }

    public List<Atividade> list(){
        Sort sort = Sort.by("data").descending();
        return atividadeRepository.findAll(sort);
    }

    public void create(Atividade atividade){
        atividadeRepository.save(atividade);
    }

    public void delete(Long id){
        atividadeRepository.deleteById(id);
    }

    public void update(Atividade atividade){
        atividadeRepository.save(atividade);
    }
}
