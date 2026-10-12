package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;
import java.util.List;

@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping
    public List<Agence> retrieveAllAgences() {
        return agenceService.retrieveAllAgences();
    }

    @PostMapping
    public Agence addAgence(@RequestBody Agence a) {
        return agenceService.addAgence(a);
    }

    @PutMapping
    public Agence updateAgence(@RequestBody Agence a) {
        return agenceService.updateAgence(a);
    }

    @GetMapping("/{id}")
    public Agence retrieveAgence(@PathVariable Long id) {
        return agenceService.retrieveAgence(id);
    }

    @DeleteMapping("/{id}")
    public void removeAgence(@PathVariable Long id) {
        agenceService.removeAgence(id);
    }
}
