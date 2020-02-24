/**
 * 
 */
package fr.bpifrance.mendix.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.bpifrance.mendix.service.DossierService;
import io.swagger.annotations.Api;


@Api( description="API pour es opérations CRUD sur les dossiers.")
@RestController
@RequestMapping("/dossier")
public class DossierController {
	
	@Autowired
	DossierService applicationService;
	
}
