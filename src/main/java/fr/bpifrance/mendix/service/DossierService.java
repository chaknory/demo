package fr.bpifrance.mendix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import fr.bpifrance.mendix.model.Dossier;
import fr.bpifrance.mendix.repository.DossierRepository;


@Service
public class DossierService {
	
	
	@Autowired
	DossierRepository dossierRepository;
	
	
	public Dossier save(Dossier dossier) {
		return dossierRepository.save(dossier);
	}
	
	
	public List findAll() {
		return (List) dossierRepository.findAll();
	}
	
}
